// Button.js

import React, { Component } from 'react';

class Button extends Component {
	constructor(props){
		super(props);
		this.onIncrement = this.onIncrement.bind(this);
		this.onDecrement = this.onDecrement.bind(this);
	}

	onIncrement(e) {
		this.props.onIncrement();
	}
	
	onDecrement(e) {
		this.props.onDecrement();
	}

	render(){
		return(
			<div>
				<button onClick={this.onIncrement} >+</button>
				<button onClick={this.onDecrement} >-</button>
			</div>
		);
	}
}
export default Button;









