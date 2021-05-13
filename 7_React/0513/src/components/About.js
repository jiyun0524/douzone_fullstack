// About.js
import React from 'react';
import qs from 'qs';

const About = ({ location }) =>  {
	const query = qs.parse(location.search, {
		ignoreQueryPrefix: true
	});
	const detail = query.detail === 'true'
	// 쿼리의 파싱 결과 값은 문자열 이당
	return (
		<div>
			<h1>소개</h1>
			<h3>이 프로젝트는 리액트 라우터 기초를 실습한당 !</h3>
			{detail && <p>추가적인 정보가 어쩌궁 저쩌궁 ~~</p>}
		</div>
	)
}

export default About;