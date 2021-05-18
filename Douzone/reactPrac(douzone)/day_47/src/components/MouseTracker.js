import React, {Component} from 'react';
import cat from './cat.png';

class Cat extends React.Component {
    render() {
      const mouse = this.props.mouse;
      return (
        <img src={cat} style={{ position: 'absolute', left: mouse.x, top: mouse.y }} />
      );
    }
  }
  
  class Mouse extends React.Component {
    constructor(props) {
      super(props);
      this.handleMouseMove = this.handleMouseMove.bind(this);
      this.state = { x: 0, y: 0 };
    }
  
    handleMouseMove(event) {
      this.setState({
        x: event.clientX,
        y: event.clientY
      });
    }
  
    render() {
      return (
        <div style={{ height: '100vh' }} onMouseMove={this.handleMouseMove}>
  
          {/*
            <Mouse>가 무엇을 렌더링하는지에 대해 명확히 코드로 표기하는 대신,
            `render` prop을 사용하여 무엇을 렌더링할지 동적으로 결정할 수 있습니다.
          */}
          {this.props.render(this.state)}
        </div>
      );
    }
  }
  
  class MouseTracker extends React.Component {
    render() {
      return (
        <div>
          <h1>Move the mouse around!</h1>
          <Mouse render={mouse => (
            <Cat mouse={mouse} />
          )}/>
        </div>
      );
    }
  }


export default MouseTracker;