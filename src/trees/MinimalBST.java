package trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class MinimalBST {
	
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
	
	static Node createMinimalBST(int[] arr, int start, int end) {
		if (end < start) {
			return null;
		}
		
		int mid = (start + end)/2;
		
		Node root = new Node(mid, null, null);
		root.left = createMinimalBST(arr, start, mid - 1);
		root.right = createMinimalBST(arr, mid + 1, end);
		return root;
	}
	
	static Node createMinimalBST(int[] arr) {
		return createMinimalBST(arr, 1, arr.length - 1);
	}

	public static void main(String[] args) {
		
		int[] array = new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		
		Node minimalBST = createMinimalBST(array);
		
		printTree(minimalBST);
		System.out.println();
	}

}
