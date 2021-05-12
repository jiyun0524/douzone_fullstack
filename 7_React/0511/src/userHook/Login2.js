// Login.js
import React, { useState, useCallback, Component } from 'react';


function Login(init=null)  {
	// state
	const [text, setText] = useState({
		email: '',
		password: ''
	});

	const onChange = useCallback( e => { 
			const { value, name } = e.target;
			setText({...text, [name]: value });
	}, [text]);

	return(
		<>
			<b>Loign hook 적용 전 상태 </b>
			<input id="email" value={text.email} onChange={onChange} />
			<input id="password" value={text.password} onChange={onChange} />
		</>
	);
}
export default Login;