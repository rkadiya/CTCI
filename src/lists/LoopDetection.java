package lists;

public class LoopDetection {
	
	public static Node isLoop(Node root) {
		if (root.next.next == null) {
			return null;
		}
		
		Node p1 = root;
		Node p2 = root;
		
		while (p2 != null && p2.next != null) {
			p1 = p1.next;
			p2 = p2.next.next;
			if (p1 == p2) {
				break;
			}
		}
		
		if (p2 == null || p2.next == null) {
			return null;
		}
		
		p1 = root;
		
		while (p1 != p2) {
			p1 = p1.next;
			p2 = p2.next;
		}
		
		return p2;
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
		
		node9.next = node4;
		
		//printList(node1);
		Node loopNode = isLoop(node1);
		System.out.println("\n");
		System.out.println(loopNode.value);
	}

}
