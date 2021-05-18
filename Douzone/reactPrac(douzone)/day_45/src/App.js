import logo from './logo.svg';
import './App.css';
import { Component } from 'react';
import { render } from 'react-dom';


class ModuleEx extends Component{
  render(){
    return(
      <div className="ModuleEx">
        <div>헤더보다 위에 추가. Modulex returned</div>
      </div>
    )
  }
}

class MyInfo extends Component{
  render(){
    const name=  'xxx';
    const orgEl= <span>더존비즈온 채용연계 연수생 {name} 입니다.</span>;
    return(
      
      <div className="MyInfo">
        <div> MyInfo returned.</div>
        {orgEl}
      </div>
    )
  }
}

class BookStore extends Component {
  state = {price: 1, name: '', amount: 1, total:1};

  handleChange = (e) => {
    this.setState({
      [e.target.name]: e.target.value
    });
  }
  handleSubmit = (e) => {
    // 페이지 리로딩 방지
    e.preventDefault();
    // 상태값을 onCreate로 부모에게 전달...은 노 필요. 걍 실시간 변경으로 가자.
    // this.props.onCreate(this.state);
    alert("총액: "+this.state.price*this.state.amount+ "입니다. \n 이제 상태를 초기화 시킵니다.");
    // 상태 초기화
    this.setState({
      price: 0, name: '', amount: 0, total:0
    })
  }
  //안쓸란다
  // handleCreate = (data) => {
  //   console.log(data);
  // }

  render() {
    return (
      <div id="장바구니장바구니">
        <span>장바구니 장바구니</span>
      <form onSubmit={this.handleSubmit}>
        <input
          placeholder="도서명"
          value={this.state.name}
          onChange={this.handleChange}
          name="name"
        />
        <input
          placeholder="가격"
          value={this.state.price}
          onChange={this.handleChange}
          name="price"
        />
        <input
          placeholder="수량"
          value={this.state.amount}
          onChange={this.handleChange}
          name="amount"
        />
        <button type="submit">등록하고 초기화 ㄱㄱ</button>
        <div>총액: {this.state.price*this.state.amount} 입니다.</div>
      </form>
      </div>
    );
  }
}


function App() {
  return (
    <div className="App">
      <BookStore></BookStore>
      <ModuleEx></ModuleEx>
      <MyInfo></MyInfo>
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <p>
          Edit <code>src/App.js</code> and save to reload.
        </p>
        <a
          className="App-link"
          href="App2.js"
          target="_blank"
          rel="noopener noreferrer"
        >
          go to next page!
        </a>
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
