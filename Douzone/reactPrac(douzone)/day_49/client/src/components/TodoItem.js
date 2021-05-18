import React, { Component } from 'react'
import './TodoItem.css';
import { connect } from 'react-redux';
import { removeTodo, toggleTodo } from '../actions';

class TodoItem extends Component {
    shouldComponentUpdate(nextProps, nextState) {
        return this.props.checked !== nextProps.checked;
    }

    handleRemove = (id) => {
        this.props.removeTodo(id);
    }

    handleToggle = (todo) => {
        this.props.toggleTodo(todo);
    }

    render() {
        const { id, text, checked } = this.props;
        const { handleRemove, handleToggle } = this;

        return (
            <div className="todo-item" onClick={() => {
                const todo = { id, text, checked };
                todo.checked = !todo.checked;
                handleToggle(todo);
            }}>
                <div className="remove" onClick={(e) => {
                    //myToggle()이 실행되지 않도록
                    e.stopPropagation();
                    handleRemove(id);
                }}>&times;</div>
                <div className={`todo-text ${checked && 'checked'}`}>{text}</div>
                {
                    checked && (<div className='check-mark'>&#x2713;</div>)
                }
            </div>
        )
    }
}
export default connect(null, { removeTodo, toggleTodo })(TodoItem);