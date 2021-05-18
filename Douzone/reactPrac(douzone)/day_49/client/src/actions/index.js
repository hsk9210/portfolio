import axios from 'axios';

//Action Type변수 정의
export const FETCH_TODOS = 'FETCH_TODOS';
export const ADD_TODO = "ADD_TODO";
export const REMOVE_TODO = "REMOVE_TODO";
export const TOGGLE_TODO = "TOGGLE_TODO";

const server_url = process.env.REACT_APP_APIURL;
//'http://localhost:4500/api/todos';

//Action 생성함수 정의
//4.Todo Update
export const toggleTodo = todo => {
    return (dispatch) => {
        axios.put(`${server_url}/${todo.id}`, todo)
            .then(res => {
                dispatch({
                    type: TOGGLE_TODO,
                    payload: res.data
                })
            })
            .catch(error => {
                console.log(error);
                throw (error);
            })
    }
}

//3.Todo 삭제
export const removeTodo = id => {
    return (dispatch) => {
        axios.delete(`${server_url}/${id}`)
            .then(res => {
                dispatch({
                    type: REMOVE_TODO,
                    payload: res.data
                })
            })
            .catch(error => {
                console.log(error);
                throw (error);
            })
    }
}
//2.Todo 등록
export const addTodo = (todo) => {
    return (dispatch) => {
        axios.post(server_url, todo)
            .then(res => {
                dispatch({
                    type: ADD_TODO,
                    payload: res.data
                })
            })
            .catch(error => {
                console.log(error);
                throw (error);
            })
    }
}

//1.Todo 목록
export const fetchAllTodos = () => {
    return (dispatch) => {
        axios.get(server_url)
            .then(res => {
                dispatch({
                    type: FETCH_TODOS,
                    payload: res.data
                });
            })
            .catch(error => {
                console.log(error);
                throw (error);
            })
    }
};