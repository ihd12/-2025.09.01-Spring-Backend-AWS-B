const createButtonJwtFetch = document.getElementById('create-btn-jwt');
if (createButtonJwtFetch) {
    createButtonJwtFetch.addEventListener('click', event => {
        // 데이터 설정
        body = JSON.stringify({
            title:document.getElementById("title").value,
            content : document.getElementById("content").value,
        });
        // 성공 함수
        function success(){
            alert("등록 완료되었습니다.");
            location.replace("/articles");
        }
        // 실패 함수
        function fail(){
            alert("등록 실패했습니다.");
            location.replace("/articles");
        }
        // JWT를 포함한 통신 함수를 실행
        httpRequest("POST", "/api/articles", body, success, fail);
    });
}
const deleteButtonJwtFetch = document.getElementById('delete-btn-jwt');
if (deleteButtonJwtFetch) {
    deleteButtonJwtFetch.addEventListener('click', event => {
        // 데이터 설정
        let id = document.getElementById("article-id").value;
        // 성공 함수
        function success(){
            alert("삭제가 완료되었습니다.");
            location.replace("/articles");
        }
        // 실패 함수
        function fail(){
            alert("삭제가 실패했습니다.");
            location.replace("/articles");
        }
        // JWT를 포함한 통신 함수를 실행
        httpRequest("DELETE", "/api/articles/"+id, null, success, fail);
    });
}
const modifyButtonJwtFetch = document.getElementById('modify-btn-jwt');
if (modifyButtonJwtFetch) {
    modifyButtonJwtFetch.addEventListener('click', event => {
        // 데이터 설정
        let params = new URLSearchParams(location.search);
        let id = params.get("id");
        body = JSON.stringify({
            title:document.getElementById("title").value,
            content : document.getElementById("content").value,
        });
        // 성공 함수
        function success(){
            alert("수정 완료되었습니다.");
            location.replace("/articles");
        }
        // 실패 함수
        function fail(){
            alert("수정 실패했습니다.");
            location.replace("/articles");
        }
        // JWT를 포함한 통신 함수를 실행
        httpRequest("PUT", "/api/articles", body, success, fail);
    });
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
// httpRequest( http통신메서드, 실행주소, 데이터, 성공함수, 실패함수)
function httpRequest(method, url, body, success, fail){
    fetch(url, {
        method:method,
        headers :{
            // JWT AccessToken 설정
            Authorization : "Bearer " + localStorage.getItem("access_token"),
            "Content-Type":"application/json",
        },
        body:body,
    }).then((response)=>{
        // 통신이 정상 처리된 경우 성공 함수 실행
        if(response.status===200 || response.state===201){
            return success();
        }
        const refresh_token = getCookie("refresh_token");
        // 통신이 실패하고 리프레시 토큰이 존재하는 경우의 if문
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
                // 통신이 정상처리시 json형식을 변경
                if(res.ok){
                    return res.json();
                }
            }).then((result)=>{
                // 로컬 스토리지에 새롭게 받은 엑세스 토큰을 저장
                localStorage.setItem("access_token", result.accessToken);
                httpRequest(method, url, body, success, fail);
            }).catch((error)=>fail());
        }else{
            return fail();
        }
    });
}



