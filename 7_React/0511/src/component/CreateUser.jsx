// createuser.js
import React from 'react';

function CreateUser({username, email, phone, onCreate, onChange}) {
	return (
		<div>
			<section>				
				<h3>이름</h3>
				<input 
					name="username" 
					placeholder="이름" 
					onChange={onChange} 
					value={username}
				/>
			</section>
			<section>
				<h3>이메일</h3>
				<input 
					name="email" 
					placeholder="이메일" 
					onChange={onChange} 
					value={email}
				/>
			</section>
			<section>
				<h3>연락처</h3>
				<input 
					name="phone" 
					placeholder="연락처" 
					onChange={onChange} 
					value={phone}
				/>
			</section>
			<br/><br/><br/> &nbsp;&nbsp;&nbsp;
			<button onClick={onCreate}>등록</button>
			&nbsp;&nbsp;
			<button onClick={onChange}>취소</button>		
		</div>
	)
}

export default CreateUser;