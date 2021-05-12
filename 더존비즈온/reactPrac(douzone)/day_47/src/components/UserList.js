import React, {useEffect} from 'react';

function User({user, onRemove, onToggle}) {
    const {username, email, id, active} = user;
    useEffect(() =>{
        console.log('component show');
        return (
            <div></div>
        );
    });
}