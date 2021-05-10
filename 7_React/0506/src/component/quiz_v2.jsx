// src/quiz.js
import React, { Component } from 'react';

// ?��바구?�� 만들�?
class Cart extends Component {
	state = {
		products: [
			{ name: 'Apple', price: 5000, count: 0 },
			{ name: 'Banana', price: 5000, count: 0 },
			{ name: 'Melon', price: 5000, count: 0 }
		]
	}

	onChange = (index, val) => {
		this.setState({
			products: this.state.products.map((product, i) => (
				i == index ? { ...product, count: val } : product
			))
		})
	}
	render() {
		return (
			<body>
				<header>
					<h2>My Cart</h2>
				</header>
				<div>
					<ProductList products ={this.state.products}
					 onChange = {this.onChange} />
					<TotalPrice products = {this.state.products} />
				</div>
			</body>
		)
	}
}

const ProductList = ({ products, onChange }) => (
	<body>
	{products.map((product, i) => (
		<table>
		<tr>
			<td key={i}>
				{product.name}
			</td>
			<td>
				<input
					type="text"
					value={product.count}
					onChange={e => onChange(i, parseInt(e.target.value) || 0)}
				></input>
			</td>
		</tr>
		</table>
	))}
	</body>
)


/* const ProductList = ({ products, onChange }) => (
	<table border ="1">
		{products.map((product, i) => (
			<tr>
				<td key={i}>
					{product.name}
					<input
						type="text"
						value={product.count}
						onChange={e => onChange(i, parseInt(e.target.value) || 0)}
					>
					</input>
				</td>
			</tr>
		))}
	</table>
)
 */

const TotalPrice = ({ products }) => (
	<h3>
		TotalPrice : {products.reduce((sum, i) => (
		sum += i.count * i.price
	), 0)}
	</h3>
)
class App extends Component {
	render() {
		return (
			<div>
				<Cart></Cart>
				<getPrice></getPrice>
			</div>
		);
	}
}
export default App