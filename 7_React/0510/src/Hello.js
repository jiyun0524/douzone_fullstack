// Hello.js
import React from 'react'

//function Hello(props) {
function Hello({color, irum, isSpecial}) {

	//console.log(props)
	return <div style={{
		color
	}}>
		{isSpecial && <b>@</b>}
		
		{/* {isSpecial ? <b>#</b>: null } */}
		안녕하세요. {irum} </div>

}

Hello.defaultProps = {
	irum: '이름없음'
};

export default Hello;
