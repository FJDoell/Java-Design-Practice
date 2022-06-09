package com.maze;

import com.coordinates.Coordinates;

import lombok.Data;

/**
 * Stores a maze of a given size.
 * 
 * The start point is always the top left.
 * 
 * The goal is always the bottom right.
 * @author darkm
 *
 */
@Data
public class Maze {
	Coordinates[][] mazeGrid;
	int positionX;
	int positionY;
	int sizeX;
	int sizeY;
	
	public Maze(int sizeX, int sizeY) {
		super();
		this.sizeX = sizeX;
		this.sizeY = sizeY;
		this.mazeGrid = new Coordinates[sizeY][sizeX];
	}
	
}
