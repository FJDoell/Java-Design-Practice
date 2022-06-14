package com.binaryTree.Integer;

/**
 * Helper class for the DAO. Handles assigning left or right values.
 * 
 * @author darkm
 *
 */
public class NodeHelper {

	/**
	 * Attempts to match two nodes. Returns the following:<br>
	 * The found node if they match values.<br>
	 * The left node if the search is lower.<br>
	 * The right node if the search is higher.<br>
	 * 
	 * @param search
	 * @return
	 */
	public IntegerNode findNode(IntegerNode searching, IntegerNode searchTerm) {
		if (searching == null)
			return null;
		if (searchTerm.getValue() < searching.getValue()) {
			System.out.println("Node value is greater than search; getting left child.");
			searching = findNode(searching.getLeftValue(), searchTerm);
		} else if (searchTerm.getValue() > searching.getValue()) {
			System.out.println("Node value is less than search; getting right child.");
			searching = findNode(searching.getRightValue(), searchTerm);
		} else {
			System.out.println("Node found!");
		}
		return searching;
	}

	/**
	 * Attempts to add to a single node. Returns the following:<br>
	 * null if the node was added successfully.<br>
	 * The left node if it isn't null and would be filled.<br>
	 * The right node if it isn't null and would be filled.<br>
	 * 
	 * @param addingTo
	 * @param added
	 * @return
	 */
	public IntegerNode addNode(IntegerNode addingTo, IntegerNode added) {
		if (added.getValue() <= addingTo.getValue()) {
			if (addingTo.getLeftValue() == null) {
				System.out.println("Node left child is null; added!");
				addingTo.setLeftValue(added);
			} else {
				System.out.println("Node left child has a value, continuing... ");
				addNode(addingTo.getLeftValue(), added);
			}
		} else if (addingTo.getRightValue() == null) {
			System.out.println("Node right child is null; added!");
			addingTo.setRightValue(added);
		} else {
			System.out.println("Node right child has a value, continuing...");
			addNode(addingTo.getRightValue(), added);
		}
		return addingTo;
	}

	/**
	 * Attempts to remove from a single node. Returns the following:<br>
	 * Null if the node was removed successfully.<br>
	 * The left node if the value is equal AND the left node's value is also
	 * equal.<br>
	 * The left node if the value is lower.<br>
	 * The right node if the value is greater.<br>
	 * 
	 * @param current
	 * @param removing
	 * @return
	 */
	public IntegerNode removeNode(IntegerNode current, IntegerNode removing) {
	    if (current == null) {
	        return null;
	    }

	    if (removing.getValue() == current.getValue()) {
	    	System.out.println("Node found!");
			if(current.getRightValue() != null) {
				current.setValue(getSmallestValue(current.getRightValue()).getValue());
				return current;
			}
			else if(current.getLeftValue() != null) {
				current = current.getLeftValue();
				return current;
			}
			else if(current.getLeftValue() == null && current.getRightValue() == null) {
				current = null;
				return current;
			}
				
			System.out.println("current: " + current);
	    } else if (removing.getValue() < current.getValue()) {
	        current.setLeftValue(removeNode(current.getLeftValue(), removing));
	        return current;
	    }
	    current.setRightValue(removeNode(current.getRightValue(), removing));
	    return current;
	}

	private IntegerNode getSmallestValue(IntegerNode node) {
		if (node.getLeftValue() == null)
			return node;
		node = getSmallestValue(node.getLeftValue());
		return node;
	}

}
