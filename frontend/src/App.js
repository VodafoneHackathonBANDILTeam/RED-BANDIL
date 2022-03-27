import logo from './logo.svg';
import './App.css';
import ArticlePage from './pages/ArticlePage';
import CommentPage from './pages/CommentPage';
import CommunityPage from './pages/CommunityPage';
import Navi from './layouts/Navi';
import Dashboard from './layouts/Dashboard';
import { Container } from 'react-bootstrap';

function App() {
  return (
    <div className="App">
      <Navi />
      <Container className="main">
        <Dashboard />
      </Container>
      </div>
  );
  
}

export default App;
