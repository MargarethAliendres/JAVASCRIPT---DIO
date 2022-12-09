import {
  BrowserRouter as Router,
  Routes,
  Route,
} from "react-router-dom";
import { Feed } from "./pages/feed";

import { Home } from './pages/home'
import { Login } from './pages/login'
import { GlobalStyle } from './styles/global';

function App() {
  return (
    <Router>
     <GlobalStyle />
     <Routes>                                                        {/* todo componente criado dentro de pages tem que criar uma rota aqui*/}
        <Route path="/" element={<Home />} />
        <Route path="/login" element={<Login />} />
        <Route path="/feed" element={<Feed />} />
        
     </Routes >
    </Router>
  );
}

export default App;


/*esse codigo acima que faz o roteamento entre as paginas*/