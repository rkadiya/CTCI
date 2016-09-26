package lists;

public class DeleteMiddleElement {
	
	public static void deleteMiddleElement(Node middleElement) {
		if (middleElement.next == null) {
			return; // Cannot delete last element;
		}
		
		Node p1 = middleElement;
		Node p2 = p1.next;
		p1.value = p2.value;
		p1.next = p2.next;
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
		deleteMiddleElement(node5);
		System.out.println("\n");
		printList(node1);
	}

}
