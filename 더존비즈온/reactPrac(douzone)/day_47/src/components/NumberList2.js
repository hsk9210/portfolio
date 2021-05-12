import {Component} from 'react';
import { render } from 'react-dom';

/*
function mapcon(props) {
    const numtest = [1,2,3,4,5];
    const listItems=  numtest.map((numtest)=>{
        return <li>{numtest} {props.entries}</li>
    });
    console.log(listItems[2].props.children[0]);    
// const dd = numtest.map(function(a){
//     return a*2;
// });
    return listItems;  
}
*/
// const todoItems = todos.map((todo1)=>
//     <li key={todo1.id}>
//         {todo1.text}
//     </li>
// );

const numbers = [1, 2, 3, 4, 5];

function NumberList(props) {
    const numbers = props.numbers;
    const listItems = numbers.map((number) => { 
        return <li key={number.toString()}> {number}</li> 
    });
    
    return (
        <div>
            <ul>
                {listItems}
            </ul>
        </div>
    );    
}



class NumberList2 extends Component {
    constructor(props){
        super(props);
    }
    render(){
        return (
            <div>
                <NumberList numbers={numbers}></NumberList>
            </div>
        );
    }
}


export default NumberList2;