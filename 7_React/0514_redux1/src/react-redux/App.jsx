// src/react-redux/App.js
import React, { Component } from 'react';
import Counter from './Counter'; 
import Option from './Option'; 
import Button from './Button'; 

class App extends Component { 
	render() { 
		return ( 
		<div> 
			<Counter /> 
			<Option /> 
			<Button /> 
		</div> 
		); 
	} 
} 
export default App;
