import { Component } from "react";
import React from 'react';


function Mailbox(props) {
    
    const unreadMsg =props.unreadMsg;
    return (
        <div id="MailBox">
            <h3>hel</h3>
            {unreadMsg.length >0 && <h3>you have {unreadMsg.length} unread massages.</h3>}
        </div>
    );
}

export default Mailbox;