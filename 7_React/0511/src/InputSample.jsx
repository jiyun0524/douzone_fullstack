// inputsample.jsx
import React, { useState, useRef } from 'react';

function InputSample() {
	const [inputs, setInputs ] = useState({
		name:'',
		nickname:'',
	});

	const {name, nickname} = inputs;

	const onChange = (e) => {
		const {name, nickname} = e.target;
		setInputs({
			...inputs,
			[name] : value,
		});
	};

	const onReset = () => {
		setInputs({
			name:'',
			nickname:'',
		});
	}

	return(
		<div>
			<input name={name} placeholder="냐아아아아아아아앙" />
		</div>
	)
}

export default InputSample;