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
		boolean check = myLinkedList.getHead().equals(myThirdNode)
				&& myLinkedList.getHead().getNext().equals(mySecondNode) && myLinkedList.getTail().equals(myFirstNode);
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
		boolean check = myLinkedList.getHead().equals(myFirstNode)
				&& myLinkedList.getHead().getNext().equals(mySecondNode) && myLinkedList.getTail().equals(myThirdNode);
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
		// myLinkedList.addFromBottom(mySecondNode);
		myLinkedList.addFromBottom(myThirdNode);
		myLinkedList.insertNode(myFirstNode, mySecondNode);
		boolean check = myLinkedList.getHead().equals(myFirstNode)
				&& myLinkedList.getHead().getNext().equals(mySecondNode) && myLinkedList.getTail().equals(myThirdNode);
		assertTrue(check);
		myLinkedList.printMyNodes();
	}

	@Test
	public void givenNodeOf56_WhenDeleted_ShouldResultIn_NodeOf30_AsNewHeadNode() {
		MyNode<Integer> myFirstNode = new MyNode<Integer>(56);
		MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
		MyNode<Integer> myThirdNode = new MyNode<Integer>(70);
		MyLinkedList<Integer> myLinkedList = new MyLinkedList<Integer>();
		myLinkedList.addFromBottom(myFirstNode);
		myLinkedList.addFromBottom(mySecondNode);
		myLinkedList.addFromBottom(myThirdNode);
		MyNode<Integer> poppedNode = (MyNode<Integer>) myLinkedList.pop();
		boolean check = myLinkedList.getHead().equals(mySecondNode) && myLinkedList.getHead().getNext().equals(myThirdNode)
				&& myLinkedList.getTail().equals(myThirdNode)&&poppedNode.equals(myFirstNode);
		assertTrue(check);
		myLinkedList.printMyNodes();
	}

	@Test
	public void givenNodeOf70_WhenDeleted_ShouldResultIn_NodeOf30_AsNewTailNode() {
		MyNode<Integer> myFirstNode = new MyNode<Integer>(56);
		MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
		MyNode<Integer> myThirdNode = new MyNode<Integer>(70);
		MyLinkedList<Integer> myLinkedList = new MyLinkedList<Integer>();
		myLinkedList.addFromBottom(myFirstNode);
		myLinkedList.addFromBottom(mySecondNode);
		myLinkedList.addFromBottom(myThirdNode);
		MyNode<Integer> popped = (MyNode<Integer>) myLinkedList.popLast();
		boolean check = myLinkedList.getTail().equals(mySecondNode) && myLinkedList.getHead().getNext().equals(mySecondNode)&&popped.equals(myThirdNode);
		assertTrue(check);
		myLinkedList.printMyNodes();
	}

	@Test
	public void givenNodeOf30_WhenSearched_ShouldReturnTrue() {
		MyNode<Integer> myFirstNode = new MyNode<Integer>(56);
		MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
		MyNode<Integer> myThirdNode = new MyNode<Integer>(70);
		MyLinkedList<Integer> myLinkedList = new MyLinkedList<Integer>();
		myLinkedList.addFromBottom(myFirstNode);
		myLinkedList.addFromBottom(mySecondNode);
		myLinkedList.addFromBottom(myThirdNode);
		MyNode<Integer> newNode = (MyNode<Integer>) myLinkedList.searchNode((Integer) 30);

		boolean check = false;
		if (newNode != null && newNode.getKey().equals((Integer) 30))
			check = true;
		assertTrue(check);
		myLinkedList.printMyNodes();
	}

	@Test
	public void givenNodeOf30_WhenSearched_NodeOf40ShouldBeInsertedAfterNode30() {
		MyNode<Integer> myFirstNode = new MyNode<Integer>(56);
		MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
		MyNode<Integer> myThirdNode = new MyNode<Integer>(70);
		MyLinkedList<Integer> myLinkedList = new MyLinkedList<Integer>();
		myLinkedList.addFromBottom(myFirstNode);
		myLinkedList.addFromBottom(mySecondNode);
		myLinkedList.addFromBottom(myThirdNode);
		MyNode<Integer> newNode = (MyNode<Integer>) myLinkedList.searchNodeAndInsert((Integer) 30, (Integer) 40);

		boolean check = newNode != null && newNode.getNext().getKey().equals((Integer) 40);
		assertTrue(check);
		myLinkedList.printMyNodes();
	}

	@Test
	public void givenNodeOf40_WhenDeleted_TheSizeOfLinkedListShouldBecome3() {
		MyNode<Integer> myFirstNode = new MyNode<Integer>(56);
		MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
		MyNode<Integer> myThirdNode = new MyNode<Integer>(40);
		MyNode<Integer> myFourthNode = new MyNode<Integer>(70);
		MyLinkedList<Integer> myLinkedList = new MyLinkedList<Integer>();
		myLinkedList.addFromBottom(myFirstNode);
		myLinkedList.addFromBottom(mySecondNode);
		myLinkedList.addFromBottom(myThirdNode);
		myLinkedList.addFromBottom(myFourthNode);
		MyNode<Integer> newNode = (MyNode<Integer>) myLinkedList.searchNode((Integer) 40);

		if (newNode != null)
			myLinkedList.deleteNode(newNode);
		assertEquals(3, myLinkedList.size());
		myLinkedList.printMyNodes();
	}

	@Test
	public void givenNodesInLinkedListShouldBeAddedInAscendingOrder() {
		MyNode<Integer> myFirstNode = new MyNode<Integer>(56);
		MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
		MyNode<Integer> myThirdNode = new MyNode<Integer>(40);
		MyNode<Integer> myFourthNode = new MyNode<Integer>(70);
		MyLinkedList<Integer> myLinkedList = new MyLinkedList<Integer>();
		myLinkedList.addInSortedForm(myFirstNode);
		myLinkedList.addInSortedForm(mySecondNode);
		myLinkedList.addInSortedForm(myThirdNode);
		myLinkedList.addInSortedForm(myFourthNode);
		boolean check = myLinkedList.getHead().equals(mySecondNode)
				&& myLinkedList.getHead().getNext().equals(myThirdNode)
				&& myLinkedList.getHead().getNext().getNext().equals(myFirstNode)
				&& myLinkedList.getTail().equals(myFourthNode);
		assertTrue(check);
		myLinkedList.printMyNodes();
	}
}
