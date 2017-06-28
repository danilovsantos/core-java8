package com.java.functional.programing;

import java.util.function.Function;

public class FunctionSampleTwo {

	private static int num = 0;
	
	public static void main(String[] args) {

		Function<Integer,Integer> sumByOne = new Function<Integer,Integer>(){
			@Override
			public Integer apply(Integer t) {
				return t+1;
			}
		};
		
		System.out.println(num);
		sumByOne.apply(num);
		System.out.println(num);
		
		System.out.println("-----------------------");
		
		FunctionSampleTwo f = new FunctionSampleTwo();
		
		System.out.println(num);
		f.sumByone();
		System.out.println(num);
		
	}
	
	public void sumByone(){
		num += 1;
	}

}
