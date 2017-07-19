package functional.predicates;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class Test {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		
		MyPredicate<String> isEmpty = String::isEmpty;
		BiPredicate<String, String> startsWith = String::startsWith;
		Predicate<String> contains = s -> s.contains("V");
		
		System.out.println(isEmpty.test("Não está vazia!"));
		System.out.println(startsWith.test("Começa com C","C"));
		System.out.println(contains.test("V"));
		
	}

}
