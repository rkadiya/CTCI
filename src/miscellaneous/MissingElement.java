package miscellaneous;

import java.util.Arrays;

public class MissingElement {
	static int[] arr = new int[]{1,2,3,4,5,6,8,9,10};

	public static void main(String[] args) {
		// Number of elements is 10 so expected sum is n(n+1)/2;
		int expectedSum = 10*(10+1)/2;
		int actualSum = Arrays.stream(arr).sum();
		System.out.println("Missing Element is: " + (expectedSum - actualSum));
	}

}
