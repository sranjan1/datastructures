package com.sranjan.learning.datastructures.stack;

import java.util.ArrayList;
import java.util.List;

public class ListStack<X> implements Stack<X> {
	List<X> data;

	public ListStack() {
		this.data = new ArrayList<>();
	}

	@Override
	public void push(X newItem) {
		this.data.add(newItem);
	}

	@Override
	public X pop() throws IllegalStateException {
		// TODO Auto-generated method stub
		int size = size();
		return this.data.get(data.size());
	}

	@Override
	public boolean contains(X item) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public X access(X item) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
