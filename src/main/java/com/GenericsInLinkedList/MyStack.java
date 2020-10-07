package com.GenericsInLinkedList;

public class MyStack {

	private MyLinkedList myLinkedList;
	
	public MyStack() {
		myLinkedList = new MyLinkedList();
	}
	
	public void push(INode myNode) {
		myLinkedList.addFromTop(myNode);
	}

	public INode peak() {
		return myLinkedList.getHead();
	}

	public void printStack() {
		myLinkedList.printMyNodes();	
	}

	public INode pop() {
		return myLinkedList.pop();
	}

	public int size() {
		return myLinkedList.size();
	}

	public boolean isEmpty() {
		if(size()==0)
			return true;
		else return false;
	}
	
}
