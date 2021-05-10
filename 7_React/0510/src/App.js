import React from 'react';

import InputExam from './InputExam';

function App() {
	const name = 'react';
	const style = {
		backgroundColor:'pink',
		color:'aqua',
		fontSize: 24,
		padding: '1rem'
	};

	return(		
		<InputExam />
		//<Counter />

		// <Wrapper>
		// 	<Hello irum="doyeon333" color='red' isSpecial={true} />
		// 	<Hello color='blue' />
		// </Wrapper>


		// <React.Fragment>
		// 	<Hello irum="doyeon333" color='red' />
		// 	<Hello color='blue' />
		// 	<div>반갑습니다.</div>   {/* class이름은 className으로 이제부터는 붙여야합니다. */}
		// 	<div style={style}>{name}</div>
		// 	<div>반갑습니다.</div>
		// </React.Fragment>
	);
}

export default App;