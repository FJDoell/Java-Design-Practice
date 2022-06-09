package com.coordinates;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * The basis for a coordinate (one space) that stores wall data.
 * @author darkm
 *
 */
@Data
@AllArgsConstructor
public class Coordinates {
	boolean leftWall;
	boolean rightWall;
	boolean topWall;
	boolean bottomWall;
}
