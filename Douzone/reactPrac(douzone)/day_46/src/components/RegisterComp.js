import React, { Component, useState } from 'react';
import styled from 'styled-components';

/*
function RegisterComp() {
  const [text, setText] = useState('');
  
  const onChange = (e) => {
    setText(e.target.value)
  }

  const onClick1 = (e) => {
    setText(e.target.value)
  }

  const onReset = () => {
    setText('');
  }

  return (
    <div>
      <input onChange={onChange} value={text} placeholder="텍스트를 입력하세요!"/>
      <button onClick={onReset}>초기화</button>
      <div>
        <b>값: </b> {text}
      </div>
    </div>
  );
}
*/


const Wrapper = styled.div`
    margin-top: 1rem;
    padding-top: 0.6rem;
    padding-bottom: 0.5rem;

    color: white;

    text-align: center;
    font-size: 1.25rem;
    font-weight: 500;

    cursor: pointer;
    user-select: none;
    transition: .2s all;

    &:hover {
        
    }

    &:active {
        
    }

`;
const Input = styled.input`
    width: 100%;
    border: 1px solid gray;
    outline: none;
    border-radius: 0px;
    line-height: 2.5rem;
    font-size: 1.2rem;
    padding-left: 0.5rem;
    padding-right: 0.5rem;
`;

const Label = styled.div`
    font-size: 1rem;
    color: gray;
    margin-bottom: 0.25rem;
`;


const AuthButton = ({children, onClick}) => (
    <Wrapper onClick={onClick}>
        {children}
    </Wrapper>
);
////////////////////////


//////////////////////////////
// 두개가 함께 있을땐 상단 (그 사이) 에 여백을 준다

// rest 쪽에는 onChange, type, name, value, placeholder 등의 input 에서 사용 하는 값들을 넣어줄수 있다.
const InputWithLabel = ({label, ...rest}) => (
    <Wrapper>
        <Label>{label}</Label>
        <Input {...rest}/>
    </Wrapper>
);

/////////////////////////////

class RegisterComp extends Component {
    constructor(props){
        super(props);
        
        this.state = {
            name: "",
            nickName: "",
            password: ""
        }
        this.handleChange1 = this.handleChange1.bind(this);
        this.handleChange2 = this.handleChange2.bind(this);
        this.handleChange3 = this.handleChange3.bind(this);
        this.handleSubmit = this.handleSubmit.bind(this);
    }
    handleChange1(event) {
        this.setState({name: event.target.value});
    }
    handleChange2(event) {
        this.setState({nickName: event.target.value});
    }
    handleChange3(event) {
        this.setState({password: event.target.value});
    }
    
    handleSubmit(event) {
        alert('submitted: \n' +"이름: "+this.state.name +"\n 닉네임: "+this.state.nickName +"\n 비번비번: "+this.state.password);
        event.preventDefault();
    }
    display(){
        document.querySelector('#result').innerHTML = '123123w';        
    }


    render() {
        return (
            <div title="회원가입">
                <form id="info" onSubmit={this.handleSubmit}>
                
                <label>이름: <input type="text" value={this.state.name} onChange={this.handleChange} /> </label>
                <label>닉네임: <input type="text" value={this.state.nickName} onChange={this.handleChange} /> </label>                
                <label>비번: <input type="text" value={this.state.password} onChange={this.handleChange} /> </label>                
                    {/*  */}
                    <p>아래 styled-component 적용부분 3개만 작동. 위는안됨.</p>
                    <InputWithLabel onChange={this.handleChange1} value={this.state.name} label="이름" name="name" placeholder="name"/>
                    <InputWithLabel onChange={this.handleChange2} value={this.state.nickName} label="닉네임" name="nickName" placeholder="nickname"/>
                    <InputWithLabel onChange={this.handleChange3} value={this.state.password} label="비밀번호" name="password" placeholder="비밀번호" type="password"/>
                    
                    <div>
                        <b>값: </b> 이름 {this.state.name} 닉네임 {this.state.nickName} 비번 {this.state.password}
                    </div>
                    <div className="button">
                    <input type="submit" value="등록누르면 handleSubmit의 alert 작동."></input>
                    </div>
                </form>
                <div id="result">

                </div>
            </div>
        );
    }
    
}

export default RegisterComp;