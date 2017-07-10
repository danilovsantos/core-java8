package com.java.beans;

import java.time.LocalDate;

public class Person {
	
	private String name;
	private Integer age;
	private LocalDate birthdate;
	private String gender;
	private String city;
	
	public Person(){}
	
	public Person(String name, Integer age, LocalDate birthdate, String gender, String city){
		this.name = name;
		this.age = age;
		this.birthdate = birthdate;
		this.gender = gender;
		this.city = city;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public LocalDate getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(LocalDate birthdate) {
		this.birthdate = birthdate;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	} 
	
	

}
