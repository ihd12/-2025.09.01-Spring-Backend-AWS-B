import { Route, Routes } from "react-router-dom";
import NoMatch from "./NoMatch";
import Board from "../pages/Board";
import Card from "./Card";
import Layout from "./Layout";
import LandingPage from "./LandingPage";

export default function RoutesSetup() {
  return (
    <Routes>
      <Route path="/" element={<Layout />}>
        <Route index element={<LandingPage />} />
        <Route path="/board" element={<Board />} />
        <Route path="/board/card/:cardid" element={<Card />} />
        <Route path="*" element={<NoMatch />} />
      </Route>
    </Routes>
  );
}
