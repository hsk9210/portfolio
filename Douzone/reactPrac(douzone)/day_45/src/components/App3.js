import React, {Component} from 'react';
import ReactDOM from 'react-dom';

const element1 = React.createElement(
  'h1',
  {className: 'greeting'},
  'hello, world!'
);

let tick = function(){
  const element = (
    <div>
      <h1>hell world</h1>
      <h2> it is{new Date().toLocaleTimeString()}</h2>
    </div>
  );
    // highlight-next-line
    ReactDOM.render(element, document.getElementById('root2'));
};



class App3 extends Component{

  render(){
    return(
      <div className="App3">
        {/*  */}
        {element1}
        {setInterval(tick(), 1000)}
      </div>
    );
  }

}



export default App3;
