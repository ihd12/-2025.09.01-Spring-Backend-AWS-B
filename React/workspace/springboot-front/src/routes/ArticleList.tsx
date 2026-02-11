// import { Link } from "react-router-dom";

// export default function ArticleList() {
//   return (
//     <div className="container">
//       <Link
//         type="button"
//         className="mb-3 btn btn-secondary btn-sm"
//         to="location.href='/logout'"
//       >
//         로그아웃
//       </Link>
//       <Link
//         authorize="isAnonymous()"
//         type="button"
//         className="mb-3 btn btn-secondary btn-sm"
//         to="location.href='/login'"
//       >
//         로그인
//       </Link>
//       <Link
//         type="button"
//         id="create-btn"
//         to="|location.href='@{/new-article}'|"
//         className="mb-3 btn btn-secondary btn-sm"
//       >
//         글 등록
//       </Link>

//       <form action="/articles" method="get">
//         <input type="hidden" name="size" value="${pageRequestDTO.size}" />
//         <div className="mb-3">
//           <select name="types">
//             <option value="t" selected="${pageRequestDTO.types == 't'}">
//               제목
//             </option>
//             <option value="c" selected="${pageRequestDTO.types == 'c'}">
//               내용
//             </option>
//             <option value="tc" selected="${pageRequestDTO.types == 'tc'}">
//               제목+내용
//             </option>
//           </select>
//           <input type="text" name="keyword" value="${pageRequestDTO.keyword}" />
//           <input type="submit" value="검색" />
//         </div>
//       </form>
//       <div className="row-6" each="item : ${articles.dtoList}">
//         <div className="card">
//           <div className="card-header" text="${item.id}"></div>
//           <div className="card-body">
//             <h5 className="card-title" text="${item.title}"></h5>
//             <p className="card-text" text="${item.content}"></p>
//             <a
//               href="|@{/articles/{id}(id=${item.id})}?${pageRequestDTO.getLink()}|"
//               className="btn btn-primary"
//             >
//               보러가기
//             </a>
//           </div>
//         </div>
//         <br />
//       </div>
//       <div className="float-end">
//         <ul className="flex-wrap pagination" if="${articles.totalElements>0}">
//           <li if="${articles.prev}" class="page-item">
//             <a className="page-link" th:data-num="${articles.start -1}">
//               이전
//             </a>
//           </li>
//           <li
//             each="num : ${#numbers.sequence(articles.start,articles.end)}"
//             th:className="page-item"
//             th:classappend="${num == articles.page} ? 'active'"
//           >
//             <a className="page-link" th:data-num="${num}">
//               [[${num}]]
//             </a>
//           </li>
//           <li if="${articles.next}" class="page-item">
//             <a className="page-link" th:data-num="${articles.end+1}">
//               다음
//             </a>
//           </li>
//         </ul>
//       </div>
//     </div>
//   );
// }
