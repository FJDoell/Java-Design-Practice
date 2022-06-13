package com;

import com.menu.example.ExampleMenu;
import com.menu.example.ExampleMenus;

public class Main {
	
	public static void main(String[] args) {
//		BinaryMenuInteger myMenu = new BinaryMenuInteger();
//		myMenu.routeMenu(BinaryIntMenu.MAIN);
		
		ExampleMenu myMenu = new ExampleMenu();
		myMenu.routeMenu(ExampleMenus.MAIN);
		
	}

}
