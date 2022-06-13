package com.menu.binaryInt;

import java.util.LinkedHashSet;
import java.util.Set;

import com.binaryTree.Integer.NodeDao;
import com.menu.core.MenuFactory;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class BinaryMenuInteger {
	MenuFactory menuFact = null;
	NodeDao dao = null;
	
	private String selected = "MAIN";
	
	public BinaryMenuInteger() {
		this.menuFact = new MenuFactory();
		this.dao = null;
		this.selected = "MAIN";
	}
	
	public void initializeTree() {
		dao = new NodeDao(menuFact.inputAnyInt("Enter the root number"));
		routeMenu(BinaryIntMenu.MAIN);
	}
	
	/**
	 * Router. Routes the menu to the appropriate methods.
	 * @param route
	 */
	public void routeMenu(BinaryIntMenu menu) {
		if(dao == null) {
			initializeTree();
		}
		while(menu.equals(BinaryIntMenu.MAIN)) {
			mainMenu();
		}
		while(menu.equals(BinaryIntMenu.FIND)) {
			findByValue();
		}
		while(menu.equals(BinaryIntMenu.ADD)) {
			addNode();
		}
		while(menu.equals(BinaryIntMenu.REMOVE)) {
			removeNode();
		}
	}
	
	/**
	 * Main menu
	 */
	public void mainMenu() {
		Set<String> options = new LinkedHashSet<String>();
		Set<String> opDescs = new LinkedHashSet<String>();
		options.add("FIND");
		opDescs.add("Find a value in the tree");
		
		options.add("ADD");
		opDescs.add("Add a value to the tree");
		
		options.add("REMOVE");
		opDescs.add("remove a value from the tree");
		
		this.selected = menuFact.chooseOption("INT TREE MAIN", "How do you wish to alter this tree?", options, opDescs);
		routeMenu(BinaryIntMenu.valueOf(selected));
	}
	
	/**
	 * Find a node menu
	 */
	public void findByValue() {
		System.out.println("Found node feedback: " + dao.findNode(menuFact.inputAnyInt("Enter the value to find")));
		routeMenu(BinaryIntMenu.MAIN);
	}
	
	/**
	 * Add a node menu
	 */
	public void addNode() {
		System.out.println("Node added feedback: " + dao.addNode(menuFact.inputAnyInt("Enter the value to add")));
		routeMenu(BinaryIntMenu.MAIN);
	}
	
	/**
	 * Remove a node menu
	 */
	public void removeNode() {
		System.out.println("Node removed feedback: " + dao.removeNode(menuFact.inputAnyInt("Enter the value to remove")));
		routeMenu(BinaryIntMenu.MAIN);
	}
	
}
