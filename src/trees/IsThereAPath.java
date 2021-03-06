package trees;

import java.util.Stack;

public class IsThereAPath {
	public static void main(String[] args) {
		Node node15 = new Node(15, null, null);
		Node node14 = new Node(14, null, null);
		Node node13 = new Node(13, null, null);
		Node node12 = new Node(12, null, null);
		Node node11 = new Node(11, null, null);
		Node node10 = new Node(10, node12, null);
		Node node9 = new Node(9, null, null);
		Node node8 = new Node(8, null, null);
		Node node7 = new Node(7, node14, node15);
		Node node6 = new Node(6, node12, node13);
		Node node5 = new Node(5, node10, node11);
		Node node4 = new Node(4, node8, node9);
		Node node3 = new Node(3, node6, node7);
		Node node2 = new Node(2, node4, node5);
		Node node1 = new Node(1, node2, node3);
		PrintTree.printTree(node1);
		System.out.println();
		System.out.println(isRoute(node10, node12));
	}
	
	public static boolean isRoute(Node first, Node second) {
		Stack<Node> s = new Stack<>();
		s.push(first);
		while (!s.isEmpty()) {
			Node n = s.pop();
			if (n!=null) {
				n.state = State.visited;
				for (Node v : n.getChildren()) {
					if(v.state == State.unvisited && v.equals(second)) {
						return true;
					}
					if (!s.contains(v)) {
						s.push(v);
					}
				}
			}
		}
		return false;
	}
}
