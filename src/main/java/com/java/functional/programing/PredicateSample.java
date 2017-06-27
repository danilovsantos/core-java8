package com.java.functional.programing;

import java.util.function.Predicate;

public class PredicateSample {

	public static void main(String[] args) {

		/**
		 * The parameter weekday is true if it is a weekday, 
		 * and the parameter vacation is true if we are on vacation. 
		 * We sleep in if it is not a weekday or we're on vacation. 
		 * Return true if we sleep in.  
		 */
		
		Predicate<String> sleepIn = new Predicate<String>(){

			public boolean test(String arg0) {
				return false;
			}
			
		};
		
		
	}

}
