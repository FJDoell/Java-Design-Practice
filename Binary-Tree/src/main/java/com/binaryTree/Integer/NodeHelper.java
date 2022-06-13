package com.binaryTree.Integer;

/**
 * Helper class for the DAO.
 * Handles assigning left or right values.
 * @author darkm
 *
 */
public class NodeHelper {
	
	/**
	 * Attempts to match two nodes.
	 * Returns the following:<br>
	 * The found node if they match values.<br>
	 * The left node if the search is lower.<br>
	 * The right node if the search is higher.<br>
	 * 
	 * @param search
	 * @return
	 */
	public IntegerNode findNode(IntegerNode searching, IntegerNode searchTerm) {
		if(searchTerm.getValue() == searching.getValue()) {
			System.out.println("Node found!");
			return searching;
		} else if(searchTerm.getValue() < searching.getValue()) {
			System.out.println("Node value is greater than search; getting left child.");
			return searching.getLeftValue();
		}
		System.out.println("Node value is less than search; getting right child.");
		return searching.getRightValue();
	}
	
	/**
	 * Attempts to add to a single node.
	 * Returns the following:<br>
	 * null if the node was added successfully.<br>
	 * The left node if it isn't null and would be filled.<br>
	 * The right node if it isn't null and would be filled.<br>
	 * 
	 * @param addingTo
	 * @param added
	 * @return
	 */
	public IntegerNode addNode(IntegerNode addingTo, IntegerNode added) {
		if(added.getValue() <= addingTo.getValue()) {
			if(addingTo.getLeftValue() == null) {
				System.out.println("Node left child is null; added!");
				addingTo.setLeftValue(added);
				return null;
			} else {
				System.out.println("Node left child has a value, continuing...");
				return addingTo.getLeftValue();
			}
		}
		// It's greater at this point
		if(addingTo.getRightValue() == null) {
			System.out.println("Node right child is null; added!");
			addingTo.setRightValue(added);
			return null;
		} else {
			System.out.println("Node right child has a value, continuing...");
			return addingTo.getRightValue();
		}
	}
	
	/**
	 * Attempts to remove from a single node.
	 * Returns the following:<br>
	 * Null if the node was removed successfully.<br>
	 * The left node if the value is equal AND the left node's value is also equal.<br>
	 * The left node if the value is lower.<br>
	 * The right node if the value is greater.<br>
	 * 
	 * @param removingFrom
	 * @param removing
	 * @return
	 */
	public IntegerNode removeNode(IntegerNode removingFrom, IntegerNode removing) {
		if(removing.getValue() == removingFrom.getValue()) {
			if(removingFrom.getLeftValue().getValue() == removing.getValue()) {
				System.out.println("Node found, but their child has the same value, continuing.");
				return removingFrom.getLeftValue();
			}
			System.out.println("Node found and removed!");
			removingFrom = null;
			return removingFrom;
		} else if(removing.getValue() < removingFrom.getValue()) {
			System.out.println("Node value is greater than search; getting left child.");
			return removingFrom.getLeftValue();
		}
		System.out.println("Node value is less than search; getting right child.");
		return removingFrom.getRightValue();
	}
	
}
