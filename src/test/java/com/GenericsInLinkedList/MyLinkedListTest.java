package com.GenericsInLinkedList;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyLinkedListTest {

	@Test
	public void givenNumber_ShouldBeAddedInLinkedList_FromTop() {
		MyNode<Integer> myFirstNode = new MyNode<Integer>(70);
		MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
		MyNode<Integer> myThirdNode = new MyNode<Integer>(56);
		MyLinkedList<Integer> myLinkedList = new MyLinkedList<Integer>();
		myLinkedList.add(myFirstNode);
		myLinkedList.add(mySecondNode);
		myLinkedList.add(myThirdNode);
		boolean check = myLinkedList.getHead().equals(myThirdNode)&&myLinkedList.getHead().getNext().equals(mySecondNode)&&myLinkedList.getTail().equals(myFirstNode);
		assertTrue(check);
		myLinkedList.printMyNodes();
	}

}
