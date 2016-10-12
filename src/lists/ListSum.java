package lists;

public class ListSum {
	
	public static Node getSum(Node node1, Node node2) {
		int carry = 0;
		
		return node1;
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
		Node node6 = new Node(6, null);
		Node node1 = new Node(1,node6);
		Node node7 = new Node(7,node1);
		
		Node node2 = new Node(5,node7);
		Node node9 = new Node(9,node2);
		Node node5 = new Node(2,node9);
		
		printList(node1);
		System.out.println();
		Node sum = getSum(node7, node5);
		printList(sum);
	}

}
