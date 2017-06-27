package com.java.functional.programing;

import java.util.function.Function;

public class FunctionSample {

	public static void main(String[] args) {
		
		FunctionSample f = new FunctionSample();
		
		System.out.println(f.sleepIn(true, true));
		System.out.println(f.sleepIn(false, false));
		System.out.println(f.sleepIn(true, false));
		System.out.println(f.sleepIn(false, true));
		

	}
	
	
	/**
	 * The parameter weekday is true if it is a weekday, 
	 * and the parameter vacation is true if we are on vacation. 
	 * We sleep in if it is not a weekday or we're on vacation. 
	 * Return true if we sleep in.  
	 * http://codingbat.com/prob/p187868
	 */
	
	public boolean sleepIn(boolean weekday, boolean vacation){
		
		Function<Boolean, Boolean> isWeekDay = new Function<Boolean, Boolean>(){
			public Boolean apply(Boolean b) {
				return b;
			}
		};
		
		Function<Boolean, Boolean> isVacationDay = new Function<Boolean, Boolean>(){
			public Boolean apply(Boolean b) {
				return b;
			}
		};
		
		if(isWeekDay.apply(weekday) && !isVacationDay.apply(vacation)){
			return false;
		}
		
		return true;
	}

}
