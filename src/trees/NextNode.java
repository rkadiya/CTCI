package trees;

public class NextNode {
	public static Node getNextNode(Node n) {
		if (n == null) {
			return null;
		}
		
		if (n.right != null) {
			Node next = getLeftMostChild(n.right);
			return next;
		} else {
			Node q = n;
			Node x = q.parent;
			while (x != null && x.left != q) {
				q = x;
				x = x.parent;
			}
			return x;
		}
	}
	
	private static Node getLeftMostChild(Node n) {
		Node next = n;
		if (next.left != null) {
			next = next.left;
		}
		return next;
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
		node1.parent = null;
		node2.parent = node1;
		node3.parent = node1;
		node4.parent = node2;
		node5.parent = node2;
		node6.parent = node3;
		node7.parent = node3;
		node8.parent = node4;
		node9.parent = node4;
		node10.parent = node5;
		node11.parent = node5;
		node12.parent = node6;
		node13.parent = node6;
		node14.parent = node7;
		node15.parent = node7;
		
		PrintTree.printTree(node1);
		System.out.println();
		System.out.println(getNextNode(node11).value + " is the root");
	}

}
