package lists;

import java.util.Stack;

public class AddListsUsingStacks {
	
	public static void printList(Node node) {
		Node myNode = node;
		while(myNode != null) {
			System.out.print(myNode.value + "->");
			myNode = myNode.next;
		}
		System.out.print("NULL");
	}
	
	public static Node addUsingStacks(Node n1, Node n2) {
		Node first = n1;
		Node second = n2;
		Stack s1 = new Stack();
		Stack s2 = new Stack();
		Stack s3 = new Stack();
		while(first != null) {
			s1.push(first.value);
			first = first.next;
		}
		while(second != null) {
			s2.push(second.value);
			second = second.next;
		}
		int carry = 0;
		while(s1.size() != 0 || s2.size() != 0) {
			int a = s1.size() != 0 ? (int) s1.pop() : 0;
			int b = s2.size() != 0 ? (int) s2.pop() : 0;
			s3.push((a+b+carry)%10);
			carry = ((a+b+carry)/10);
		}
		
		s3.push(carry);
		
		Node prev = null;
		Node head = null;
		if (s3.size() != 0) {
			prev = new Node((int)s3.pop(), null);
			head = prev;
		}
		
		while (s3.size() != 0) {
			Node presentNode = new Node((int)s3.pop(), null);
			prev.next = presentNode;
			prev = presentNode;
		}
		return head;	
	}

	public static void main(String[] args) {
		Node node5 = new Node(1, null);
		Node node4 = new Node(7,node5);
		Node node3 = new Node(9,node4);
		Node node2 = new Node(9,node3);
		Node node1 = new Node(9,node2);
		printList(node1);
		System.out.println();
		
		Node node8 = new Node(8, null);
		Node node7 = new Node(9,node8);
		Node node6 = new Node(9,node7);
		printList(node6);
		System.out.println();
		
		Node sum = addUsingStacks(node1, node6);
		printList(sum);
	}

}
