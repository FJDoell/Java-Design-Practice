package com.menu.example;

import java.util.HashSet;
import java.util.Set;

import com.menu.core.MenuFactory;

public class ExampleMenu {
	
	MenuFactory menuFact = null;
	
	public ExampleMenu() {
		menuFact = new MenuFactory();
	}

	/**
	 * Router. Routes the menu to the appropriate methods.
	 * @param route
	 */
	public void routeMenu(ExampleMenus menu) {
		while(menu.equals(ExampleMenus.MAIN)) {
			mainMenu();
		}
		while(menu.equals(ExampleMenus.ENTER_STRING)) {
			stringMenu();
		}
		while(menu.equals(ExampleMenus.ENTER_ANY_INT)) {
			enterInt();
		}
		while(menu.equals(ExampleMenus.ENTER_POSITIVE_INT)) {
			enterPositiveInt();
		}
	}
	
	/**
	 * Main menu
	 */
	public void mainMenu() {
		Set<String> options = new HashSet<String>();
		Set<String> opDescs = new HashSet<String>();
		options.add("Enter String");
		opDescs.add("Enter a string and display it in the console");
		
		options.add("Enter Any Int");
		opDescs.add("Enter an int and display it in the console");
		
		options.add("Enter Positive Int");
		opDescs.add("Enter a positive int and display it in the console");
		
		String selected = menuFact.chooseOption("EXAMPLE MENU TITLE", "This is a menu description!", options, opDescs);
		routeMenu(ExampleMenus.valueOf(selected.replaceAll(" ", "_")));
	}
	
	/**
	 * String menu
	 */
	public void stringMenu() {
		System.out.println((menuFact.inputString("Enter a string to display")));
		routeMenu(ExampleMenus.MAIN);
	}
	
	/**
	 * Enter int
	 */
	public void enterInt() {
		System.out.println((menuFact.inputAnyInt("Enter any integer")));
		routeMenu(ExampleMenus.MAIN);
	}
	
	/**
	 * Enter positive int
	 */
	public void enterPositiveInt() {
		System.out.println((menuFact.inputPositiveInt("Enter a positive integer")));
		routeMenu(ExampleMenus.MAIN);
	}
}
