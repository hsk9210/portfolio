import logo from './logo.svg';
import './App.css';
//for spring conn
import React, { useState, useEffect } from 'react';
import customAxios from './customAxios';

function App() {
  // IP주소 변수 선언
  const [ip, setIp] = useState('');
  // IP주소 값을 설정합니다.
  function callback(data) {
    setIp(data);
  }
  // 첫번째 렌더링을 다 마친 후 실행합니다.
  useEffect(
    () => {
      // 클라이언트의 IP주소를 알아내는 백엔드의 함수를 호출합니다.
      customAxios('/ip', callback);
    }, []
  );
  console.log("콜백으로 불러온 ip: "+ip);
  return (
    
    <div className="App">
      <header className="App-header">
      <div>
        이 기기의 IP주소는 {ip}입니다.
        </div>
        <img src={logo} className="App-logo" alt="logo" />
        <p>
          Edit <code>src/App.js</code> and save to reload.
        </p>
        <a
          className="App-link"
          href="https://reactjs.org"
          target="_blank"
          rel="noopener noreferrer"
        >
          Learn React
        </a>
        
      </header>
    </div>
  );
}

export default App;
