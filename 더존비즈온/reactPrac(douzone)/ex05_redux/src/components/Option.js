import React, { Component } from "react";


class Option extends Component{
    constructor(props){
        super(props);
        this.onChange = this.onChange.bind(this);
    }
    onChange(e){
        this.props.onChange(e.target.value);
    }

    render(){
        return (
            <div className="Option">
                <input value={this.props.diff} onChange={this.onChange}></input>
            </div>
        );
    }
}

export default Option;