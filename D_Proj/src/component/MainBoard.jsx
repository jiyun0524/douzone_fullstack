// MainBoard.js
import React from 'react';

const MainBoard = () => {
	return (
		<body>
			<header>
				<h1>Board</h1>
			</header>
			<nav>
				<ul>
					<li><a href="#">intro</a></li>
					<li><a href="#">hobby</a></li>
					<li><a href="#">works</a></li>
					<li><a href="#">friends</a></li>
				</ul>
			</nav>
			<div class="center">
				<table>
					<th id="bNum">글 번호</th>
					<th id="bTitle">글 제목</th>
					<th id="bDate">작성일</th>
					<th id="bWriter">작성자</th>
					<th id="bComm">댓글</th>
				</table>
			</div>
		</body>
	)
}

export default MainBoard;
