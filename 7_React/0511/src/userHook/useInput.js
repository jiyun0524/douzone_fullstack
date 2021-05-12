// useInput.js  - 사용자 훅

import React, { useState, useCallback } from 'react';

export default(init = null) => {
	const[data, setData] = useState({init});

	const handler = useCallback( e => {
		const{ value , name } = e.target;
		setData({
			...data,
			[name]: value
		});
	}, [data] );

	return [data, handler];
};

