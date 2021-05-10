// src/app.js
import React, { Component } from 'react';

// ?Çò?ùò ?ù¥Î¶?, ?Çò?ù¥, ?ó∞?ùΩÏ≤òÍ?? ?Çò?ò§?èÑÎ°?
export class MyInfo extends Component {
	render() {
		return (
			<body>
				<div>
					<ul>
						<li>¿Ã∏ß : ±«¡ˆ¿±ú§</li>
						<li>≥™¿Ã : 25</li>
						<li>ø¨∂Ù√≥ : 93132839</li>
					</ul>
				</div>
			</body>
		)
	}
}

export class ModuleEx extends Component {
	render() {
		return (
			<header>
				<div>
					<h1>Let me introduce ...</h1>
				</div>
			</header>
		)
	}
}

export class App extends Component {
	render() {
		return (
			<div className>
				<ModuleEx></ModuleEx>
				<MyInfo></MyInfo>
			</div>
		)
	}
}
export default App