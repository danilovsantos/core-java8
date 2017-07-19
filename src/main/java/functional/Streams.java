package functional;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Streams {

	public static void main(String[] args) {
		
		//listToStream();
		//streamOfStrings();
		//streamOneToTen();

	}
	
	public static void listToStream(){
		
		List<Integer> numbers = new ArrayList<Integer>();
		
		numbers.add(0);
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		
		Stream<Integer> stream = numbers.stream();
		
		//stream.filter(t -> t > 2).forEach(i -> System.out.println(i));
		stream.sorted((first,second) -> second - first).forEach(System.out::println);
		
	}
	
	
	public static void streamOfStrings(){
		Stream<String> strings = Stream.of("Cofee", "Code", "Java");
		strings.forEach(System.out::println);
	}
	
	
	public static void streamOneToTen(){
		IntStream it = IntStream.rangeClosed(0, 10).skip(1);
		it.forEach(i -> System.out.println(i));
	}

}
