import logo from './logo.svg';
import './App.css';
import LoginControl from './components/LoginControl';
import MailBox from './components/MailBox';
import Page1 from './components/Page1';
import Page from './components/Page';
import FlavorForm from './components/FlavorForm';
import NumberList2 from './components/NumberList2';
import Blog from './components/Blog';
import MouseTracker from './components/MouseTracker';
import NameForm from './components/NameForm';

const messages = ['react', 're: react', 're:re: react'];
function App() {
  return (
    <div className="App">
    <NameForm></NameForm>
    <Blog></Blog>
    <NumberList2></NumberList2>
    <FlavorForm></FlavorForm>
    <Page></Page>
    <MailBox unreadMsg = {messages}></MailBox>
    <LoginControl></LoginControl>
    {/* <MouseTracker></MouseTracker> */}
    </div>
  );
}

export default App;
