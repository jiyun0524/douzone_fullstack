// TodoTemplate.js
import React from 'react';
import styled from 'styled-components';

const TodoTemplateBlock = styled.div `
	width: 512px;
	height: 768px;
	
	position: relative;
	/* => 나중에 하단에 추가 버튼을 위치시키기 위한 설정  */
	background: white;
	border-radius: 16px;
	box-shadow: 0 0 8px 0 rgba(0, 0, 0, 0.4);

	margin : 0 auto;
	/* => 페이지 중앙에 나타나도록 설정 */

	margin-top: 96px;
	margin-bottom: 32px;
	display: flex;
	flex-decoration: cloumn;
	`;

function TodoTemplate({ children }) {
	return <TodoTemplateBlock>{children}</TodoTemplateBlock>;
}

export default TodoTemplate;