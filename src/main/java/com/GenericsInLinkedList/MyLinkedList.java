package com.GenericsInLinkedList;

public class MyLinkedList<T extends Comparable> {

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
		if (head == null)
			head = customNode;
		if (tail == null)
			tail = customNode;
		else {
			INode tempNode = head;
			head = customNode;
			customNode.setNext(tempNode);
		}
	}

	public void addFromBottom(INode customNode) {
		if (head == null) {
			head = customNode;
			tail = customNode;
		} else {
			tail.setNext(customNode);
			tail = customNode;
		}
	}

	public void printMyNodes() {
		StringBuffer myNodes = new StringBuffer("My Nodes: ");
		INode tempNode = head;
		while (tempNode.getNext() != null) {
			myNodes.append(tempNode.getKey());
			if (!tempNode.equals(tail))
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
		INode tempNode = head;
		head = head.getNext();
		return tempNode;
	}

	public INode popLast() {
		INode temp = head;
		while (temp.getNext().getNext() != null) {
			temp = temp.getNext();
		}
		tail = temp;
		INode retNode = temp.getNext();
		temp.setNext(null);
		return retNode;
	}

	public INode searchNode(T target) {
		INode tempNode = head;
		INode retNode = null;
		while (tempNode.getNext() != null) {
			if (tempNode.getKey().equals(target))
				retNode = tempNode;
			tempNode = tempNode.getNext();
		}
		return retNode;
	}

	public INode searchNodeAndInsert(T target, T newKey) {
		INode newNode = new MyNode(newKey);
		INode tempNode = head;
		INode retNode = null;
		while (tempNode.getNext() != null) {
			if (tempNode.getKey().equals(target))
				retNode = tempNode;
			tempNode = tempNode.getNext();
		}
		insertNode(retNode, newNode);
		return retNode;
	}

	public void deleteNode(INode newNode) {
		INode temp = head;
		while (temp.getNext() != newNode) {
			temp = temp.getNext();
		}
		temp.setNext(newNode.getNext());
	}

	public int size() {
		INode tempNode = head;
		int count = 0;
		while (tempNode != null) {
			count++;
			tempNode = tempNode.getNext();
		}
		return count;
	}

	public void addInSortedForm(INode customNode) {
		if (head == null) {
			head = customNode;
			tail = customNode;
		} else {
			INode tempNode = head;
			INode prevNode = null;
			while (customNode.getKey().compareTo(tempNode.getKey()) > 0 && tempNode.getNext() != null) {
				prevNode = tempNode;
				tempNode = tempNode.getNext();
			}
			if (prevNode == null) {
				if (tempNode.getKey().compareTo(customNode.getKey()) > 0) {
					customNode.setNext(tempNode);
					head = customNode;
				} else {
					INode temp = head.getNext();
					head.setNext(customNode);
					customNode.setNext(temp);
				}
			}

			else {
				if (tempNode.getKey().compareTo(customNode.getKey()) > 0) {
					prevNode.setNext(customNode);
					customNode.setNext(tempNode);
				} else {
					tempNode.setNext(customNode);
					tail = customNode;
				}
			}

		}
	}
}
