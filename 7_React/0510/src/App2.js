import React, { Component } from 'react';
import TopMenu from './component/TopMenu';
import BodyContnet from './component/BodyContnet';
import MainTitle from './component/MainTitle';

// 컴포넌트 분리 
// state 사용
class App extends Component {
	constructor(props){
		super(props);
		this.state = {
			subject: { title:'인물 소개', sub: '우리나라를 빛낸 인물들!!'},
			contents: [
				{no:1, title:'김연아', desc:'수정했어요.2014년 동계 올림픽 여자 싱글 부문 은메달 ...'},
				{no:2, title:'이순신', desc:'이순신 장군 연혁~ ...'},
				{no:3, title:'세종대왕', desc:'세종대왕 연혁~ '},
			]

		}
	}


	render() {
		return(
			<div>
				<MainTitle 
					title={this.state.subject.title}
					sub={this.state.subject.sub}
					></MainTitle> 
				
				<TopMenu data={this.state.contents}></TopMenu>

				<BodyContnet title="연아는....." desc="수정했어요.2014년 동계 올림픽 여자 싱글 부문 은메달 ..."></BodyContnet>
			</div>
		);
	}
}


export default App;