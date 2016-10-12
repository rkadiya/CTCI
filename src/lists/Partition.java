package lists;

public class Partition {
	
	public static Node getPartitioned(Node node, int key) {
		Node beforeStart = null;
		Node beforeEnd = null;
		Node afterStart = null;
		Node afterEnd = null;
		
		while (node != null) {
			Node next = node.next;
			node.next = null;
			if (node.value < key) {
				if (beforeStart == null) {
					beforeStart = node;
					beforeEnd = beforeStart;
				} else {
					beforeEnd.next = node;
					beforeEnd = node;
				}
			} else {
				if (afterStart == null) {
					afterStart = node;
					afterEnd = afterStart;
				} else {
					afterEnd.next = node;
					afterEnd = node;
				}
			}
			node = next;
		}
		
		if (beforeStart == null) {
			return afterStart;
		}
		
		beforeEnd.next = afterStart;
		
		return beforeStart;
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
		Node node9 = new Node(3, null);
		Node node8 = new Node(4,node9);
		Node node7 = new Node(2,node8);
		Node node6 = new Node(1,node7);
		Node node5 = new Node(5,node6);
		Node node4 = new Node(7,node5);
		Node node3 = new Node(9,node4);
		Node node2 = new Node(8,node3);
		Node node1 = new Node(6, node2);
		
		printList(node1);
		System.out.println();
		Node myNode = getPartitioned(node1, 7);
		printList(myNode);
	}

}
