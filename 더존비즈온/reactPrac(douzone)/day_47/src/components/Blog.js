import React, {Component} from 'react';

const posts = [
    {id: 1, title: 'Hello World', content: 'Welcome to learning React!'},
    {id: 2, title: 'Installation', content: 'You can install React from npm.'}
  ];

function Blog(props) {
    const sidebar= (
        <ul>
            {props.posts.map((post)=>(
                <li key={post.id}>{post.title}</li>
            ))}
        </ul>
    );
    const content = props.posts.map((post)=>(
        <div key={post.id}>
            <h3>{post.title}</h3>
            <p>{post.content}</p>
        </div>
    ));
    return (
        <div className="Blog">
            {sidebar}
            <hr></hr>
            {content}
        </div>
    );
}


function BlogDisplay(props) {
    return (
        <Blog key={posts.id} posts={posts}></Blog>
    );
}


export default BlogDisplay;