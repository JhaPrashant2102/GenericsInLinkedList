package com.GenericsInLinkedList;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyQueueTest {

	@Test
	public void given3NodesWhenAddedToQueueShouldHaveFirstAddedNode() {
		MyQueue myQueue = new MyQueue();
		MyNode<Integer> myFirstNode = new MyNode<Integer>(56);
		MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
		MyNode<Integer> myThirdNode = new MyNode<Integer>(70);
		myQueue.enqueue(myFirstNode);
		myQueue.enqueue(mySecondNode);
		myQueue.enqueue(myThirdNode);
		INode myNode = myQueue.top();
		myQueue.printQueue();
		assertEquals(myFirstNode,myNode);
	}
	
	@Test
	public void given3NodesWhenPoppedFromQueueShouldMatchFirstAddedNode() {
		MyQueue myQueue = new MyQueue();
		MyNode<Integer> myFirstNode = new MyNode<Integer>(56);
		MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
		MyNode<Integer> myThirdNode = new MyNode<Integer>(70);
		myQueue.enqueue(myFirstNode);
		myQueue.enqueue(mySecondNode);
		myQueue.enqueue(myThirdNode);
		INode myNode = myQueue.dequeue();
		myQueue.printQueue();
		assertEquals(myThirdNode,myNode);
	}
	
	@Test
	public void given3Nodes_shouldReturnSize3() {
		MyQueue myQueue = new MyQueue();
		MyNode<Integer> myFirstNode = new MyNode<Integer>(56);
		MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
		MyNode<Integer> myThirdNode = new MyNode<Integer>(70);
		myQueue.enqueue(myFirstNode);
		myQueue.enqueue(mySecondNode);
		myQueue.enqueue(myThirdNode);
		int size = myQueue.size();
		myQueue.printQueue();
		assertEquals(3,size);
	}
	
	@Test
	public void given3Nodes_shouldIsEmptyFalse() {
		MyQueue myQueue = new MyQueue();
		MyNode<Integer> myFirstNode = new MyNode<Integer>(56);
		MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
		MyNode<Integer> myThirdNode = new MyNode<Integer>(70);
		myQueue.enqueue(myFirstNode);
		myQueue.enqueue(mySecondNode);
		myQueue.enqueue(myThirdNode);
		boolean check = myQueue.isEmpty();
		myQueue.printQueue();
		assertFalse(check);
	}

}
