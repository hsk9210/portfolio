import {Component} from 'react';
import React from 'react';
import ReactDOM from 'react-dom';

class Clock extends React.Component{
    constructor(props){
        super(props);
        this.state = {date: new Date()};
    }
    //생명주기 메소드1.
    //컴포넌트 출력물이 DOM에 랜더링된 후에 실행.
    componentDidMount(){
        this.timerID = setInterval(() => {
            this.tick()
        }, 1000);
    }
    //매초마다 작동하게 될 tick.
    //컴포넌트 로컬 state를 업데이트하니 this.setState()
    tick(){
        this.setState({date:new Date()});
    }
    //생명주기 메소드2.
    //생명주기 안에 있는 타이머를 분해한다.
    componentWillUnmount(){
        clearInterval(this.timerID);
    }


    render(){
        return (
            <div>
                <h2> clock components</h2>
                <h3>it's {this.state.date.toLocaleTimeString()}</h3>
            </div>
        );
    }
}

// function Clock(props){
//     const element = (
//         <div>
//             <h2>Hell</h2>
//             <h3>it is {props.date.toLocaleTimeString()}</h3>
//         </div>
//     );
//     //ReactDOM.render(element, document.querySelector('#root4'));
//     return element;
// };
// setInterval(() => {
//     Clock
// }, 1000);

export default Clock;