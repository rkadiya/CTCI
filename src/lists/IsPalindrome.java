package lists;

import java.util.Stack;

public class IsPalindrome {
	
	public static boolean isPalindrome(Node root) {
		
		if (root == null || root.next == null) {
			return false;
		}
		
		Stack<Node> stack = new Stack<Node>();
		
		Node p1 = root;
		Node p2 = root;
		
		while (p2 != null && p2.next != null) {
			stack.push(p1);
			p1 = p1.next;
			p2 = p2.next.next;
		}
		
		if (p2 != null) {
			stack.push(p1);
		}
		
		while (stack.size() != 0 && p1.value == stack.pop().value) {
			p1 = p1.next;
		}
		
		if (stack.size() != 0) {
			return false;
		}
		
		return true;
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
		Node node9 = new Node(1,null);
		Node node8 = new Node(2,node9);
		Node node7 = new Node(3,node8);
		Node node6 = new Node(4,node7);
		Node node5 = new Node(5,node6);
		Node node4 = new Node(4,node5);
		Node node3 = new Node(3,node4);
		Node node2 = new Node(2,node3);
		Node node1 = new Node(1,node2);
		
		printList(node1);
		System.out.println("\n");
		System.out.println(isPalindrome(node1));
	}

}
