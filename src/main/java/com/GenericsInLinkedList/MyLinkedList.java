package com.GenericsInLinkedList;

public class MyLinkedList<T> {
	
	private INode head;
	private INode tail;
	
	public INode getHead() {
		return head;
	}

	public void setHead(INode head) {
		this.head = head;
	}

	public INode getTail() {
		return tail;
	}

	public void setTail(INode tail) {
		this.tail = tail;
	}

	public MyLinkedList() {
		this.head = null;
		this.tail = null;
	}

	public void addFromTop(INode customNode) {
		if(head==null)
			head = customNode;
		if(tail==null)
			tail = customNode;
		else {
			INode tempNode = head;
			head = customNode;
			customNode.setNext(tempNode);
		}
	}
	public void addFromBottom(INode customNode) {
		if(head==null) {
			head = customNode;
			tail = customNode;
		}
		else {
			tail.setNext(customNode);
			tail = customNode;
		}
	}
	
	public void printMyNodes() {
		StringBuffer myNodes = new StringBuffer("My Nodes: ");
		INode tempNode = head;
		while(tempNode.getNext()!=null) {
			myNodes.append(tempNode.getKey());
			if(!tempNode.equals(tail))
				myNodes.append("->");
			tempNode = tempNode.getNext();
		}
		myNodes.append(tempNode.getKey());
		System.out.println(myNodes);
	}

	public void insertNode(INode prevNode, INode newNode) {
		INode temp = prevNode.getNext();
		prevNode.setNext(newNode);
		newNode.setNext(temp);
	}

	public INode pop() {
		head = head.getNext();
		return head;
	}

	public INode popLast() {
		INode temp = head;
		while(temp.getNext().getNext()!=null) {
			temp = temp.getNext();
		}
		tail = temp;
		temp.setNext(null);
		return tail;
	}

	public INode searchNode(T target) {
		INode tempNode = head;
		INode retNode = null;
		while(tempNode.getNext()!=null) {
			if(tempNode.getKey().equals(target))
				retNode = tempNode;
			tempNode = tempNode.getNext();
		}
		return retNode;
	}
}
