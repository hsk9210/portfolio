import React, {Component} from 'react';

function ActionLink(){
    function handleClick(e){
        e.preventDefault();
        console.log('the link was clicked.');
        alert('the link was clicked.');
    }

    return (
        <a href="#" onClick={handleClick}>click me</a>
    );
}

export default ActionLink;