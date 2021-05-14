import React, {Component} from 'react';

class Counter extends Component {


    render() {
        return (
            <div>
                <h3>Value : {this.props.value}</h3>
            </div>
        );
    }

}

export default Counter;