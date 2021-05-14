// TodoList.js
import React from 'react';
import styled from 'styled-components';
import TodoItem from './TodoItem';

const TodoListBlock = styled.div`
	
	flex: 1;
	padding: 20px 32px 48px 32px;
	overflow-y: auto;
	background-color: lightblue;
	/* => ?‚¬?´ì¦? ì¡°ì •?„ ?™•?¸?•˜ê¸? ?œ„?•œ ?„?‹œ ?Š¤????¼  */
`;

function TodoList() {
	return (
	<TodoListBlock>
		<TodoItem text="ë¦¬ì•¡?Š¸ ê°•ì˜ ë³´ê¸°" done={false}/>
		<TodoItem text="todo list ?‹¤?Šµ?•˜ê¸?" done={true}/>
		<TodoItem text="ë¸”ë¡œê·¸ì— ?¬?Š¤?Œ… ?•˜ê¸?" done={false}/>
		<TodoItem text="ê°œì¸ ê³¼ì œ êµ¬ìƒ?•˜ê¸?" done={false}/>
		<TodoItem text="ê²Œì‹œ?Œ ?”„ë¡œì ?Š¸" done={false}/>		
	</TodoListBlock>
	);
}

export default TodoList;