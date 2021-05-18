import React, { Component } from 'react';
import Form from './components/Form';
import TodoItemList from './components/TodoItemList';
import TodoListTemplate from './components/TodoListTemplate';

const initialTodos = new Array(500).fill(0).map(
  (item, idx) => ({ id: idx, text: `일정 ${idx}`, checked: true })
);

class App extends Component {

  render() {
    return (
      <div>
        <TodoListTemplate form={<Form />}>
          <TodoItemList />
        </TodoListTemplate>
      </div>
    );
  }
}

export default App;