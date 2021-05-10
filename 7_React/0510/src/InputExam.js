// InputExam.js

import React, { useState } from 'react';

function InputExam() {
	const [inputs, setInputs] = useState({
		name: '',
		nickname:'',
	});

	const { name, nickname } = inputs;

	const onChange = (e) => {

		const { name, value } = e.target;

		setInputs({
			...inputs,
			[name]: value,
		});

	};

	// const nextInputs = {
	// 	...inputs
	// };

	const onReset = () =>{
		setInputs({
			name: '',
			nickname: ''
		});
	}

	return(
		<div>
			<input 
				name="name"    
				placeholder='이름'  
				onChange={onChange} 
				value={name}
			/>

			<input name="nickname"  placeholder='닉네임'
				   onChange={onChange} value={nickname}/>
			<button onClick={onReset}>초기화</button>

			<div>
				<b>value: </b>
				{name}({nickname})
			</div>
		</div>
	);
}

export default InputExam;