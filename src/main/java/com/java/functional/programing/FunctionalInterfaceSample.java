package com.java.functional.programing;

/**
 * Functional interface in according of SAM concept.
 * @author dvsantos1
 */

@FunctionalInterface
public interface FunctionalInterfaceSample {

	public abstract void doSomething();
	
	default void doElse(){
		
	}
	
	@Override
	public String toString();
	
	@Override
	public boolean equals(Object obj);
	
}
