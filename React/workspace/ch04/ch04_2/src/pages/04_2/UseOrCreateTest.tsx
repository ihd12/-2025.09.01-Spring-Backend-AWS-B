import { useOrCreate } from "./useOrCreate";
import * as D from "../../data";
import { Avatar, Title } from "../../components";
import { useState } from "react";

export default function UseOrCreateTest() {
  // useOrCreate의 cache변수에 headTexts이름으로 데이터를 저장
  const headTexts = useOrCreate<string[]>("headTexts", () => [
    "NO",
    "NAME",
    "JOB TITLE",
    "EMAIL ADDRESS",
  ]);
  // useOrCreate의 cache변수에 users이름으로 유저데이터 100개를 저장
  const users = useOrCreate<D.IUser[]>("users", () =>
    D.makeArray(100).map(D.makeRandomUser),
  );
  // headTexts에 있는 데이터로 테이블 헤더 cache에 저장
  const head = useOrCreate("head", () =>
    headTexts.map((text) => <th key={text}>{text}</th>),
  );
  // users에 있는 데이터로 유저 100명분의 테이블 데이터 cache에 저장
  const body = useOrCreate("children", () =>
    users.map((user, index) => (
      <tr key={user.uuid}>
        <th>{index + 1}</th>
        <td className="flex items-center">
          <Avatar src={user.avatar} size="1.5rem" />
          <p className="ml-2">{user.name}</p>
        </td>
        <td>{user.jobTitle}</td>
        <td>{user.email}</td>
      </tr>
    )),
  );
  const [count, setCount] = useState(0);
  const handlePlus = () => {
    setCount(count + 1);
  };
  return (
    <div className="mt-4">
      <Title>UseOrCreateTest</Title>
      <p>
        {count}
        <button className="btn btn-primary" onClick={handlePlus}>
          더하기
        </button>
      </p>
      <div className="p-4 mt-4 overflow-x-auto">
        <table className="table w-full table-zebra table-compact">
          <thead>
            <tr>{head}</tr>
          </thead>
          <tbody>{body}</tbody>
        </table>
      </div>
    </div>
  );
}
