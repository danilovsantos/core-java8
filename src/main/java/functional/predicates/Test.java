package functional.predicates;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class Test {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		
		MyPredicate<String> isEmpty = String::isEmpty;
		BiPredicate<String, String> startsWith = String::startsWith;
		Predicate<String> contains = s -> s.contains("V");
		
		System.out.println(isEmpty.test("N�o est� vazia!"));
		System.out.println(startsWith.test("Come�a com C","C"));
		System.out.println(contains.test("V"));
		
	}

}
