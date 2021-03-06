// src/quiz.js
import React, {Component} from 'react';

// 장바구니 만들기

class Cart extends Component {
  state = {
    products: [
      {title: 'Apple', count: 0, price: 100},
      {title: 'Banana', count: 0, price: 200},
      {title: 'Orange', count: 0, price: 300},
    ]
  }
  
  onChange = (index, val) => {
    this.setState({
      products: this.state.products.map((product, i) => (
        i === index ? {...product, count: val} : product
      ))
    })
  }

  render () {
    return (
      <div>
        <ProductList products={this.state.products} onChange={this.onChange} />
        <Total products={this.state.products} />
      </div>
    )
  }
};

const ProductList = ({ products, onChange }) => (
  <ul>
    {products.map((product, i) => (
      <li key={i}>
        {product.title}
        <input 
          type="text" 
          value={product.count}
          onChange={e => onChange(i, parseInt(e.target.value) || 0)}
        />
      </li>
    ))}
  </ul>
);

const Total = ({ products }) => (
  <h3>
    Total Price :  
    {products.reduce((sum, i) => (
      sum += i.count * i.price
    ), 0)}
  </h3>
)

export default Cart
