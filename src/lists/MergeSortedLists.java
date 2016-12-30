package lists;

public class MergeSortedLists {
	public static void printList(Node node) {
		Node myNode = node;
		while(myNode != null) {
			System.out.print(myNode.value + "->");
			myNode = myNode.next;
		}
		System.out.print("NULL");
	}
	
	private static Node mergeSortedLists(Node n1, Node n2) {
		Node head = new Node(0, null);
		Node p = head;
		
		Node p1 = n1;
		Node p2 = n2;
		
		while (p1 != null && p2 != null) {
			if (p1.value < p2.value) {
				p.next = p1;
				p1 = p1.next;
			} else {
				p.next = p2;
				p2 = p2.next;
			}
			p = p.next;
		}
		
		if (p1 != null) {
			p.next = p1; 
		}
		
		if (p2 != null) {
			p.next = p2;
		}
		
		return head.next;
	}

	public static void main(String[] args) {
		Node node7 = new Node(7, null);
		Node node5 = new Node(5, node7);
		Node node3 = new Node(3, node5);
		Node node1 = new Node(1, node3);
		
		Node node6 = new Node(6, null);
		Node node4 = new Node(4, node6);
		Node node2 = new Node(2, node4);
		
		printList(node1);
		System.out.println();
		printList(node2);
		System.out.println();
		Node merge = mergeSortedLists(node1, node2);
		printList(merge);
	}

}
