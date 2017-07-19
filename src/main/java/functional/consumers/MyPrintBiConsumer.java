package functional.consumers;

@FunctionalInterface
public interface MyPrintBiConsumer<T,U> {
	public abstract void accept(String arg1, String arg2);
}
