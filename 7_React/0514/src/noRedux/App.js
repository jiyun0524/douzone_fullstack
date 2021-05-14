// App.js
import React, { Component } from 'react';
import Counter from './componets/Counter';
import Button from './componets/Button';
import Option from './componets/Option';

class App extends Component {
	constructor(props){
		super(props);
		this.state = { value: 0, diff : 1 };
		this.onChange = this.onChange.bind(this);
		this.onIncrement = this.onIncrement.bind(this);
		this.onDecrement = this.onDecrement.bind(this);
	}

	onChange(diff){
		this.setState({diff: diff});
	}
	onIncrement(){
		this.setState(prevState => ({
			value: prevState.value + Number(this.state.diff)
		}));
	}
	onDecrement(){
		this.setState(prevState => ({
			value: prevState.value - Number(this.state.diff)
		}));
	}

	render(){
		return(
			<div>
				<Counter value={this.state.value} />
				<Option diff={this.state.diff}  onChange={this.onChange} />
				<Button onIncrement={this.onIncrement} onDecrement={this.onDecrement} />
			</div>
		);
	}
}

export default App;














