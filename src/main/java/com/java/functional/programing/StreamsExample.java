package com.java.functional.programing;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamsExample {

	public static void main(String[] args) {
		
		List<Integer> numbers = new ArrayList<Integer>();
		
		numbers.add(0);
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		
		Stream<Integer> stream = numbers.stream();
		
		//stream.filter(t -> t > 2).forEach(i -> System.out.println(i));
		stream.sorted((second,third) -> third - second).forEach(System.out::println);

	}

}
