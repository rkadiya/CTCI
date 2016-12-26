package miscellaneous;

public class Max2Values {
	static int[] arr = new int[]{4,5,7,2,1,8,2000,2002,15,12,19};
	public static void main(String[] args) {
		int max1 = Integer.MIN_VALUE;
		int max2 = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max1) {
				max2 = max1;
				max1 = arr[i];
			} else if (arr[i] > max2) {
				max2 = arr[i];
			}
		}
		System.out.println("Max1: " + max1 + " Max2:" + max2);
	}

}
