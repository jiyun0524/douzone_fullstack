// Login.js
import React, { useState, useCallback, Component } from 'react';
import useInput from './useInput';


function Login(init=null)  {
	// state
	const [text, setText] = useInput({
		email: '',
		password: ''
	});

	return(
		<>
			<p>사용자 훅 적용한 상태 </p>
			<input id="email" value={text.email} onChange={setText} />
			<input id="password" value={text.password} onChange={setText} />
		</>
	);
}
export default Login;