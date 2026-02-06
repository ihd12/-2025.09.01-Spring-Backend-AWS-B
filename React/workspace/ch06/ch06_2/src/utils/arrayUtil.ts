export const swapItemsInArray = <T>(
  array: T[],
  index1: number,
  index2: number,
) =>
  array.map((item, index) =>
    index === index1 ? array[index2] : index === index2 ? array[index1] : item,
  );
export const removeItemAtIndexArray = <T>(array: T[], removeIndex: number) =>
  array.filter((notUsed, index) => index !== removeIndex);

export const insertItemAtInArray = <T>(
  array: T[],
  insertIndex: number,
  item: T,
) => {
  const before = array.filter((item, index) => index < insertIndex);
  const after = array.filter((item, index) => index >= insertIndex);
  return [...before, item, ...after];
};
