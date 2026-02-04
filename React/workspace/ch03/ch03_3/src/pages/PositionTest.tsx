import { Div, Title, Icon } from "../components";
import * as D from "../data";

const src = D.randomImage(1900, 500);

// prettier-ignore
export default function PositionTest() {
  const icons = ['home', 'search', 'settings', 'favorite'].map(name => (
    <Icon key={name} name={name} className="mr-2" />
  ))
  return (
    <section className="mt-4">
      <Title>PositionTest</Title>
      <Div className="relative border-2 border-gray-500" src={src} height="10rem">
        <Div className="absolute z-30 p-2 text-white bg-red-500" left="1rem" top="1rem">{icons}</Div>
        <Div className="absolute z-20 p-2 text-white bg-red-400" left="2rem" top="2rem">{icons}</Div>
        <Div className="absolute z-10 p-2 text-white bg-red-300" left="3rem" top="3rem">{icons}</Div>
        <Div className="absolute z-0 p-2 text-white bg-red-200" left="4rem" top="4rem">{icons}</Div>
      </Div>
    </section>
  )
}
