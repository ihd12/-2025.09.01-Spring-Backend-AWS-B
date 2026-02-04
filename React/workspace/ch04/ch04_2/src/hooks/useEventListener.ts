import { useEffect } from "react";

export const useEventListener = (
  target: EventTarget | null,
  type: string,
  callback: EventListenerOrEventListenerObject | null,
) => {
  useEffect(() => {
    target?.addEventListener(type, callback);
    return () => target?.removeEventListener(type, callback);
  }, [target, type, callback]);
};
