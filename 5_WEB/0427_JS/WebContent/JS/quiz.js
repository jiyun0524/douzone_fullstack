// quiz.js

const ulEl = document.querySelector('ul')

for( let i = 0; i <=10; i += 1) {
	const li = document.createElement('li')
	li.textContent = `list-${i + 1}`
	li.addEventListener('click', function(){
		if(i%2!=0)
			console.log(li.textContent)
	})
	ulEl.appendChild(li)
}