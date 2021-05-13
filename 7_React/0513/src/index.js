// index.js
import React from 'react';
import ReactDOM from 'react-dom';
import { BrowserRouter } from 'react-router-dom';
// => BrowserRouter 불러오기 
import App from './App';
// import * as serviceWorker from './serviceWorker';

// -> App을 BrowserRouter 로 감싸자
ReactDOM.render(
	<BrowserRouter>
		<App></App>
	</BrowserRouter>, 
	document.getElementById('root')
);

// serviceWorker.unregister();