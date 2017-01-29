package lists;

public class GetnthFromLast {
	
	public static void printList(Node node) {
		Node myNode = node;
		while(myNode != null) {
			System.out.print(myNode.value + "->");
			myNode = myNode.next;
		}
		System.out.print("NULL");
	}
	
	public static int getnthFromLast(Node head, int n) {
		Node runner = head;
	     int length = 0;
	     while (runner != null) {
	         runner = runner.next;
	         length++;
	     }
	     
	     System.out.println("Length: " + length);
	     int pos = length - 1 - n;
	     runner = head;
	    for (int i = 0; i < pos; i++) {
	        runner = runner.next;
	    }
	    
	    return runner.value;
	}

	public static void main(String[] args) {
		Node node4 = new Node(6,null);
		Node node3 = new Node(5,node4);
		Node node2 = new Node(3,node3);
		Node node1 = new Node(1, node2);
		
		printList(node1);
		int value = getnthFromLast(node1, 0);
		System.out.println("\n");
		System.out.println(value);
	}

}
