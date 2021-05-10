import React, { Component } from 'react';


class BodyContnet extends Component {
	render(){
		return(
			<article>
				<h2>{this.props.title}</h2>
            	{this.props.desc}
			</article>
		);
	}
}

export default BodyContnet;