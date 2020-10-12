package com.GenericsInLinkedList;

public class MyBinaryTree<T extends Comparable<T>> {
	private MyBinaryNode<T> root;

	public void add(T key) {
		this.root = this.addRecursively(root, key);
	}

	private MyBinaryNode<T> addRecursively(MyBinaryNode<T> root, T key) {
		if (root == null) {
			return new MyBinaryNode<T>(key);
		}
		if (root.getKey().compareTo(key) == 0) {
			return root;
		}
		else if (root.getKey().compareTo(key) > 0) {
			root.setRight(addRecursively(root.getRight(),key));
			return root;
		}
		else{
			root.setLeft(addRecursively(root.getLeft(), key));
			return root;
		}
	}

	public int getSize() {
		return getSizeRecursively(root);
	}

	private int getSizeRecursively(MyBinaryNode<T> currentRoot) {
		if(currentRoot==null)
			return 0;
		return 1+getSizeRecursively(currentRoot.getLeft())+getSizeRecursively(currentRoot.getRight());
	}

}
