package trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CheckBST {
	
	public static int PREVIOUS_MIN = Integer.MIN_VALUE;
	
	public static boolean isBST(Node n) {
		if (n == null) {
			return true;
		}
		
		if (!isBST(n.left)) {
			return false;
		}
		
		if (n.value < PREVIOUS_MIN) {
			return false;
		}
		PREVIOUS_MIN = n.value;
		
		if (!isBST(n.right)) {
			return false;
		}
		
		return true;
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
        int[] array = new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};		
		Node minimalBST = MinimalBST.createMinimalBST(array);
		printTree(minimalBST);
		System.out.println();
		System.out.println(isBST(minimalBST));
	}

}
