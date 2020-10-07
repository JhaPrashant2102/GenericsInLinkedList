package com.GenericsInLinkedList;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyNodeTest {

	@Test
	public void givenThreeNumbers_WhenLinked_shouldReturnLinkedList() {
		MyNode<Integer> myFirstNode = new MyNode<Integer>(56);
		MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
		MyNode<Integer> myThirdNode = new MyNode<Integer>(70);
		
		myFirstNode.setNext(mySecondNode);
		mySecondNode.setNext(myThirdNode);
		
		boolean check = myFirstNode.getNext().equals(mySecondNode)&&myFirstNode.getNext().getNext().equals(myThirdNode)&&mySecondNode.getNext().equals(myThirdNode);
		assertTrue(check);
	}

}
