package com.opcoach.generator;

// This interface overrides the generated interface and will be returned by factory
public interface ValueGenerator<T> extends MValueGenerator<T>
{
	// You can write additional methods using an empty default java 8 notation 
	// because the generated implemented class extends this interface and is not abstract
	//
	// For instance : 
	// default public void addSomething(Something foo) {} ;

	default public String[] getParameterNames() { return new String[] { "p1", "p2", "p3"}; }
}
