import React, { Component } from 'react';
import TopMenu from './component/TopMenu';
import BodyContnet from './component/BodyContnet';
import MainTitle from './component/MainTitle';

// 컴포넌트 분리 
// state 사용
// event 처리
class App extends Component {
	constructor(props){
		super(props);
		this.state = {
			option: 'read',
			selected_content_no:2,
			subject: { title:'인물 소개', sub: '우리나라를 빛낸 인물들!!'},
			welcom : { title:'welcom', sub: 'Hello, React!!!'},
			contents: [
				{no:1, title:'김연아', desc:'수정했어요.2014년 동계 올림픽 여자 싱글 부문 은메달 ...'},
				{no:2, title:'이순신', desc:'이순신 장군 연혁 용감하십니다 ㅅ.ㅅ ...'},
				{no:3, title:'세종대왕', desc:'세종대왕 연혁 훌륭하십니다 ~.~ '},
			]
		};
	}

	render() {
		var _title, _desc = null;
		if(this.state.option === 'welcome') {
			_title = this.state.welcom.title;
			_desc = this.state.welcom.desc;
		} else if( this.state.option === 'read' ) {

			var i = 0;
			while( i < this.state.contents.length) {
				var data = this.state.contents[i];

				if(data.no === this.state.selected_content_no) {
					_title = data.title;
					_desc = data.desc;
					break;
				} // if end

				i = i + 1;
			} // end while
		}
		

		return(
			<div>
			   <MainTitle 
					  title={this.state.subject.title} 
							sub={this.state.subject.sub}
							onChangePage={function(){
								this.setState({option:'welcome'});
							}.bind(this)}
					></MainTitle> 

				
				<TopMenu 
					onChagePage = {function(no) {
						this.setState({
							option:'read',
							selected_content_no:Number(no)
						});
				}.bind(this)}
				data={this.state.contents} />

				<BodyContnet title={_title} desc={_desc} />

			</div>
		);
	}
}


export default App;


