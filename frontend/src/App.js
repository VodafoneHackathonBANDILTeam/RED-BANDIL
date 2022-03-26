import logo from './logo.svg';
import './App.css';
import ArticlePage from './pages/ArticlePage';
import CommentPage from './pages/CommentPage';
import CommunityPage from './pages/CommunityPage';
import GamerPage from './pages/GamerPage';

function App() {
  return (
    <div className="App">
      <ArticlePage/>
      <CommentPage/>
      <CommunityPage/>
      <GamerPage/>
    </div>
  );
}

export default App;
