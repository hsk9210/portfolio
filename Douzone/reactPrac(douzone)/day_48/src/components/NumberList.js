
function ListItem(props) {
    return <li>{props.value}</li>;
}

const numbers = [5,4,3,2,1];
function NumberList(props) {
    const numbers = props.numbers;
    const listItems = numbers.map((num)=>(<ListItem key={num.toString()} value={num}></ListItem>));

    return(
        <ul>
            {listItems}
        </ul>
    );
}

function listDisplay(props) {
    return(
        <NumberList numbers={numbers}></NumberList>
    );    
}







export default listDisplay;