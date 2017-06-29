package com.java.functional.programing;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

//http://howtodoinjava.com/java-8/how-to-use-predicate-in-java-8/

public class EmployeePredicates {

	private Integer id;
	private Integer age;
	private String name;
	
	public EmployeePredicates(){}
	
	public EmployeePredicates(Integer id, Integer age, String name){
		this.id = id;
		this.age = age;
		this.name = name;
	}
	
	public static void main(String[]args){
		
		List<EmployeePredicates> employees = new ArrayList<EmployeePredicates>();
		
		employees.add(new EmployeePredicates(1, 30, "Fulano"));
		employees.add(new EmployeePredicates(2, 17, "Ciclano"));
		employees.add(new EmployeePredicates(3, 15, "Zé"));
		employees.add(new EmployeePredicates(4, 20, "João"));
		employees.add(new EmployeePredicates(5, 50, "Tônio"));
		
		System.out.println(EmployeePredicates.filterEmployees(employees, isAdult()).toString());
		System.out.println(EmployeePredicates.filterEmployees(employees, checkById(3)).toString());
		System.out.println(EmployeePredicates.filterEmployees(employees, checkByName("João")).toString());
		
	}
	
	public static Predicate<EmployeePredicates> isAdult(){
		return e -> e.getAge() > 18;
	}
	
	public static Predicate<EmployeePredicates> checkById(Integer id){
		return e -> e.getId() == id;
	}
	
	public static Predicate<EmployeePredicates> checkByName(String name){
		return e -> e.getName().equals(name);
	}
	
	public static List<EmployeePredicates> filterEmployees(List<EmployeePredicates> employees, Predicate<EmployeePredicates> predicate){
		return employees.stream().filter(predicate).collect(Collectors.<EmployeePredicates>toList());
	}
		
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return this.id+" - "+this.name+" - "+this.age;
	}

	
}
