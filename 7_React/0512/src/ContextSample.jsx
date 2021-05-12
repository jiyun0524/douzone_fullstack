// ContextSample.js
import React, { createContext, useContext, useState } from 'react';

const MyContext = createContext('defaultValue');

function Child() {
	const text = useContext(MyContext);
	return <div>나는 누구일까요  {text} !! </div>
}

function Parent() {
	return <Child />
}

function GrandParent() {
	return <Parent />
}

function ContextSample() {
	const [value, setValue] = useState(true);

	return (
		<MyContext.Provider value={value ? '또리애비': '또리애미'}>
			<GrandParent  />
			<button onClick={() => setValue(!value)}>눌러봐</button>
		</MyContext.Provider>
	)
}

export default ContextSample;