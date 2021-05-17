// src/index.js
import React from 'react';
import ReactDOM from 'react-dom';

import App from './App';
// import * as serviceWorker from './serviceWorker';
import { createStore } from 'redux';
import { Provider } from 'react-redux';
import rootReducer from './modules';

const store = createStore(rootReducer); // store 생성

ReactDOM.render(
	<Provider store={store}>
		<App />
	</Provider>,
	document.getElementById('root')
);

// serviceWorker.unregister();