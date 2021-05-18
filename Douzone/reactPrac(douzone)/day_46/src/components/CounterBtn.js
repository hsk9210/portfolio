import React, {Component} from 'react';

class CounterBtn extends Component{
    constructor(props){
        super(props);
        this.state = {
            count:0
        };
    }
    btnCounter(){
        this.setState({count: this.state.count+1});
        /*
        this.setState((state,props)=>{
            counter: state.counter + props.increment;
        });
        */
    }
    componentDidMount(){

    }
    componentWillUnmount(){
        this.setState({count: 0});
    }

    render(){
        return (
            <div className="CounterBtn">
                <span>이 컴포넌트는 CounterBtn 컴포넌트.</span>
                <p>You clicked {this.state.count} times</p>
                <button onClick={() => this.btnCounter()}>
                    클릭해라.
                </button>
            </div>
        );
    }

}







export default CounterBtn;