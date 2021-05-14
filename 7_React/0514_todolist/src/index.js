import React from 'react';
import ReactDOM from 'react-dom';

import App from './App';
// import * as serviceWorker from './serviceWorker';
import { createStore } from 'redux';
import rootReducer from './modules';


const store = createStore(rootReducer); // store 생성
console.log(store.getState());

ReactDOM.render(<App />, document.getElementById('root'));

// serviceWorker.unregister();