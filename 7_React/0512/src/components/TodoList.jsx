// TodoList.js
import React from 'react';
import styled from 'styled-components';
import TodoItem from './TodoItem';

const TodoListBlock = styled.div`
	
	flex: 1;
	padding: 20px 32px 48px 32px;
	overflow-y: auto;
	background-color: lightblue;
	/* => ?¬?΄μ¦? μ‘°μ ? ??Έ?κΈ? ?? ?? ?€????Ό  */
`;

function TodoList() {
	return (
	<TodoListBlock>
		<TodoItem text="λ¦¬μ‘?Έ κ°μ λ³΄κΈ°" done={false}/>
		<TodoItem text="todo list ?€?΅?κΈ?" done={true}/>
		<TodoItem text="λΈλ‘κ·Έμ ?¬?€? ?κΈ?" done={false}/>
		<TodoItem text="κ°μΈ κ³Όμ  κ΅¬μ?κΈ?" done={false}/>
		<TodoItem text="κ²μ? ?λ‘μ ?Έ" done={false}/>		
	</TodoListBlock>
	);
}

export default TodoList;