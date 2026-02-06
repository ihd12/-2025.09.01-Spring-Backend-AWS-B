import * as L from "./localStroageP";

export const readObjectP = <T extends object>(key: string) => {
  return new Promise<T | null>((resolve, reject) => {
    L.readStringP(key)
      .then((value) => resolve(value ? JSON.parse(value) : null))
      .catch(reject);
  });
};

export const writeObjectP = (key: string, value: object) => {
  return L.writeStringP(key, JSON.stringify(value));
};
