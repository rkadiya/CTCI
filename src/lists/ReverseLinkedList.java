package lists;

public class ReverseLinkedList {
	
	public static Node reverseHead = null;
	
	public static void printList(Node node) {
		Node myNode = node;
		while(myNode != null) {
			System.out.print(myNode.value + "->");
			myNode = myNode.next;
		}
		System.out.print("NULL");
	}
	
	public static Node reverseList(Node node) {
		Node current = node;
		Node next = null;
		Node prev = null;
		
		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		
		return prev;
	}
	
	public static void reverseListRecursive(Node node) {
		ReverseUtil(node, null);
	}
	
	public static void ReverseUtil(Node curr, Node prev) {
		if (curr.next == null) {
			curr.next = prev;
			reverseHead = curr;
			return;
		}
		
		Node next = curr.next;
		curr.next = prev;
		ReverseUtil(next, curr);
		
	}

	public static void main(String[] args) {
		Node node9 = new Node(9, null);
		Node node8 = new Node(8,node9);
		Node node7 = new Node(7,node8);
		Node node6 = new Node(6,node7);
		Node node5 = new Node(5,node6);
		Node node4 = new Node(4,node5);
		Node node3 = new Node(3,node4);
		Node node2 = new Node(2,node3);
		Node node1 = new Node(1, node2);
		
		printList(node1);
		System.out.println();
		Node reverseNode = reverseList(node1);
		printList(reverseNode);
		System.out.println();
		reverseListRecursive(reverseNode);
		printList(reverseHead);
	}

}
