package functional.suppliers;

@FunctionalInterface
public interface MyDateSupplier<T> {
	public abstract T get();
}
