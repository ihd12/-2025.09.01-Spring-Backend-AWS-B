// import { Link } from "react-router-dom";

// export default function NewArticle() {
//   return (
//     <div className="row">
//       <div className="col-lg-8">
//         <article>
//           <input type="hidden" id="article-id" value="${article.id}" />
//           <header className="mb-4">
//             <input
//               type="text"
//               className="form-control"
//               placeholder="제목"
//               id="title"
//               value="${article.title}"
//             />
//           </header>
//           <section className="mb-5">
//             <textarea
//               className="form-control h-25"
//               rows={10}
//               placeholder="내용"
//               id="content"
//               text="${article.content}"
//             ></textarea>
//           </section>
//           <section className="mb-5">
//             <input
//               type="file"
//               name="files"
//               id="files"
//               className="form-control"
//               multiple
//             />
//           </section>
//           <section className="mb-5">
//             <p className="mb-4 fs-5" each="image : ${article.images}">
//               <img
//                 src="|@{/file/{fileName}(fileName=${image.uuid})}|"
//                 alt="${image.fileName}"
//                 className="img-fluid"
//                 th:data-src="${image.uuid}"
//               />
//             </p>
//           </section>
//           <button
//             type="button"
//             id="modify-btn3"
//             className="btn btn-primary btn-sm"
//           >
//             수정(파일)
//           </button>
//           <button
//             type="button"
//             id="create-btn-jwt"
//             className="btn btn-primary btn-sm"
//           >
//             등록(JWT)
//           </button>
//           <Link
//             to="/articles?${pageRequestDTO.link}"
//             className="btn btn-secondary btn-sm"
//           >
//             목록보기
//           </Link>
//         </article>
//       </div>
//     </div>
//   );
// }
