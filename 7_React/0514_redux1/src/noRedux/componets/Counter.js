// Counter.js
import React, { Component } from 'react';

class Counter extends Component {
	render(){
		return(
			<div><h1>Value : { this.props.value } </h1></div>
		);
	}
}

export default Counter;