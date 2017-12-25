package trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//Given a binary tree, design an algorithm which creates a linked list 
//of all the nodes at each depth (e.g., if you have a tree with depth D, you'll have D linked lists).
public class LevelLinkedLists {
	public static void createLevelArrayList(Node root, ArrayList<LinkedList<Node>> lists, int level) {
		if (root == null) {
			return;
		}
		
		LinkedList<Node> list = null;
		if (lists.size() == level) {
			list = new LinkedList<>();
			lists.add(list);
		} else {
			list = lists.get(level);
		}
		
		list.add(root);
		createLevelArrayList(root.left, lists, level + 1);
		createLevelArrayList(root.right, lists, level + 1);
	}
	
	public static ArrayList<LinkedList<Node>> createLevelArrayList(Node root) {
		ArrayList<LinkedList<Node>> lists = new ArrayList<>();
		createLevelArrayList(root, lists, 0);
		return lists;
	}
	
	public static void printLevelListBST(Node node, List<Node> newlevel, List<List<Node>> levelList) {
		List<Node> level = new LinkedList<Node>();
		for (Node u : newlevel) {
			level.addAll(u.getChildren());
		}
		
		if (!level.isEmpty()) {
			levelList.add(level);
			printLevelListBST(node, level, levelList);
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
		PrintTree.printTree(node1);
		System.out.println();
		ArrayList<LinkedList<Node>> lists = createLevelArrayList(node1);
		for (LinkedList<Node> list : lists) {
			System.out.println();
			for (Node node : list) {
				System.out.print(node.value + " ");
			}
		}
		
		List<List<Node>> levelList = new ArrayList<>();
		List<Node> list1 = new LinkedList<>();
		list1.add(node1);
		levelList.add(list1);
		printLevelListBST(node1, list1, levelList);
		
		for (List<Node> list : levelList) {
			System.out.println(list.size());
			for (Node node : list) {
				System.out.print(node.value + "\t");
			}
			System.out.println();
		}
	}

}
