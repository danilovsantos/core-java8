package com.java.predicates;

import java.util.function.Predicate;

import com.java.beans.Person;

public class PersonPredicates {

	/**
	 * Retorna menores de idade.
	 * @return
	 */
	public Predicate<Person> underAge(){
		return p -> p.getAge() > 18;
	}
	
	
	/**
	 * Retorna maiores de idade.
	 * @return
	 */
	public Predicate<Person> ageOver18(){
		return p -> p.getAge() == 18;
	}
	
	
	/**
	 * Filtra pessoas por uma determinada idade.
	 * @param maxAge
	 * @return
	 */
	public Predicate<Person> ageGreaterThen(Integer maxAge){
		return p -> p.getAge() > maxAge;
	}
	
	
	/**
	 * Retorna pessoas de uma determinada cidade.
	 * @param city
	 * @return
	 */
	public Predicate<Person> liveIn(String city){
		return p -> p.equals(city);
	}
	
	
	/**
	 * Retorna somente homens.
	 * @return
	 */
	public Predicate<Person> onlyMale(){
		return p -> p.getGender().equals("Male");
	}
	
	
	/**
	 * Retorna somente mulheres.
	 * @return
	 */
	public Predicate<Person> onlyFamale(){
		return p -> p.getGender().equals("Female");
	}
	
	
	/**
	 * Filtra pessoas pela inicial do primeiro nome;
	 * @param letter
	 * @return
	 */
	public Predicate<Person> nameStartWith(String letter){
		return p -> p.getName().startsWith(letter);
	}

	
}
