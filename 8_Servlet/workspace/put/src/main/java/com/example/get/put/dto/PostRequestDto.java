package com.example.get.put.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(value=PropertyNamingStrategies.SnakeCaseStrategy.class)

public class PostRequestDto {
	
	private String name;
	
	@JsonProperty("car_number")
	private int age;
	
	private List<CarDto> carList;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public List<CarDto> getCarList() {
		return carList;
	}

	public void setCarList(List<CarDto> carList) {
		this.carList = carList;
	}
}


/*
{
	"name" : "ddori",
	"age" : 20,
	"car_list" : []
//	차가 여러대 있다는 뜻
			{
				"name" : "BMW",
				"car_number" : "49버5039"
			},
			{
				"name" : "BMW2",
				"car_number" : "50버5039"
			}
}
*/
