package conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import spring.Client2;

@Configuration   
public class JavaConfig {  // MainEntry2.java

	//Client 빈객체로 등록 될깨
	// 인터페이스를 구현하는 코드를 Client2가 가지고 있지 않아도
	// 초기화 시점 호출될 메소드
	// 소멸될 시점에 호출될 메소드 지정해서 사용 할 수 있다.
	@Bean(initMethod = "connect", destroyMethod = "close")
	public Client2 client2() {
		Client2 client2 = new Client2();
		client2.setHost("서버2");
		return client2;
	}
 
	/* <bean id="client2" class="conf.JavaConfig" /> */
}