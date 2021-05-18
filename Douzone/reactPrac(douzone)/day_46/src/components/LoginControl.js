import React, {Component} from 'react';

function UserGreeting(props) {
    return <h4>Welcome back!</h4>;
  }
  
  function GuestGreeting(props) {
    return <h4>Please sign up.</h4>;
  }

function LoginControl(props) {
    const isLoggedIn = props.isLoggedIn;
    if (isLoggedIn) {
      return <UserGreeting />;
    }
    return <GuestGreeting />;
}

/*
class LoginControl extends React.Component{
    constructor(props){
        super(props);
        this.state = {
            isLoggedIn: true
        };
        this.loginchk = this.loginchk.bind(this);
    }

    UserGreeting(props) {
        return <h1>welcome back!</h1>;
    }
     GuestGreeting(props){
        return <h2>please sign up.</h2>;
    }

    loginchk(isLoggedIn){
        if(isLoggedIn){
            return <UserGreeting></UserGreeting>;
        } else{
            return <GuestGreeting></GuestGreeting>;
        }
    }   
    render(){

        return(
            <div id="LoginControl">
                                
            </div>
        );
    }
}
*/


export default LoginControl;