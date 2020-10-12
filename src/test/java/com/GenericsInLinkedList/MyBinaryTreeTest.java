package com.GenericsInLinkedList;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyBinaryTreeTest {

	@Test
	public void given3NumbersWhenAddedToBinaryTreeShouldReturnSize() {
		MyBinaryTree<Integer> myBinaryTree = new MyBinaryTree<Integer>();
		myBinaryTree.add(56);
		myBinaryTree.add(30);
		myBinaryTree.add(70);
		int size = myBinaryTree.getSize();
		assertEquals(3,size);
	}
	
	@Test
	public void given13NumberWhenAddedToBinaryTreeShouldReturnSize13() {
		MyBinaryTree<Integer> myBinaryTree = new MyBinaryTree<Integer>();
		myBinaryTree.add(3);
		myBinaryTree.add(11);myBinaryTree.add(16);myBinaryTree.add(22);
		myBinaryTree.add(30);myBinaryTree.add(40);myBinaryTree.add(56);
		myBinaryTree.add(60);myBinaryTree.add(70);myBinaryTree.add(95);
		myBinaryTree.add(63);myBinaryTree.add(65);myBinaryTree.add(67);
		int size = myBinaryTree.getSize();
		assertEquals(13,size);
	}

}
