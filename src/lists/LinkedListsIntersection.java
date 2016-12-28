package lists;

public class LinkedListsIntersection {
	public static void printList(Node node) {
		Node myNode = node;
		while(myNode != null) {
			System.out.print(myNode.value + "->");
			myNode = myNode.next;
		}
		System.out.print("NULL");
	}
	
	public static Node getIntersection(Node node1, Node node2) {
		int node1Length = 0;
		int node2Length = 0;
		
		Node node1temp = node1;
		Node node2temp = node2;
		
		while (node1temp != null) {
			node1temp = node1temp.next;
			node1Length++;
		}
		
		while (node2temp != null) {
			node2temp = node2temp.next;
			node2Length++;
		}
		
		int diff = node2Length - node1Length;
		
		if (diff > 0) {
			for (int i = 0; i < Math.abs(diff); i++) {
				node2 = node2.next;
			}
		} else {
			for (int i = 0; i < Math.abs(diff); i++) {
				node1 = node1.next;
			}
		}
		
		while(node1 != null && node2 != null) {
			if (node1 == node2) {
				return node1;
			}
			node1 = node1.next;
			node2 = node2.next;
		}
		
		return null;
	}

	public static void main(String[] args) {

		Node node5 = new Node(5,null);
		Node node4 = new Node(4,node5);
		Node node3 = new Node(3,node4);
		Node node2 = new Node(2,node3);
		Node node1 = new Node(1, node2);
		
		Node node7 = new Node(7, node3);
		Node node6 = new Node(6,node7);
		
		printList(node1);
		System.out.println();
		printList(node6);
		System.out.println();
		System.out.println(getIntersection(node1, node6));
	}

}
