package functional;

/**
 * Functional interface in according of SAM concept.
 * @author dvsantos1
 */

@FunctionalInterface
public interface Interface {

	public abstract void doSomething();
	
	default void doElse(){
		
	}
	
	@Override
	public String toString();
	
	@Override
	public boolean equals(Object obj);
	
}
