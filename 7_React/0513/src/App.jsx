// App.js
import React from 'react';
import { Switch, Route, Link } from 'react-router-dom';
import './css/basic.css';
import Home from './components/Home';
import About from './components/About';
import Profiles from './components/Profiles';
import HistorySample from './components/HistorySample';

const App = () => {
	return (
		<div>
			<ul>
				<li><Link to="/">Home</Link></li>
				<li><Link to="/about">About</Link></li>
				<li><Link to="/profiles">Profiles</Link></li>				
				<li><Link to="/history">History</Link></li>
			</ul>
			<hr />
			<Switch>
				<Route path="/" exact={true} component={Home} />
				<Route path="/about" component={About} />
				<Route path="/profiles" component={Profiles} />
				<Route path="/history" component={HistorySample} />
				<Route
					// pathë¥? ?”°ë¡? ? •?˜?•˜ì§? ?•Š?œ¼ë©? ëª¨ë“  ?ƒ?™©?— ? Œ?”ë§? ?¨?‹¹
					render={({ location }) => (
						<div>
							<h2>ì¡´ì¬?•˜ì§? ?•Š?Š” ?˜?´ì§? ?…?‹ˆ?‹¤ ?‚?‚?‚	</h2>
							<h4>{ location.pathname } </h4>
						</div>
					)}
				/>
			</Switch>
		</div>
	);
};

export default App;