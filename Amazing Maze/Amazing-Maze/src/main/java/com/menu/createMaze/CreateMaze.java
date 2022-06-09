package com.menu.createMaze;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maze.Maze;
import com.menu.core.MainMenuService;

@Service
public class CreateMaze {
	
	@Autowired
	MainMenuService menuServ;
	
	public static Maze createMaze() {
		ArrayList<String> options = new ArrayList<String>();
		
		int myMazeX = menuServ.requestInputInt();
		int myMazeY = 
		
		Maze myMaze = new Maze(myMazeX, myMazeX);
		
		return myMaze;
	}

}
