package com.binaryTree.Integer;

import lombok.Data;

@Data
public class IntegerNode {
	private int value;
	private IntegerNode leftValue;
	private IntegerNode rightValue;
	
	public IntegerNode(int value) {
		this.value = value;
		this.leftValue = null;
		this.rightValue = null;
	}
	
}
