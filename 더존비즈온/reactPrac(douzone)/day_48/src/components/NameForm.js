import React, { useState } from 'react';


class NameForm extends React.Component {
    constructor(props) {
      super(props);
      this.state = {value: ''};
  
      this.handleChange = this.handleChange.bind(this);
      this.handleSubmit = this.handleSubmit.bind(this);
    }
  
    handleChange(event) {
      this.setState({value: event.target.value});
    }
  
    handleSubmit(event) {
        event.preventDefault();
      alert('A name was submitted: ' + this.state.value);
      
    }
  
    render() {
      return (
        <form onSubmit={this.handleSubmit}>
          <label>
            Name:
            <input type="text" value={this.state.value} onChange={this.handleChange} />
          </label>
          <input type="submit" value="Submit" />
        </form>
      );
    }
  }

// NameForm.prototype.handleChange = function(e){
//     this.setState({value: e.target.value});
// };
// NameForm.prototype.handleSubmit= function(e) {
//     console.log('submitted: '+this.state.value);
// }




export default NameForm;