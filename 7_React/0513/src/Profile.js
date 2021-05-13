// Profile.js
import React from 'react';

// 프로필에서 사용 할 데이터
const profileData = {
	jiyoon: {
		name: '권지윤',
		description: 
			'Full stack Engineer @ 개발은 ㅇㅓ려워잉'
	},
	suho: {
		name: '숴랑이',
		description:
			'개발은 재밌어'
	}
}

const Profile = ({match}) => {
	// 파라미터를 받아올 땐 match 안에 있는 params 값을 참조한다 !
	const { username } = match.params;
	const profile = profileData[username];
	if(!profile) {
		return <div>없는데용 ?? </div>
	}
	return (
		<div>
			<h3>{username}({profile.name})</h3>
			<p>{profile.description}</p>
		</div>
	)
}

export default Profile;