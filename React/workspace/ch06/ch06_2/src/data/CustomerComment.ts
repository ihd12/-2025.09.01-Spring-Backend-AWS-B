import * as C from "./chance";
import * as I from "./image";

export type CustomerComment = {
  uuid: string;
  name: string;
  jobTitle: string;
  company: string;
  avatar: string;
  comment: string;
};

// prettier-ignore
export const makeCustomerComment = (
  uuid: string,
  name: string,
  jobTitle: string,
  company: string,
  avatar: string,
  comment: string,
): CustomerComment => ({ uuid, name, jobTitle, company, avatar, comment });
export const makeRandomCustomerComment = (): CustomerComment =>
  makeCustomerComment(
    C.randomUUID(),
    C.randomName(),
    C.randomJobTitle(),
    C.randomCompanyName(),
    I.randomAvatar(),
    C.randomParagraphs(1),
  );
