import React, {Component} from 'react';
import logo from './logo.svg';
import './App.css';
import ReactDOM from 'react-dom';

const element1 = React.createElement(
  'h1',
  {className: 'greeting'},
  'hello, world!'
);

//함수 컴포넌트 타입 1
let WelCome = function(props){
  return <h1> hello, {props.name}</h1>;
}
//props는 속성을 나타내는 데이터입니다.
//이렇게 클래스형 컴포넌트도 가능. 컴포넌트는 기능이 더 있는 클래스형이 대세.
class WelCome2 extends React.Component{
  render(){
    return <h1>hello, {this.props.name}</h1>;
  }
}
//React element는 이렇게 사용자 정의 컴포넌트로도 나타낼 수 있고,
const element3 = <WelCome2 name="Sara"></WelCome2>;
/*
React가 사용자 정의 컴포넌트로 작성한 엘레먼트를 발견하면 JSX 속성과
자식을 해당 컴포넌트에 단일 객체로 전달. 이것을 props라고 한다.
*/
ReactDOM.render(element3, document.querySelector('#root2'));
/**
 * 이 예시에서 나오는 순서
 * 1. Welcome2 element3가지고 ReactDOM,render() 호출
 * 2. React는 name:sara를 props로 하여 Welcome Component call
 * 3. Welcome Comp, finally, return element;
 * 4. ReactDOM update to match element
 */

// 이 컴포넌트는 author, text, date등등을 props로 받은 후
//소셜미디어 웹 사이트의 코멘트를 나타낸다.
function Comment1(props) {
  return(
    <div className="Comment1">
      <div className="UserInfo">
        <UserInfo name={props.user}></UserInfo>
        <div className="Comment-text">
          {props.text}
        </div>
        <div className="Comment-date">
          {formDate(props.date)}
        </div>
      </div>
    </div>
  );  
}
//Avatar는 자신이 Comment 내에서 렌더링 돤다는것을 알 필요가 없어짐
//props의 이름으로 author에서 더욱 일반화된 user로 변경.ㅣ
function Avatar(props){
  return (
    <img className="Avatar" src={props.user.avatarUrl} alt={props.user.name}>
      
    </img>
  );
}
function UserInfo(props) {
  return (
    <div className="UserInfo">
      <Avatar user={props.user}></Avatar>
      <div className="UserInfo-name">
        {props.user.name}
      </div>
    </div>
  );
  
}


class TopMenu2 extends Component{
  render(){
    let lists = [];
    let data = this.props.data;
    let i=0;

    while(i<data.length){
      lists.push(
        <li key={data[i].no}>
          <a href={"/content/"+data[i].no}>{data[i].title}</a>
        </li>
      );
      i++;
    }
    return (
      <nav>
        <ul>
          {/* <li></li> */}
          {lists}
        </ul>
      </nav>
    );
  }
}


class App2 extends Component{

  render(){
    return(
      <div className="App2">
        {/*  */}
        {element1}
      </div>
    );
  }

}


// function App2() {
//   return (
//     <div className="App">
//       <header className="App-header">
//         {/* <img src={logo} className="App-logo" alt="logo" /> */}
//         <p>
//           수정된 <code>src/App2.js</code> 입니다.
//         </p>
//         <a
//           className="App-link"
//           href="App.js"
//           target="_blank"
//           rel="noopener noreferrer"
//         >
//           되돌아가기
//         </a>
//       </header>
//     </div>
//   );
// }

export default App2;
