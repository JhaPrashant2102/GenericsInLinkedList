package com.GenericsInLinkedList;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyStackTest {

	@Test
	public void given3NodesWhenAddedToStackShouldHaveLastAddedNode() {
		MyStack myStack = new MyStack();
		MyNode<Integer> myFirstNode = new MyNode<Integer>(70);
		MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
		MyNode<Integer> myThirdNode = new MyNode<Integer>(56);
		myStack.push(myFirstNode);
		myStack.push(mySecondNode);
		myStack.push(myThirdNode);
		INode myNode = myStack.peak();
		myStack.printStack();
		assertEquals(myThirdNode,myNode);
	}
	
	@Test
	public void given3NodesWhenPoppedFromStackShouldMatchLastAddedNode() {
		MyStack myStack = new MyStack();
		MyNode<Integer> myFirstNode = new MyNode<Integer>(70);
		MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
		MyNode<Integer> myThirdNode = new MyNode<Integer>(56);
		myStack.push(myFirstNode);
		myStack.push(mySecondNode);
		myStack.push(myThirdNode);
		INode myNode = myStack.pop();
		myStack.printStack();
		assertEquals(myThirdNode,myNode);
	}

}
