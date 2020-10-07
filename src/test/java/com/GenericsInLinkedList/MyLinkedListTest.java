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
		myLinkedList.addFromTop(myFirstNode);
		myLinkedList.addFromTop(mySecondNode);
		myLinkedList.addFromTop(myThirdNode);
		boolean check = myLinkedList.getHead().equals(myThirdNode)&&myLinkedList.getHead().getNext().equals(mySecondNode)&&myLinkedList.getTail().equals(myFirstNode);
		assertTrue(check);
		myLinkedList.printMyNodes();
	}
	
	@Test
	public void givenNumber_ShouldBeAddedInLinkedList_FromBottom() {
		MyNode<Integer> myFirstNode = new MyNode<Integer>(56);
		MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
		MyNode<Integer> myThirdNode = new MyNode<Integer>(70);
		MyLinkedList<Integer> myLinkedList = new MyLinkedList<Integer>();
		myLinkedList.addFromBottom(myFirstNode);
		myLinkedList.addFromBottom(mySecondNode);
		myLinkedList.addFromBottom(myThirdNode);
		boolean check = myLinkedList.getHead().equals(myFirstNode)&&myLinkedList.getHead().getNext().equals(mySecondNode)&&myLinkedList.getTail().equals(myThirdNode);
		assertTrue(check);
		myLinkedList.printMyNodes();
	}
	
	@Test
	public void givenNodeOf30_ShouldBeInsertedBetweenNodeOf56and70_InTheLinkedList() {
		MyNode<Integer> myFirstNode = new MyNode<Integer>(56);
		MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
		MyNode<Integer> myThirdNode = new MyNode<Integer>(70);
		MyLinkedList<Integer> myLinkedList = new MyLinkedList<Integer>();
		myLinkedList.addFromBottom(myFirstNode);
		//myLinkedList.addFromBottom(mySecondNode);
		myLinkedList.addFromBottom(myThirdNode);
		myLinkedList.insertNode(myFirstNode,myThirdNode,mySecondNode);
		boolean check = myLinkedList.getHead().equals(myFirstNode)&&myLinkedList.getHead().getNext().equals(mySecondNode)&&myLinkedList.getTail().equals(myThirdNode);
		assertTrue(check);
		myLinkedList.printMyNodes();
	}

}
