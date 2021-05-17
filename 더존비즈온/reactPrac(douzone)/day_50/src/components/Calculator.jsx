import React from 'react';


class Calculator extends React.Component {
    constructor(props){
        super(props);
        this.handleChange = this.handleChange.bind(this);
        this.state = {
            temp: ''
        };
    }
    handleChange(e){
        this.setState({temp:e.target.value});
    }
    render(){
        const temp = this.state.temp;
        return (
            <fieldset>
                /
            </fieldset>
        );
    }

}

export default Calculator;

