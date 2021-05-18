import React, {Component} from 'react';

function WarningBanner(props) {
    if (!props.warn) {
      return null;
    }
  
    return (
      <div className="warning">
        Warning! your fav fla is {props.value}; <br></br>
        if  U pick Lime and press Submit button, then this div will be closed.
      </div>
    );
}

class FlavorForm extends React.Component {
    constructor(props) {
      super(props);
      this.state = {
          value: 'coconut',
          flag: true
        };
  
      this.handleChange = this.handleChange.bind(this);
      this.handleSubmit = this.handleSubmit.bind(this);
    }

    handleChange(event) {
      this.setState({value: event.target.value});
    }
  
    handleSubmit(event) {
      if(this.state.value === 'Lime(Hide)'){
          this.setState({flag: false});
      } else if(this.state.value === 'grapefruit(show)'){
        this.setState({flag: true});
      }
        alert('Your favorite flavor is: ' + this.state.value);
      event.preventDefault();
    }
  
    render() {
      return (
        <div>
            <form onSubmit={this.handleSubmit}>
            <label>
                Pick your favorite flavor:
                <select value={this.state.value} onChange={this.handleChange}>
                <option value="grapefruit(show)">Grapefruit</option>
                <option value="Lime(Hide)">Lime</option>
                <option value="coconut">Coconut</option>
                <option value="mango">Mango</option>
                </select>
            </label>
            <input type="submit" value="Submit" />
            </form>
            <WarningBanner warn={this.state.flag} value={this.state.value}></WarningBanner>
        </div>
      );
    }
  }
  
export default FlavorForm;
