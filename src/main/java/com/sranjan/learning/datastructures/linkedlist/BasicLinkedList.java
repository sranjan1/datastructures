package com.sranjan.learning.datastructures.linkedlist;

public class BasicLinkedList<X> {
	private Node first;
	private Node last;
	private int nodeCount;
	
	public BasicLinkedList() {
		this.first = null;
		this.last = null;
		this.nodeCount = 0;
	}
	
	public int size() {
		return nodeCount;
	}
	
	public void add(X item) {
		if(first == null) {
			first = new Node(item);
			last = first;
		}
		else {
			Node newLastNode = new Node(item);
			last.setNextNode(newLastNode);
			last = newLastNode;
		}
		nodeCount++;
	}
	
    public void insert(X item, int position) {
    	if(position < 0 || position > size() || item == null) {
    		throw new IllegalArgumentException("Invalid Position");
    	}
    	Node currentNode = first;
    	for(int i=1; i<position && currentNode!=null; i++) {
    		currentNode = currentNode.nextNode;
    	}
    	Node newNode = new Node(item);
    	Node nextNode = currentNode.getNextNode();
    	currentNode.setNextNode(newNode);
    	newNode.setNextNode(nextNode);
    	nodeCount++;
    }
	
	public X remove() {
		if(size() == 0) {
			throw new IllegalStateException("LinkedList is empty, nothing to remove");
		}
		X nodeItem = first.getNodeItem();
		first = first.getNextNode();
		nodeCount--;
		return nodeItem;
	}
	
	private class Node {
		private Node nextNode;
		private X nodeItem;
		
		public Node(X item) {
			this.nextNode = null;
			this.nodeItem = item;
		}
		
		public Node getNextNode() {
			return nextNode;
		}

		public void setNextNode(Node nextNode) {
			this.nextNode = nextNode;
		}

		public X getNodeItem() {
			return nodeItem;
		}
	}
}
