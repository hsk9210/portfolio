import React, {Component} from 'react';

class Clock extends Component{
    constructor(props){
        super(props);
        this.state = {
            date:new Date(),
            counter:0,
            posts: [],
            comments: []
        };
    }    

    //컴포넌트 출력물이 DOM에 렌더링 된 후에 실행.
    componentDidMount(){
        this.timerID = setInterval(() => {
            this.tick()
        }, 1000);
        // fetchPosts().then(response =>{
        //     this.setState({
        //         posts: response.posts
        //     });
        // })
    }
    //즉, 1초마다 setInterval이 tick()를 호출해서 초를 변경.
    //그리고 변경된 초가 setState()를 통해 state의 date에 저장.
    //그리고 이미 render()된 내부의 this.state.date는 
    //React가 렌더링 출력값을 일치시키려 조정하니 
    //DOM이 1초마다 업데이트되어 출력하게 된다.
    tick(){
        this.setState({
            date: new Date()
        });
    }
    //Clock에 의해 생성된 DOM이 삭제될 때마다 타이머를 해제.
    componentWillUnmount(){
        clearInterval(this.timerID);
    }
    
    render(){
        return (
            <div className="Clock">
                <h3>hel</h3>
                <h4>it is {this.state.date.toLocaleTimeString()}.</h4>
            </div>
        );
    }
}

export default Clock;