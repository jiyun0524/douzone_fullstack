// src/modules/todos.jsx
/* 액션 타입 선언  */
const ADD_TODO = 'todos/ADD_TODO';
const TOGGLE_TODO = 'todos/TOGGLE_TODO';

/* 액션 함수 선언 */
let nextId = 1; // todo 데이터에서 사용할 고유 id
export const addTodo = text => ({
	type: ADD_TODO,
	todo: {
		id: nextId++,
		text
	}
})

export const toggleTodo = id => ( {
	type: TOGGLE_TODO,
	id
})

/* 초기 상태 선언  */
// 리듀서의 초기 상태는 어떤 타입이든 될 수 있다
const initialState = [
	/* 이렇게 배열안에 넣을거임
	{
		id:1,
		text:'test',
		done:fasle
	}
	*/
]

export default function todos(state = initialState, action) {
	switch(action.type) {
		case ADD_TODO:
			return state.concat(action.todo);
		case TOGGLE_TODO:
			return state.map(
				todo =>
				todo.id === action.id
				// -> 만약 id 값이 일치하면
					? {...todo, done: !todo.done} 
					// -> done 값을 반전 시키고
					: todo // -> 아니면 그대로 둠
			);
		default:
			return state;
	}
}