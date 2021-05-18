import { Component } from "react";
import React from 'react';

function UserGreeting(props) {
    return <h1>Welcome back!</h1>;
  }
  
  function GuestGreeting(props) {
    return <h1>Please sign up.</h1>;
  }
  function Greeting(props) {
    const isLoggedIn = props.isLoggedIn;
    if (isLoggedIn) {
      return <UserGreeting />;
    }
    return <GuestGreeting />;
  }
///////////////////////////
function InputTag(props) {
    const inputData = props.inputData;
    return (
        <div>
            <label><input type="text" name="input"/></label>
            <input type="submit" value="제출"></input>
            <span>{inputData}</span>
        </div>
    );
}

function LoginButton(props) {
    return (
        <button onClick={props.onClick}>
            Login
        </button>
    );
}
function LogoutButton(props) {
    return (
        <button onClick={props.onClick}>
            Logout
        </button>
    );
}

class LoginControl extends React.Component {
    constructor(props){
        super(props);
        this.state = {
            isLoggedIn: false
        };
        this.handleLoginClick = this.handleLoginClick.bind(this);
        this.handleLogoutClick = this.handleLogoutClick.bind(this);
    }
    handleLoginClick(){
        this.setState({isLoggedIn: true});
    }
    handleLogoutClick(){
        this.setState({isLoggedIn: false});
    }

    render() {
        const isLoggedIn = this.state.isLoggedIn;
        let button;
        if(isLoggedIn){
            button = <LogoutButton onClick={this.handleLogoutClick}></LogoutButton>
        } else {
            button = <LoginButton onClick={this.handleLoginClick}></LoginButton>
        }
        return (
            <div className="LoginControl">
                
                

                <InputTag></InputTag>
                <Greeting isLoggedIn={isLoggedIn}></Greeting>
                {button}
            </div>
        );
    }
}

export default LoginControl;