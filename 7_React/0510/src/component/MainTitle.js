import React, { Component } from 'react';

class MainTitle extends Component {
	render(){
		 console.log('MainTitle render');
      	return (
			<header>
				<h1><a href="/">{this.props.title}</a></h1>

				<h1><a href="/" onClick={function(e){
					e.preventDefault();
					this.props.onChangePage();
					
				}.bind(this)}>{this.props.title}</a></h1>

				{this.props.sub}
			</header>  
      );
	}
}

export default MainTitle