import {Component} from 'react';

function formatDate(date) {
    return date.toLocaleDateString();
}
function Avatar(props) {
    return (
        <img 
        className="Avatar"
        src={props.user.avatarUrl}
        alt={props.user.name}
        ></img>
    );
}
function UserInfo(props) {
    return (
        <div className="UserInfo">
            <Avatar user={props.user}></Avatar>
            <div className="UserInfo-name">{props.user.name}</div>
        </div>
    );
}
function Comment(props) {
    return (
        <div className="Comment">
            <UserInfo user={props.author}></UserInfo>
            <div className="Comment-text">{props.text}</div>
            <div className="Comment-date">{formatDate(props.date)}</div>
        </div>
    );
}

const comment = {
    date: new Date(),
    text: 'React 배우는 중...',
    author: {
        name: '야옹이 1 사진 테스트.',
        avatarUrl: 'https://placekitten.com/g/64/64'
    }
};

class App4 extends Component{
    render(){
        let data1 = comment;

        return (
            <Comment 
                date={data1.date} 
                text={data1.text} 
                author={data1.author}
            ></Comment>
        );
    }
}




export default App4;