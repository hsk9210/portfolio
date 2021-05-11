import React, {Component} from 'react';

class ToggleBtn extends React.Component{
    constructor(props){
        super(props);
        this.state = {
            isToggleOn: true
        };
        //To use 'this' in callback, binding is needed.
        this.handleClick = this.handleClick.bind(this);
        //ToggleBtn.handleClick을 바인딩하지 않고 onClick 전달하면,
        //호출될 때 this===undefined가 된다.
    }
    handleClick(){
        this.setState(state=>({
            isToggleOn: !state.isToggleOn
        }));
    };

    render(){
        return(
            <div className="ToggleBtn">
                <button onClick={this.handleClick}>{this.state.isToggleOn ? 'ON' : 'OFF'}</button>
            </div>

        );
    }

}

export default ToggleBtn;


