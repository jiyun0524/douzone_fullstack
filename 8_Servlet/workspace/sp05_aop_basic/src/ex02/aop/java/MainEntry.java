package ex02.aop.java;

import java.lang.reflect.Proxy;

public class MainEntry {
	public static void main(String[] args) {
		ICalc cal = new CalImpl();
		
		System.out.println(cal.add(100, 200));
		
		//가짜를 생성(Proxy 객체 생성)
		ICalc proxy = (ICalc)Proxy.newProxyInstance(
				cal.getClass().getClassLoader(),	//loader, 클래스 찾는 코드
				cal.getClass().getInterfaces(),		//interfaces, 행위정보(interface)
				new LogPrintHandler(cal));			//h  핸들러 
		
		System.out.println(cal.getClass().getClassLoader().toString());
		System.out.println(cal.getClass().getInterfaces().toString());
		int result = proxy.sub(30, 20, 10);
		System.out.println(result);
		System.out.println(proxy.add(3, 5));
		
	}
}
