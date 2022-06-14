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
	
	// Make sure root isn't null
	private void checkRoot() {
		if(this.root.getRoot() == null) {
			this.root = new IntegerRoot(new IntegerNode(0));
		}
	}
	
	// FIND
	public IntegerNode findNode(int value) {
		checkRoot();
		IntegerNode searchTerm = new IntegerNode(value);
		IntegerNode searching = root.getRoot();
//		System.out.println("search term: " + searchTerm);
//		System.out.println("searching start: " + searching);
		searching = helper.findNode(searching, searchTerm);
		return searching;
	}
	
	// ADD
	public boolean addNode(int value) {
		checkRoot();
		IntegerNode newNode = new IntegerNode(value);
		IntegerNode addingTo = root.getRoot();
		addingTo = helper.addNode(addingTo, newNode);
		return true;
	}
	
	// REMOVE
	public boolean removeNode(int value) {
		checkRoot();
		IntegerNode removeNode = new IntegerNode(value);
		root.setRoot(helper.removeNode(root.getRoot(), removeNode));
		System.out.println(root.getRoot());
		return true;
	}
	
}
