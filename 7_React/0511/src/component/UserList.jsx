//UserList.js
import React from 'react';

function User({ user, onRemove }) {
	return (
		<div>
			<b>{user.username}</b> &nbsp;
			<span>{user.email}</span> &nbsp;
			<span>{user.phone}</span>
			<button onClick={() => onRemove(user.id)}>삭제</button>
		</div>
	)
}

function UserList({ users, onRemove }) {
	return (
		<div>
			{users.map(user => (
				<User user={user} key={user.id} onRemove={onRemove} />
			))}
		</div>
	)
}

export default UserList;