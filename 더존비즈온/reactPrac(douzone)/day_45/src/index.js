import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import App from './App';
import reportWebVitals from './reportWebVitals';
import App2 from './App2';
import App3 from './components/App3';
import App4 from './components/App4';
import Clock from './components/Clock';

ReactDOM.render(<Clock></Clock>,document.querySelector('#root4'));

let tick = function() {
  const element = (
    <div>
      <h1>Hello, world!</h1>
      <h2>It is {new Date().toLocaleTimeString()}.</h2>
    </div>
  );
  // highlight-next-line
  ReactDOM.render(element, document.getElementById('root2'));
}
setInterval(tick, 1000);

ReactDOM.render(
  <React.StrictMode>
    <App2></App2>
    <App4></App4>
    <App />
  </React.StrictMode>,
  document.getElementById('root')
);



// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
