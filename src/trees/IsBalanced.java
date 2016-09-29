package trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class IsBalanced {
	
	public static int getHeight(Node root) {
		if (root == null) {
			return 0;
		}
		return Math.max(getHeight(root.left), getHeight(root.right)) + 1;
	}
	
	public static boolean isBalanced(Node root) {
		if (root == null) {
			return true;
		}
		
		int heightDiff = getHeight(root.left) - getHeight(root.right);
		if (Math.abs(heightDiff) > 1) {
			return false;
		} else {
			return isBalanced(root.left) && isBalanced(root.right);
		}
	}
	
	public static void printTree(Node root) {
	    Queue<Node> nodes= new LinkedList<>(); 
	    List<Node> listOfNodes = new ArrayList<Node>();
	    traverseLevels(root, listOfNodes,nodes);
	    int count = 0,level=0;

	    while (count < listOfNodes.size()){
	        int printLen= (int) Math.pow(2, level++);

	        for (int i=count; i < printLen -1 && i < listOfNodes.size();++i){
	            System.out.print(listOfNodes.get(i).value+" ");
	        }
	            System.out.println();
	            count = printLen-1;
	    }
	}
	
	private static void traverseLevels(Node root, List<Node> listOfNodes, Queue<Node> nodes) {
	    if (root!=null){
	        nodes.add(root);
	        listOfNodes.add(root);
	        while(!nodes.isEmpty()){
	            root= nodes.poll();
	            if (root.left!=null) {
	                listOfNodes.add(root.left);
	                nodes.add(root.left);
	            }
	            if (root.right!=null) {
	                listOfNodes.add(root.right);
	                nodes.add(root.right);
	            }
	        }
	    }
	}

	public static void main(String[] args) {
		Node node15 = new Node(15, null, null);
		Node node14 = new Node(14, null, null);
		Node node13 = new Node(13, null, null);
		Node node12 = new Node(12, null, null);
		Node node11 = new Node(11, null, null);
		Node node10 = new Node(10, null, null);
		Node node9 = new Node(9, null, null);
		Node node8 = new Node(8, null, null);
		Node node7 = new Node(7, node14, node15);
		Node node6 = new Node(6, node12, node13);
		Node node5 = new Node(5, node10, node11);
		Node node4 = new Node(4, node8, node9);
		Node node3 = new Node(3, node6, node7);
		Node node2 = new Node(2, node4, node5);
		Node node1 = new Node(1, node2, node3);
		printTree(node1);
		System.out.println();
		System.out.println(isBalanced(node1));
	}

}
