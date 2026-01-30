import { BrowserRouter, Route, Routes } from "react-router-dom";
import NoMatch from "./NoMatch";
import Home from "./Home";
import RouterSetup from "./RouterSetup";

function App() {
  return (
    <BrowserRouter>
      <RouterSetup />
    </BrowserRouter>
  );
}

export default App;
