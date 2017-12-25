package trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BFSandDFS {
	
	public static void bfs(Node root) {
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);
		while (!q.isEmpty()) {
			Node u = q.poll();
			if (u != null) {
				System.out.println(u.value);
				u.state = State.visited;
				for (Node v : u.getChildren()) {
					if (v.state == State.unvisited && !q.contains(v)) {
						q.add(v);
					}
				}
			}
		}
	}
	
	public static void dfs(Node root) {
		Stack<Node> stack = new Stack<Node>();
		stack.push(root);
		while (!stack.isEmpty()) {
			Node u = stack.pop();
			if (u != null) {
				System.out.println(u.value);
				u.state = State.visited;
				for (Node v : u.getChildren()) {
					if (v.state == State.unvisited && !stack.contains(v)) {
						stack.push(v);
					}
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
		Node node9 = new Node(9, node14, node15);
		Node node8 = new Node(8, null, null);
		Node node7 = new Node(7, node14, node15);
		Node node6 = new Node(6, node12, node13);
		Node node5 = new Node(5, node10, node11);
		Node node4 = new Node(4, node8, node9);
		Node node3 = new Node(3, node6, node7);
		Node node2 = new Node(2, node4, node5);
		Node node1 = new Node(1, node2, node3);
		//bfs(node1);
		//System.out.println("\n");
		//System.out.println(isThereAPath(node2, node2));
		//System.out.println("\n");
		dfs(node1);
	}

}
