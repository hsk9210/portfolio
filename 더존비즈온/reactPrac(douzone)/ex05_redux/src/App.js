import React from 'react';
import Counter from './components/Counter';
import Option from './components/Option';
import Button from './components/Button';


class App extends React.Component {
    constructor(props){
        super(props);
        this.state = {
            value:0,
            diff:1
        };
        this.onChange = this.onChange.bind(this);
        this.onIncrement = this.onIncrement.bind(this);
        this.onDecrement = this.onDecrement.bind(this);
    }
    onChange(diff){
        this.setState({diff:diff});
    }
    onIncrement(){
        this.setState(prevState=>({
            value: prevState.value + Number(this.state.diff)
        }));
    }
    onDecrement(){
        this.setState(prevState=>({
            value: prevState.value - Number(this.state.diff)
        }));
    }

    render(){
        return(
            <div className="App">
                <Counter value={this.state.value}></Counter>
                <Option diff={this.state.diff} onChange={this.onChange}></Option>
                <Button onIncrement={this.onIncrement} onDecrement={this.onDecrement}></Button>
            </div>
        );
    }

}

export default App;