package trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//Given a sorted (increasing order) array with unique integer elements, 
//write an algorithm to create a binary search tree with minimal height.
public class MinimalBST {
	static Node createMinimalBST(int[] arr, int start, int end) {
		if (end < start) {
			return null;
		}
		
		int mid = (start + end)/2;
		
		Node root = new Node(arr[mid], null, null);
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
		PrintTree.printTree(minimalBST);
		System.out.println();
	}

}
