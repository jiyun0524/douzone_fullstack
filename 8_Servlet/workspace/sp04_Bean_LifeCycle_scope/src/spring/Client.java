package spring;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Client implements InitializingBean, DisposableBean {
    /////////////////////////////////////////////////
	public Client(){  //디폴트 생성자
		System.out.println("Client Default");
	}
	
	private String defaulthost;
	
	public Client(String defaulthost){  //매개변수 1개짜리 생성자함수
		this.defaulthost =defaulthost;
		System.out.println("Client 생성자 : " + this.defaulthost);
	}
	////////////////////////////////////////////////////
	
	
	private String host; 

	public void setHost(String host) {
		this.host = host;
		System.out.println("Client.setHost() method 실행");
	}

	
	//afterPropertiesSet : property injection 후에
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Client.afterPropertiesSet() 실행");
	}

	public void send() {           /* <property name="host" value="서버" /> */
		System.out.println("Client.send() to " + host);    
	}

	
	//DisposableBean 대한 구현부 
	@Override
	public void destroy() throws Exception {         /* ctx.close(); */
		System.out.println("Client.destroy() 실행");
	}
	
}
