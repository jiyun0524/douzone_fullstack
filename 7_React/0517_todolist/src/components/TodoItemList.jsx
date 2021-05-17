// src/components/TodoItemList.jsx
import React, { Component } from 'react';
import TodoItem from './TodoItem';

class TodoItemList extends Component{
	render() {
		const { todos, onToggle, onRemove } = this.props;

		return (
			<div>
				<TodoItem text="하이"/>
				<TodoItem text="만나서"/>
				<TodoItem text="반갑습니뎅"/>				
			</div>
		)
	}
}

export default TodoItemList;