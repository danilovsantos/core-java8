package com.java.functional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.java.beans.Person;

public class FindFunctions {
	
	public static void main(String[]args){
		
		List<Person> list = new ArrayList<Person>();
		
		list.add(new Person("Ana"));
		list.add(new Person("Eduardo"));
		list.add(new Person("Fernanda"));
		list.add(new Person("Aline"));
		list.add(new Person("Roberta"));
		list.add(new Person("Bruno"));
		
		Optional<Person> optFirst = list.stream().filter(p -> p.getName().startsWith("A")).findFirst();
		Optional<Person> optAny = list.stream().filter(p -> p.getName().startsWith("F")).findAny();
		
		boolean allHasNameGraterThan3 = list.stream().allMatch(p -> p.getName().length() > 3);
		boolean anyHasNameGraterThan3 = list.stream().anyMatch(p -> p.getName().length() > 3);
		
		if(optFirst.isPresent()){
			System.out.println(optFirst.get().getName());
		}
		
		if(optAny.isPresent()){
			System.out.println(optAny.get().getName());
		}
		
		if(allHasNameGraterThan3){
			System.out.println("Todos as pessoas da lista tem o nome maior que 3 letras.");
		}
		
		if(anyHasNameGraterThan3){
			System.out.println("Alguma pessoa da lista tem o nome maior que 3 letras.");
		}
		
	}

}
