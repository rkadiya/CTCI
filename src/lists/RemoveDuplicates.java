package lists;

import java.util.Hashtable;

public class RemoveDuplicates {
	
	public static void removeDups(Node root) {
		Hashtable<Integer, Boolean> table = new Hashtable<Integer, Boolean>();
		Node node = root;
		Node previous = null;
		while (node != null) {
			if(table.containsKey(node.value)) {
				previous.next = node.next;
			} else {
				table.put(node.value, true);
				previous = node;
			}
			node = node.next;
		}
	}
	
	public static void removeDupsNoExtraSpace(Node root) {
		Node first = root;
		
		while(first != null) {
			Node second = first;
			while (second.next != null) {
				if (first.value == second.next.value) {
					first.next = second.next.next;
				} else {
					second = second.next;
				}
			}
			first = first.next;
		}
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
		//removeDups(node1);
		removeDupsNoExtraSpace(node1);
		System.out.println("\n");
		printList(node1);
	}

}
