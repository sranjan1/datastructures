package com.sranjan.learning.datastructures.stack;

public interface Stack<X> {
	void push(X newItem);
	X pop() throws IllegalStateException;
	boolean contains(X item) throws IllegalArgumentException;
	X access(X item);
	int size();
}
