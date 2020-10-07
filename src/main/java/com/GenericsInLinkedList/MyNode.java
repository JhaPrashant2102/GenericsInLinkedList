package com.GenericsInLinkedList;

public class MyNode<T> implements INode<T>{
	
	private T key;
	private INode next;
	
	public INode getNext() {
		return next;
	}
	public void setNext(INode next) {
		this.next = next;
	}
	public MyNode(T key) {
		this.key = key;
		this.next = null;
	}
	@Override
	public T getKey() {
		return key;
	}
	@Override
	public void setKey(T key) {
		this.key = key;
	}
	
}