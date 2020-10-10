package com.GenericsInLinkedList;

public class MyMapNode<T extends Comparable,V extends Comparable> implements INode<T> {

	private T key;
	private V value;
	private MyMapNode<T,V> next;
	
	
	public MyMapNode(T key, V value) {
		this.key = key;
		this.value = value;
		next = null;
	}

	@Override
	public T getKey() {
		return key;
	}

	@Override
	public void setKey(T key) {
		this.key = key;
	}

	@Override
	public INode<T> getNext() {
		return next;
	}

	@Override
	public void setNext(INode<T> next) {
		this.next = (MyMapNode<T, V>) next;
	}
	
	public V getValue() {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
	}

	@Override
	public String toString() {
		StringBuilder myMapNodeString = new StringBuilder();
		myMapNodeString.append("MyMapNode{"+"K=").append(key).append(" V=").append(value).append('}');
		if(next!=null)
			myMapNodeString.append("->").append(next);
		return myMapNodeString.toString();
	}
}
