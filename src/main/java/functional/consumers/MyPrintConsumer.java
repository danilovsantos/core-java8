package functional.consumers;

@FunctionalInterface
public interface MyPrintConsumer<T> {
	public abstract void accept(String arg);
}
