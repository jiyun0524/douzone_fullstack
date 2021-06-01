package com.javassem.basic;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.javassem.controller.BoardController;

@RunWith(SpringJUnit4ClassRunner.class)
//@WebAppConfiguration	// WebApplicationContext를 생성할 수 있도록 하는 어노테이션
@ContextConfiguration({"file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml",
		"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
public class ControllerTest {

	Logger log = LoggerFactory.getLogger(MybatisTest.class);

	//private WebApplicationContext context; // MockMvc 객체 생성을 위한 context
   
	private MockMvc mockMvc;
	
	@Autowired
	BoardController boardController;
	
	@Before
	public void initMockMvc() {
		mockMvc = MockMvcBuilders.standaloneSetup(boardController).build();
	}
	
	@Test
	public void testBoard() throws Exception{
		
		mockMvc.perform(get("/test.do")       // controller의 /test URI를 get방식으로 호출
//                .param("number1", "1")  // 파라미터 number1에 1 입력
//                .param("number2", "1")
				) // 파라미터 number2에 1입력
                .andDo(print())                        // 결과를 print. MockMvcBuilders의 alwaysDo(print())로 대체 가능
                .andExpect(status().isOk()); 
	}
}
