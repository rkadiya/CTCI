package trees;

import java.util.LinkedList;
import java.util.List;

public class Node {
	public int value;
	public Node left;
	public Node right;
	public Node parent;
	public State state = State.unvisited;
	
	public Node(int value, Node left, Node right) {
		this.value = value;
		this.left = left;
		this.right = right;
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
