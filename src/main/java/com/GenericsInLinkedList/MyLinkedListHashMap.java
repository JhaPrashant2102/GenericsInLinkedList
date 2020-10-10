package com.GenericsInLinkedList;

import java.util.ArrayList;

public class MyLinkedListHashMap<T extends Comparable, V extends Comparable> {
	private final int numBuckets;
	ArrayList<MyLinkedList<T>> myBucketArray;

	public MyLinkedListHashMap() {
		this.numBuckets = 10;
		this.myBucketArray = new ArrayList<>(10);
		
		//to ensure there is an empty LinkedList
		for (int i = 0; i < numBuckets; i++) {
			myBucketArray.add(null);
		}
	}

	public V get(T key) {
		if(key==null)
			return null;
		int index = this.getBucketIndex(key);
		MyLinkedList<T> myLinkedList = this.myBucketArray.get(index);
		if(myLinkedList==null)
			return null;
		MyMapNode<T,V> myMapNode = (MyMapNode<T, V>) myLinkedList.searchNode(key);
		return (myMapNode==null)?null:myMapNode.getValue();
	}

	private int getBucketIndex(T key) {
		int hashCode = Math.abs(key.hashCode());
		int index = hashCode%numBuckets;
		System.out.println("Key: "+key+" hashcode: "+hashCode+" index: "+index);
		return index;
	}

	public void add(T key, V value) {
		int index = getBucketIndex(key);
		MyLinkedList<T> myLinkedList = this.myBucketArray.get(index);
		if(myLinkedList==null) {
			myLinkedList = new MyLinkedList<>();
			myBucketArray.set(index,myLinkedList);
		}
		MyMapNode<T,V> myMapNode = (MyMapNode<T, V>) myLinkedList.searchNode(key);
		if(myMapNode==null) {
			myMapNode = new MyMapNode<>(key,value);
			myLinkedList.append((INode)myMapNode);
		}
		else
			myMapNode.setValue(value);
	}
	
	@Override
	public String toString() {
		return "MyLinkedListHashMap List{"+myBucketArray+'}';
	}

	public void remove(T key) {
		int index = getBucketIndex(key);
		MyLinkedList<T> myLinkedList = this.myBucketArray.get(index);
		if(myLinkedList==null)
			return;
		MyMapNode myMapNode =  (MyMapNode) myLinkedList.getHead();
		while(myMapNode.getNext()!=null) {
			if(myMapNode.getKey()==key) {
				myLinkedList.deleteNode(myMapNode);
			}
			myMapNode = (MyMapNode) myMapNode.getNext();
		}
	}

}
