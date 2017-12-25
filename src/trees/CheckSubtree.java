package trees;

import java.util.LinkedList;
import java.util.Queue;

public class CheckSubtree {

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
		
		Node node18 = new Node(15, null, null);
		Node node17 = new Node(14, null, null);
		Node node16 = new Node(7, node14, node15);
		
		Node node21 = new Node(10, null, null);
		Node node20 = new Node(9, null, null);
		Node node19 = new Node(7, node20, node21);
		
		PrintTree.printTree(node1);
		PrintTree.printTree(node16);
		PrintTree.printTree(node19);
		System.out.println(isIdentical(node1, node9));
	}
	
	public static boolean isIdentical(Node t1, Node t2) {
		Node commonNode = getCommonNode(t1, t2);
		if (commonNode == null) return false;
		return inorder(commonNode, t2);
	}
	
	public static boolean inorder(Node n1, Node n2) {
		if (n1 == null && n2 == null) {
			return true;
		}
		
		boolean leftorder = inorder(n1.left, n2.left);
		
		if (!n1.equals(n2)) {
			return false;
		}
		
		boolean rightorder = inorder(n1.right, n2.right);
		return leftorder && rightorder;
	}
	
	public static Node getCommonNode(Node t1, Node t2) {
		if (t1 == null) {
			return null;
		}
		
		Node leftcommon = getCommonNode(t1.left, t2);
		
		if (t1.equals(t2)) {
			return t1;
		}
		
		Node rightcommon = getCommonNode(t1.right, t2);
		
		return leftcommon != null ? leftcommon : rightcommon;		
	}

}
