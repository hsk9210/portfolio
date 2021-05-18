
function NameForm(props) {
    //   constructor(props) {
    //     super(props);
    //     this.state = {value: ''};
    
    //     this.handleChange = this.handleChange.bind(this);
    //     this.handleSubmit = this.handleSubmit.bind(this);
    //   }
      let state = {value: ''};
    
     function handleChange(event) {
         state = event;
        //setState({value: event.target.value});
      }
    
     function handleSubmit(event) {
        alert('A name was submitted: ' + state.value);
        event.preventDefault();
      }
    
        return (
          <form onSubmit={()=>this.handleSubmit}>
            <label>
              Name:
              <input type="text" value={state.value} onChange={(e)=>handleChange(e)} />
            </label>
            <input type="submit" value="Submit" />
          </form>
        );
    
    }
    

export default NameForm;