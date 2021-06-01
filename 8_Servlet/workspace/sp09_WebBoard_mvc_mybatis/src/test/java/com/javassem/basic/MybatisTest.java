package com.javassem.basic;

import static org.junit.Assert.assertEquals;

import java.util.List;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.javassem.domain.BoardVO;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class MybatisTest {

	Logger log = LoggerFactory.getLogger(MybatisTest.class);
	
	@Autowired
	private DataSource dataSource;
	
	@Autowired
	private SqlSessionFactory sqlSessionFactory;
	
	@Test
	public void timeTest() {
		try {
		
			SqlSession session = sqlSessionFactory.openSession();
			log.info("[결과]"+session.selectOne("org.javassem.TestMapper.getTime"));
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
	
	
	@Test
	public void selectBoardTest() {
		try {
		
			SqlSession session = sqlSessionFactory.openSession();
			List<BoardVO> list = session.selectList("org.javassem.TestMapper.getBoard");
			for( BoardVO vo : list) {
				log.info("[BoardVO결과]"+ vo.getTitle() + "/" + vo.getContent());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
	
	@Test
	public void updateBoardTest() {
		try {
		
			SqlSession session = sqlSessionFactory.openSession();
			BoardVO vo = new BoardVO();
			vo.setSeq(2);
			vo.setTitle("test수정");
			vo.setContent("Test수정");
			int result = session.update("org.javassem.TestMapper.modifyBoard", vo);
			assertEquals(1, result);
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
	
	/*
	 * 삭제 후 키값 검색하여 테스트
	 
	 delete(키)
	 BoardVO vo = selectOne(키)
	 assertNull(vo) // 삭제된 책이 없으면 테스트 통과
	 
	 */
}
