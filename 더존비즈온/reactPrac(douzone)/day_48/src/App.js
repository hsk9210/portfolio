import logo from './logo.svg';
import './App.css';
import React, {Component} from 'react';
import {
  BrowserRouter as Router,
  Switch,
  Route,
  Link,
  useRouteMatch,
  useParams
} from "react-router-dom";
import Blog from './components/Blog';
import Page from './components/Page';
import Topic from './components/Topic';
import Topics from './components/Topics';
import SSS from './components/SSS';
import About from './components/About';
import Home from './components/Home';
import Test1 from './components/Test1';
import NumberList from './components/NumberList';
import NameForm from './components/NameForm';
import Reservation from './components/Reservation';





function App() {
  return (
    <Router>
    <br></br>
    <br></br>
    <br></br>
    <br></br>
    <br></br>
    <br></br>
    <br></br>
    <br></br>
    <br></br>
      <div>
        <ul>
          <li>
            <Link to="/numberlist">NumberList</Link>
          </li>  
          <li>
            <Link to="/reservation">reservation</Link>
          </li>   
          <li>
            <Link to="/nameform">NameForm</Link>
          </li>     
          <li>
            <Link to="/sss">SSS</Link>
          </li>
          <li>
            <Link to="/about">About</Link>
          </li>
          <li>
            <Link to="/topics">Topics</Link>
          </li>
          <li>
            <Link to="/blog">Blog</Link>
          </li>
          <li>
            <Link to="/page">Page</Link>
          </li>
          <li>
            <Link to="/test1">Test1</Link>
          </li>
          <li>
            <Link to="/">Home</Link>
          </li>
          
        </ul>

        <Switch>
          <Route path="/reservation">
            <Reservation />
          </Route>
          <Route path="/nameform">
            <NameForm />
          </Route>
          <Route path="/about">
            <About />
          </Route>
          <Route path="/topics">
            <Topics />
          </Route>
          <Route path="/blog">
            <Blog />
          </Route>
          <Route path="/sss">
            <SSS />
          </Route>
          <Route path="/page">
            <Page />
          </Route>
          <Route path="/test1">
            <Test1 />
          </Route>
          <Route path="/numberlist">
            <NumberList />
          </Route>
          <Route exact path="/">
            <Home />
          </Route>          
        </Switch>
      </div>
    </Router>
  );
}

export default App;
