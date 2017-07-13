package com.java.beans;

import java.time.LocalDate;

public class Person {
	
	private String name;
	private Integer age;
	private LocalDate birthdate;
	private String gender;
	private String city;
	
	public Person(){}
	
	public Person(String name){
		this.name = name;
	}
	
	public Person(String name, Integer age, LocalDate birthdate, String gender, String city){
		this.name = name;
		this.age = age;
		this.birthdate = birthdate;
		this.gender = gender;
		this.city = city;
	}
	
	@Override
	public String toString() {	
		return this.name+" - "+this.age+" - "+this.birthdate+" - "+this.gender+" - "+this.city;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	} 
	
	

}
