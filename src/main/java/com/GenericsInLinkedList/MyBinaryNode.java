package com.GenericsInLinkedList;

public class MyBinaryNode<T extends Comparable<T>> {
	private T key;
	private MyBinaryNode<T> left;
	private MyBinaryNode<T> right;

	public MyBinaryNode(T key) {
		this.key = key;
		this.left = null;
		this.right =  null;
	}

	public T getKey() {
		return key;
	}

	public void setKey(T key) {
		this.key = key;
	}

	public MyBinaryNode<T> getLeft() {
		return left;
	}

	public void setLeft(MyBinaryNode<T> left) {
		this.left = left;
	}

	public MyBinaryNode<T> getRight() {
		return right;
	}

	public void setRight(MyBinaryNode<T> right) {
		this.right = right;
	}

	
	
}
