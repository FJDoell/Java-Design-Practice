package com.menu.createMaze;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maze.Maze;
import com.menu.core.InputType;
import com.menu.core.Menu;
import com.menu.core.MenuService;

@Service
public class CreateMaze {
	
	@Autowired
	MenuService menuServ;
	
	public Maze createMaze() {
		Menu myMenu = menuServ.generateInput(InputType.INPUT_INT_POSITIVE, "Enter the width of the maze.");
		int myMazeX = myMenu.getReturnedIntInput();
		myMenu = menuServ.generateInput(InputType.INPUT_INT_POSITIVE, "Enter the height of the maze.");
		int myMazeY = myMenu.getReturnedIntInput();
		
		Maze myMaze = new Maze(myMazeX, myMazeY);
		
		return myMaze;
	}

}
