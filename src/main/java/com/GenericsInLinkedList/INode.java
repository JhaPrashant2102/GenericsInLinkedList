package com.GenericsInLinkedList;

public interface INode<T extends Comparable> {
	T getKey();
	void setKey(T key);
	
	INode<T> getNext();
	void setNext(INode<T> next);
}
