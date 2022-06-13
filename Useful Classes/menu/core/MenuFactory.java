package com.menu.core;

import java.util.Set;

/**
 * In charge of making menus, running the appropriate methods, then returning the values obtained.
 * @author darkm
 *
 */
public class MenuFactory {
	
	public String inputString(String inputMessage) {
		Menu myMenu = new Menu(inputMessage);
		return myMenu.requestInputString(inputMessage);
	}
	
	public int inputPositiveInt(String inputMessage) {
		Menu myMenu = new Menu(inputMessage);
		return myMenu.requestInputPositiveInt(inputMessage);
	}
	
	public int inputAnyInt(String inputMessage) {
		Menu myMenu = new Menu(inputMessage);
		return myMenu.requestInputInt(inputMessage);
	}
	
	public String chooseOption(String inputMessage, String menuDescription, Set<String> options, Set<String> opDescs) {
		Menu myMenu = new Menu(inputMessage, menuDescription, options, opDescs);
		return myMenu.printMenuChoices();
	}

}
