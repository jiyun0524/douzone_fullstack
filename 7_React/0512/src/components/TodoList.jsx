// TodoList.js
import React from 'react';
import styled from 'styled-components';
import TodoItem from './TodoItem';

const TodoListBlock = styled.div`
	
	flex: 1;
	padding: 20px 32px 48px 32px;
	overflow-y: auto;
	background-color: lightblue;
	/* => ?��?���? 조정?�� ?��?��?���? ?��?�� ?��?�� ?��????��  */
`;

function TodoList() {
	return (
	<TodoListBlock>
		<TodoItem text="리액?�� 강의 보기" done={false}/>
		<TodoItem text="todo list ?��?��?���?" done={true}/>
		<TodoItem text="블로그에 ?��?��?�� ?���?" done={false}/>
		<TodoItem text="개인 과제 구상?���?" done={false}/>
		<TodoItem text="게시?�� ?��로젝?��" done={false}/>		
	</TodoListBlock>
	);
}

export default TodoList;