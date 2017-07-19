package functional.predicates;

@FunctionalInterface
public interface MyPredicate<T> {
	public abstract boolean test(T t);
}
