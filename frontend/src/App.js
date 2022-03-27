import logo from './logo.svg';
import './App.css';
import ArticlePage from './pages/ArticlePage';
import CommentPage from './pages/CommentPage';
import CommunityPage from './pages/CommunityPage';
import Navi from './layouts/Navi';

function App() {
  return (
    <div className="App">
      <Navi/>
      <ArticlePage/>
      <CommentPage/>
      <CommunityPage/>
    </div>
  );
}

export default App;
