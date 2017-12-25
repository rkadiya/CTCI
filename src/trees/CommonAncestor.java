package trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CommonAncestor {
	public static boolean covers(Node root, Node n) {
		if (root == null) {
			return false;
		}
		if (root == n) {
			return true;
		}
		return covers(root.left, n) || covers(root.right, n);
	}
	
	public static Node commonAncestor(Node root, Node p, Node q) {
		if (root == null) {
			return null;
		}
		
		if (root == p || root == q) {
			return root;
		}
		
		boolean bool_p_on_left = covers(root.left, p);
		boolean bool_q_on_left = covers(root.left, q);
		
		if (bool_p_on_left != bool_q_on_left) {
			return root;
		}
		
		Node child_side = bool_p_on_left ? root.left : root.right;
		
		return commonAncestor(child_side, p, q);
	}
	
	public static Node getCommonAncestor(Node root, Node p, Node q) {
		if (root == null) {
			return null;
		}
		if (!covers(root, p) || !covers(root, q)) {
			return null;
		}
		return commonAncestor(root, p, q);
	}

	public static void main(String[] args) {
		Node node15 = new Node(15, null, null);
		Node node14 = new Node(14, null, null);
		Node node13 = new Node(13, null, null);
		Node node12 = new Node(12, null, null);
		Node node11 = new Node(11, null, null);
		Node node10 = new Node(10, null, null);
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
		System.out.println(getCommonAncestor(node1, node8, node15).value);
	}

}
