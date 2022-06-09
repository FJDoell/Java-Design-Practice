package com.menu.core;

/**
 * This is where you'll put your actual menus!
 * I recommend putting the main menu here.
 * @author darkm
 *
 */
public class MenuService {

	public Menu generateInput(InputType inputType, String desiredInput) {
		Menu myMenu = new Menu(desiredInput);
		switch(inputType) {
		case INPUT_INT:
			myMenu.requestInputInt(desiredInput);
			break;
		case INPUT_INT_POSITIVE:
			myMenu.requestInputPositiveInt(desiredInput);
			break;
		case INPUT_STRING:
			myMenu.requestInputString(desiredInput);
			break;
		default:
			myMenu.invalidInputType();
			break;
		}
		return myMenu;
	}
}
