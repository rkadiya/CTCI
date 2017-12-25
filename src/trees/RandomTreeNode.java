package trees;

import java.util.Random;

class RandomTreeNode {
	private int data;
	public RandomTreeNode left;
	public RandomTreeNode right;
	private int size = 0;

	public RandomTreeNode(int d) {
		data = d;
		size = 1;
	}

	public RandomTreeNode getRandomNode() {
		int leftSize = this.left == null ? 0 : this.left.size();
		Random random = new Random();
		int index = random.nextInt(size);
		if (index < leftSize) {
			return this.left.getRandomNode();
		} else if (index == leftSize) {
			return this;
		} else {
			return this.right.getRandomNode();
		}
	}

	public void insertInOrder(int d) {
		if (d <= data) {
			if (this.left == null) {
				this.left = new RandomTreeNode(d);
			} else {
				this.left.insertInOrder(d);
			}
		} else {
			if (this.right == null) {
				this.right = new RandomTreeNode(d);
			} else {
				this.right.insertInOrder(d);
			}
		}
		this.size++;
	}

	public int size() {
		return this.size;
	}

	public int data() {
		return this.data;
	}

	public RandomTreeNode find(int d) {
		if (d == this.data) {
			return this;
		} else if (d <= this.data) {
			return this.left != null ? this.left.find(d) : null;
		} else if (d > this.data) {
			return this.right != null ? this.right.find(d) : null;
		}
		return null;
	}

	public static void main(String[] args) {
		RandomTreeNode treeNode = new RandomTreeNode(8);
		treeNode.insertInOrder(4);
		treeNode.insertInOrder(12);
		treeNode.insertInOrder(1);
		treeNode.insertInOrder(13);
		treeNode.insertInOrder(5);
		treeNode.insertInOrder(14);
		RandomTreeNode randomNode = treeNode.getRandomNode();
		System.out.println(randomNode.data);
	}
}