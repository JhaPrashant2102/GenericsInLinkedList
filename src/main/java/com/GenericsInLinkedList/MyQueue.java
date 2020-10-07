package com.GenericsInLinkedList;

public class MyQueue {
	private MyLinkedList myLinkedList;

	public MyQueue() {
		myLinkedList = new MyLinkedList();
	}

	public void enqueue(INode myNode) {
		myLinkedList.addFromBottom(myNode);
	}

	public void printQueue() {
		myLinkedList.printMyNodes();
		
	}

	public INode top() {
		return myLinkedList.getHead();
	}
}
