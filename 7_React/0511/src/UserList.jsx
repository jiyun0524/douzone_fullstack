//UserList.js
import React from 'react';


function User({user}) {
	return(
		<div>
			<b>{user.username}</b><span>{user.email}</span>
		</div>
	);
}


function UserList() {
	const users = [
		{
			id:1,
			username:'jiyoon',
			email:'jiyun9705@naver.com'
		},

		{
			id:2,
			username:'hello',
			email:'hello@nate.com'
		},

		{
			id:3,
			username:'good',
			email:'good@gmail.com'
		}
	];

	return(
		<div>
			{
				users.map(
					(user) => (<User user={user} key={user.id} />)
				)
			}
		</div>

		// <div>
		// 	<User user={users[0]} />
		// 	<User user={users[1]} />
		// 	<User user={users[2]} />
		// </div>


		// <div>
		// 	<div>
		// 		<b>{users[0].username}</b><span>{users[0].email}</span>
		// 	</div>
		// 	<div>
		// 		<b>{users[1].username}</b><span>{users[1].email}</span>
		// 	</div>
		// 	<div>
		// 		<b>{users[2].username}</b><span>{users[2].email}</span>
		// 	</div>
		// </div>
	);
}

export default UserList;







