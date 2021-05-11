import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import App from './App';
import reportWebVitals from './reportWebVitals';
import Example from './components/Example';
import Clock from './components/Clock';
import CounterBtn from './components/CounterBtn';
import RegisterComp from './components/RegisterComp';
import ActionLink from './components/ActionLink';
import ToggleBtn from './components/ToggleBtn';
import LoginControl from './components/LoginControl';

ReactDOM.render(
  <React.StrictMode>
    {/* <RegisterComp></RegisterComp> */}
    <LoginControl isLoggedIn={true}></LoginControl>
    <ToggleBtn></ToggleBtn>
    <ActionLink></ActionLink>
    <Clock></Clock>
    <CounterBtn></CounterBtn>
    <Example></Example>
    <App />
  </React.StrictMode>,
  document.getElementById('root')
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
