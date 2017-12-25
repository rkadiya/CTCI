package trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Node {
	public int value;
	public Node left;
	public Node right;
	public Node parent;
	public State state = State.unvisited;
	List<Node> children = new ArrayList<>();
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + value;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Node other = (Node) obj;
		if (value != other.value)
			return false;
		return true;
	}

	public void addChild(Node node) {
		this.children.add(node);
		node.parent = this;
	}
	
	public Node getParent() {
		return parent;
	}

	public void setParent(Node parent) {
		this.parent = parent;
	}
	
	public Node(int value) {
		this.value = value;
	}

	public Node(int value, Node left, Node right) {
		this.value = value;
		this.left = left;
		this.right = right;
		if (this.left != null) {
			this.left.parent = this;
		}
		if (this.right != null) {
			this.right.parent = this;
		}
	}
	
	public Node(int value, List<Node> children) {
		this.value = value;
		this.children = children;
		for (Node child : children) {
			child.parent = this;
		}
	}
	
	public List<Node> getChildren() {
		List<Node> list = new LinkedList<Node>();
		if (this.left != null) {
			list.add(this.left);
		}
		if (this.right != null) {
			list.add(this.right);
		}
		return list;
	}
}
