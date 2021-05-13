// TodoList.js
import React from 'react';
import styled from 'styled-components';
import TodoItem from './TodoItem';

const TodoListBlock = styled.div`
	
	flex: 1;
	padding: 20px 32px 48px 32px;
	overflow-y: auto;
	background-color: lightblue;
	/* => 사이즈 조정을 확인하기 위한 임시 스타일  */
`;

function TodoList() {
	return (
	<TodoListBlock>
		<TodoItem text="리액트 강의 보기" done={false}/>
		<TodoItem text="todo list 실습하기" done={true}/>
		<TodoItem text="블로그에 포스팅 하기" done={false}/>
		<TodoItem text="개인 과제 구상하기" done={false}/>
		<TodoItem text="게시판 프로젝트" done={false}/>		
	</TodoListBlock>
	);
}

export default TodoList;