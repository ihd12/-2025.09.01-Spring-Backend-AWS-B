const axiosDeleteBtn2 = document.getElementById('axios-delete-btn2');
if (axiosDeleteBtn2) {
    axiosDeleteBtn2.addEventListener("click", async (event) => {
        try {
            let id = document.getElementById('article-id').value;
            const response = await axios.delete(`/api/articles/${id}`);
            alert("삭제가 완료되었습니다.");
            location.replace("/articles");
        } catch (error) {
            console.log(error);
            alert("삭제에 실패했습니다.");
        }
    })
}
const modifyButton2 = document.getElementById('modify-btn2');
if (modifyButton2) {
    modifyButton2.addEventListener('click', async (event) => {
        let params = new URLSearchParams(location.search);
        let id = params.get('id');
        try {
            // axios는 기본 설정이 json통신이기 때문에
            // Content-Type, JSON.stringify 생략 가능
            await axios.put(`/api/articles/${id}`, {
                title: document.getElementById('title').value,
                content: document.getElementById('content').value
            })
            alert('수정이 완료되었습니다.');
            location.replace(`/articles/${id}`);
        } catch (error) {
        }
    })
}
const createButton2 = document.getElementById('create-btn2');
if (createButton2) {
    createButton2.addEventListener('click', async (event) => {
        try {
            await axios.post(`/api/articles`, {
                title: document.getElementById('title').value,
                content: document.getElementById('content').value
            })
            alert('등록이 완료되었습니다.');
            location.replace(`/articles`);
        } catch (error) {
        }
    })
}
// 파일과 함께 업로드
const createButton3 = document.getElementById('create-btn3');
if (createButton3) {
    createButton3.addEventListener('click', event => {
        // 파일 데이터를 전송하기 위한 FormData객체 생성
        const formData = new FormData();
        // FormData에 title, content 데이터 저장
        formData.append("title", document.getElementById('title').value);
        formData.append("content", document.getElementById('content').value);
        // 파일 데이터의 경우 list형식임으로 반복문으로 데이터를 꺼내어 저장
        const fileInput = document.getElementById('files');
        if (fileInput.files.length > 0) {
            for (let i = 0; i < fileInput.files.length; i++) {
                formData.append('files', fileInput.files[i]);
            }
        }
        fetch(`/api/articles`, {
            method: 'POST',
            body: formData
        }).then(() => {
            alert('등록이 완료되었습니다.');
            location.replace(`/articles`);
        })
    })
}
const modifyButton3 = document.getElementById('modify-btn3');
if (modifyButton3) {
    let params = new URLSearchParams(location.search);
    let id = params.get('id');
    modifyButton3.addEventListener('click', async(event)=>{
        // 파일 데이터를 전송하기 위한 FormData객체 생성
        let formData = new FormData();
        // FormData에 title, content 데이터 저장
        formData.append("title", document.getElementById('title').value);
        formData.append("content", document.getElementById('content').value);
        // 파일 데이터의 경우 list형식임으로 반복문으로 데이터를 꺼내어 저장
        let fileInput = document.getElementById('files');
        if(fileInput.files.length > 0){
            for(let i=0; i<fileInput.files.length; i++){
                formData.append('files', fileInput.files[i]);
            }
        }
        try{
            await axios.put(`/api/articles/${id}`, formData);
            alert('수정이 완료되었습니다.');
            location.href=`/articles/${id}`; // 상세보기 화면으로 이동
        }catch (error){
            console.log(error);
        }
    })
    document.querySelectorAll(".img-fluid").forEach(img=> {
        img.addEventListener('click'
            , async (event) => {
                event.preventDefault();
                event.stopPropagation();
                if (confirm('이미지를 삭제하시겠습니까? 되돌릴 수 없습니다.')) {
                    try {
                        await axios.delete(`/api/img/${id}`, {
                            data: {uuid: event.target.dataset.src}
                        })
                        event.target.remove();
                    } catch (error) {
                        console.log(error);
                    }
                }
            })
    })
}
function getCookie(key){
    var result = null;
    var cookie = document.cookie.split(";");
    cookie.some(function(item){
        item = item.replace(" ","");
        var dic = item.replace("=");
        if(key===dic[0]){
            result = dic[1];
            return true;
        }
    });
    return result;
}
function httpRequest(method, url, body, success, fail){
    fetch(url, {
        method:method,
        headers :{
            Authorization : "Bearer " + localStorage.getItem("access_token"),
            "Content-Type":"application/json",
        },
        body:body,
    }).then((response)=>{
        if(response.status===200 || response.state===201){
            return success();
        }
        const refresh_token = getCookie("refresh_token");
        if(response.status===401 && refresh_token){
            fetch("/api/token", {
                method:"POST",
                headers:{
                    Authorization :"Bearer " + localStorage.getItem("accessToken"),
                    "Content-Type":"application/json",
                },
                body:JSON.stringify({
                    refreshToken : getCookie("refresh_token"),
                }),
            }).then((res)=>{
                if(res.ok){
                    return res.json();
                }
            }).then((result)=>{
                localStorage.setItem("access_token", result.accessToken);
                httpRequest(method, url, body, success, fail);
            }).catch((error)=>fail());
        }else{
            return fail();
        }
    });
}



