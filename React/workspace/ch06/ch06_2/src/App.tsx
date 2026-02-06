import { Provider as ReduxProvider } from "react-redux";
import { DndProvider } from "react-dnd";
import { HTML5Backend } from "react-dnd-html5-backend";
import { useStore } from "./store";
import Board from "./pages/Board";
import { BrowserRouter } from "react-router-dom";
import RoutesSetup from "./routes/RoutesSetup";

export default function App() {
  const store = useStore();
  return (
    <ReduxProvider store={store}>
      <DndProvider backend={HTML5Backend}>
        <BrowserRouter>
          <RoutesSetup />
        </BrowserRouter>
      </DndProvider>
    </ReduxProvider>
  );
}
