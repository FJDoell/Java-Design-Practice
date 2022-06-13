package com.binaryTree.Integer;

public class NodeDao {
	IntegerRoot root;
	
	NodeHelper helper;
	
	public NodeDao() {
		this.root = new IntegerRoot();
		this.helper = new NodeHelper();
	}
	
	public NodeDao(int root) {
		this.root = new IntegerRoot(new IntegerNode(root));
		this.helper = new NodeHelper();
	}
	
	// FIND
	public IntegerNode findNode(int value) {
		IntegerNode searchTerm = new IntegerNode(value);
		IntegerNode searching = root.getRoot();
		System.out.println("search term: " + searchTerm);
		System.out.println("searching start: " + searching);
		
		while(searching != null) {
			searching = helper.findNode(searching, searchTerm);
			if(searching == null)
				break;
			if(searching.getValue() == value)
				return searching;
		}
		return searching;
	}
	
	// ADD
	public boolean addNode(int value) {
		IntegerNode newNode = new IntegerNode(value);
		IntegerNode addingTo = root.getRoot();
		while(addingTo != null) {
			addingTo = helper.addNode(addingTo, newNode);
		}
		return true;
	}
	
	// REMOVE
	public boolean removeNode(int value) {
		IntegerNode removeNode = new IntegerNode(value);
		IntegerNode removingFrom = root.getRoot();
		while(removingFrom != null) {
			removingFrom = helper.removeNode(removingFrom, removeNode);
		}
		return true;
	}
	
}
