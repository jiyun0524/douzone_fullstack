import React, { useRef, useState } from 'react';
import UserList from './UserList';
import CreateUser from './CreateUser';

function App() {	
	const [inputs, setInputs] = useState({
		username: '',
		email: '',
		phone:''
	});

	const {username, email, phone} = inputs;
	const onChange = e => {
		const {name, value} = e. target;
		setInputs({
			...inputs,
			[name] : value
		});
	};

	const [users, setUsers] = useState([
		{
			id: 1,
			username: 'first',
			email: 'first@email.com',
			phone:'010-1111-1111',
			active: true
		},
		{
			id: 2,
			username: 'second',
			email: 'second@email.com',
			phone:'010-2222-2222',
			active: false
		},
		{
			id: 3,
			username: 'third',
			email: 'third@email.com',
			phone:'010-3333-3333',
			active: false
		}
	]);

	const nextId = useRef(4);
	const onCreate = () => {
	const user= {
		id:nextId.current,
		username,
		email,
		phone
	};
	setUsers(users.concat(user));
		setInputs({
			username:'',
			email:'',
			phone:''
		});

	nextId.current += 1;
	};

	const onRemove = id => {
		setUsers(users.filter(user => user.id !== id));
	};
	return (
		<>
			<CreateUser
				username={username}
				email={email}
				phone={phone}
				onCreate={onCreate}
				onChange={onChange}
			/>
			<UserList users={users} onRemove={onRemove}/>
		</>
	);
}

export default App;