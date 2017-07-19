package functional;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Parallelism {

	public static void main(String[]args){
		
		List<Integer> numbers = IntStream.rangeClosed(1, 1000).boxed().collect(Collectors.toList());		
		numbers.forEach(System.out::println);
		
	}
	
}
