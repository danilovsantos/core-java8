package com.java.functional.programing;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

//http://howtodoinjava.com/java-8/how-to-use-predicate-in-java-8/

public class EmployeePredicates {

	public static Predicate<Employee> isAdult(){
		return e -> e.getAge() > 18;
	}
	
	public static Predicate<Employee> checkById(Integer id){
		return e -> e.getId() == id;
	}
	
	public static Predicate<Employee> checkByName(String name){
		return e -> e.equals(name);
	}
	
	public static List<Employee> filterEmployees(List<Employee> employees, Predicate<Employee> predicate){
		return employees.stream().filter(predicate).collect(Collectors.<Employee>toList());
	}
	
}
