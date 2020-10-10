package com.GenericsInLinkedList;

public class MyHashMap<T extends Comparable, V extends Comparable> {
	private MyLinkedList<T> myLinkedList;

	public MyHashMap() {
		this.myLinkedList = new MyLinkedList<>();
	}

	public V get(T key) {
		MyMapNode<T, V> myMapNode = (MyMapNode) this.myLinkedList.searchNode(key);
		return (myMapNode == null) ? null : myMapNode.getValue();
	}

	public void add(T key, V value) {
		MyMapNode<T, V> myMapNode = (MyMapNode) this.myLinkedList.searchNode(key);
		if (myMapNode == null) {
			myMapNode = new MyMapNode<>(key,value);
			myLinkedList.append(myMapNode);
		}
		else {
			myMapNode.setValue(value);
		}
	}
	
	@Override
	public String toString() {
		return "MyHashMapNodes{"+myLinkedList+'}';
	}

}
