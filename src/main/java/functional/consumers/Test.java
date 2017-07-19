package functional.consumers;

import java.util.function.Consumer;

public class Test {

	public static void main(String[] args) {
		
		MyPrintConsumer<String> consumer1 = System.out::println;
		
		Consumer<String> consumer2 = x -> System.out.println(x);
		
		MyPrintBiConsumer<String, String> biConsumer1 = (x,y) -> System.out.println(x+y); 
		
		consumer1.accept("1");
		consumer2.accept("2");
		
		biConsumer1.accept("Danilo", " Valente");

	}

}
