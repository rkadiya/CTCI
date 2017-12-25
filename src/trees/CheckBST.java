package trees;

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

	public static void main(String[] args) {
        int[] array = new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};		
		Node minimalBST = MinimalBST.createMinimalBST(array);
		PrintTree.printTree(minimalBST);
		System.out.println();
		System.out.println(isBST(minimalBST));
	}
}
