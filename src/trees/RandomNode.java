package trees;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomNode {
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
		
		List<Node> nodeList = new ArrayList<>();
		getNodeList(node1, nodeList);
		Random r = new Random();
		int random = r.nextInt(nodeList.size());
		System.out.println(nodeList.get(random).value);
	}
	
	public static void getNodeList(Node root, List<Node> nodeList) {
		if (root == null) {
			return;
		}
		getNodeList(root.left, nodeList);
		nodeList.add(root);
		getNodeList(root.right, nodeList);
	}

}
