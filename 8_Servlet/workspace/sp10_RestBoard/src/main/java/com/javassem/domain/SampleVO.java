package com.javassem.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


//@Data - 를 하면 @AllArgsConstructor 이 안 먹히는데
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class SampleVO {

	private String name; 
	private Integer age;
	private String message;
	
	// lombok을 설치했기때문에 @setter, @getter 자동완성되고 하단에 생성자부분 없어도 됨
	/*
	 * @Data = @Getter/@Setter + @ToString + @EqualsAndHashCode + @RequriedArgsConstructor
	 */
	
	/*
	 * public SampleVO() {
	 * 
	 * } public SampleVO(String name, int age, String message) { super(); this.name
	 * = name; this.age = age; this.message = message; }
	 * 
	 * 
	 * public String getName() { return name; } public void setName(String name) {
	 * this.name = name; } public int getAge() { return age; } public void
	 * setAge(int age) { this.age = age; } public String getMessage() { return
	 * message; } public void setMessage(String message) { this.message = message; }
	 */
	
	
}
