package ex01.method;

public class MainEntry {
	// 2) 매개변수 있고, 리턴타입 없는 경우
	public static void plus(int x, int y) {
		int hap = x + y;
		System.out.println("x + y = " + hap);
		System.out.println(x + " + " + y + " = " + hap);
	}
	
	//﻿ 3) 매개변수 없고, 리턴타입 있는 경우
	public static String message() {
		String str = "the1 class !!";
		return str;
	}
	public static void line() {
		System.out.println("===============");
	}
	
	// 4) 매개변수 있고, 리턴타입 있는 경우
	public static int sub(int x, int y, int z) {
		return x-y-z;
	}
	
	public static void main(String[] args) {
		System.out.println("main start");
		showName(); // 함수 호출
		line();
		
		plus(3, 5);
		line();
		
		String msg = message();
		System.out.println(msg);
		System.out.println(message());
		line();
		
		int num = sub(20, 5, 8);
		System.out.println(num);
		System.out.println(sub(7, 4, 2));
		System.out.println("main end");
	}
	
	// 1) 매개변수 없고, 리턴타입 없는 경우
	public static void showName() { // 함수정의(구현부)
		System.out.println("hello world");
	}
}