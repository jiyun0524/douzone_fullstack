// Profiles.jsx
import React from 'react';
import { Route, NavLink } from 'react-router-dom';
import Profile from './Profile';
import WithRouterSample from './WithRouterSample';
import ﻿RouterHookSample from './RouterHookSample';

const Profiles = () => {
	return (
		<div>
			<h3>====== 사용자 목록 =====</h3>
			<ul>
				<li>
					<NavLink to="/profiles/jiyoon"
					activeStyle={{ background: 'black', color: 'white' }}>
						jiyoon
					</NavLink>
				</li>
				<li>
					<NavLink to="/profiles/suho"
					activeStyle={{ background: 'black', color: 'white' }}>
						suho
					</NavLink>
				</li>
			</ul>

			<Route
				path="/profiles"
				exact
				render={() => <div>사용자를 선택하세요 </div>}
			/>
			<Route path="/profiles/:username" component={Profile} />
			<WithRouterSample />
			<﻿RouterHookSample />
		</div>
	)
}

export default Profiles;