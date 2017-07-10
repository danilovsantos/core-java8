package com.java.functional;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

//http://howtodoinjava.com/java-8/how-to-use-predicate-in-java-8/

public class Predicates {

	private Integer id;
	private Integer age;
	private String name;
	
	public Predicates(){}
	
	public Predicates(Integer id, Integer age, String name){
		this.id = id;
		this.age = age;
		this.name = name;
	}
	
	public static void main(String[]args){
		
		List<Predicates> employees = new ArrayList<Predicates>();
		
		employees.add(new Predicates(1, 30, "Fulano"));
		employees.add(new Predicates(2, 17, "Ciclano"));
		employees.add(new Predicates(3, 15, "Zé"));
		employees.add(new Predicates(4, 20, "João"));
		employees.add(new Predicates(5, 50, "Tônio"));
		
		System.out.println(filterEmployees(employees, isAdult()).toString());
		System.out.println(filterEmployees(employees, checkById(3)).toString());
		System.out.println(filterEmployees(employees, checkByName("João")).toString());
		
	}
	
	private static Predicate<Predicates> isAdult(){
		return e -> e.getAge() > 18;
	}
	
	private static Predicate<Predicates> checkById(Integer id){
		return e -> e.getId() == id;
	}
	
	private static Predicate<Predicates> checkByName(String name){
		return e -> e.getName().equals(name);
	}
	
	private static List<Predicates> filterEmployees(List<Predicates> employees, Predicate<Predicates> predicate){
		return employees.stream().filter(predicate).collect(Collectors.<Predicates>toList());
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
