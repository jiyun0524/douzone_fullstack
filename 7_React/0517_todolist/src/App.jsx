// src/App.jsx
import React, { Component } from 'react';
import TodoListTemplate from './components/TodoListTemplate';
import Form from './components/Form';

class App extends Component {
	render() {
		return (
			<TodoListTemplate form={<Form />}>
				제가....보이시나요........~~~
			</TodoListTemplate>
		)
	}
}

export default App;