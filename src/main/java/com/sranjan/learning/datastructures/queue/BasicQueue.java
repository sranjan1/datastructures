/**
 * 
 */
package com.sranjan.learning.datastructures.queue;

/**
 * @author sumit
 *
 */
public class BasicQueue<X> {
	
	private X[] data;
	private int front;
	private int end;
	
	public BasicQueue() {
		this(1000);
	}
	
	public BasicQueue(int capacity) {
		this.front = -1;
		this.end = -1;
		this.data = (X[]) new Object[capacity];
	}
	
	public int size() {
		if(front ==-1 && end == -1) {
			return 0;
		}
		return end - front +1;
	}
	
	public void enQueue(X newItem) {
		if((end+1) % data.length == front) {
			//Queue is already full
			throw new IllegalStateException("The queue is full");
		}
		else if (size() == 0) {
			front++;
			end++;
			data[end] = newItem;
		}
		else {
			this.data[++end] = newItem;
		}
	}
	
	public X deQueue() {
		if(size() == 0) {
			throw new IllegalStateException("Queue is empty");
		}
		X item = null;
		
		if(front == end || size() == 1) {
			item = data[front];
			data[front] = null;
			front = -1;
			end = -1;
		} else {
			item = data[front];
			data[front] = null;
			front++;
		}
		return item;
	}
	
	
    public boolean contains(X item) {
    	if(size() == 0) {
    		return false;
    	}
    	for(int i=front; i< end; i++) {
    		if(data[i].equals(item)) {
    			return true;
    		}
    	}
    	return false;
    }
	
    public X access(int position) {
    	if(position < 0 || size() == 0 || position > size()) {
    		throw new IllegalArgumentException("Invalid Position :"+position);
    	}
    	int trueIndex = 0;
    	for(int i=front; i<end; i++) {
    		if (trueIndex == position) {
    			return data[i];
    		}
    	}
    	trueIndex++;
    	return data[position];
    }
	
}
