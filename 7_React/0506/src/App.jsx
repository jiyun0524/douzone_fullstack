// src/app.js
import React, { Component } from 'react';

// ?��?�� ?���?, ?��?��, ?��?��처�?? ?��?��?���?
export class MyInfo extends Component {
	render() {
		return (
			<body>
				<div>
					<ul>
						<li>�̸� : ��������</li>
						<li>���� : 25</li>
						<li>����ó : 93132839</li>
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