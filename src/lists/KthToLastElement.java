package lists;

public class KthToLastElement {
	
	public static Node kthToLAstElement(Node root, int k) {
		if (k <= 0) {
			return null;
		}
		
		Node p1 = root;
		Node p2 = root;
		
		for (int i = 0; i < k - 1; i++) {
			if (p2 == null) {
				return null;
			}
			p2 = p2.next;
		}
		
		while (p2.next != null) {
			p1 = p1.next;
			p2 = p2.next;
		}
		return p1;
	}
	
	public static void printList(Node node) {
		Node myNode = node;
		while(myNode != null) {
			System.out.print(myNode.value + "->");
			myNode = myNode.next;
		}
		System.out.print("NULL");
	}
	public static void main(String[] args) {
		Node node9 = new Node(8, null);
		Node node8 = new Node(8,node9);
		Node node7 = new Node(7,node8);
		Node node6 = new Node(6,node7);
		Node node5 = new Node(4,node6);
		Node node4 = new Node(4,node5);
		Node node3 = new Node(3,node4);
		Node node2 = new Node(2,node3);
		Node node1 = new Node(1, node2);
		
		printList(node1);
		Node myNode = kthToLAstElement(node1, 3);
		System.out.println("\n");
		System.out.println(myNode.value);
	}

}
