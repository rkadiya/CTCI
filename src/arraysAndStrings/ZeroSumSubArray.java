package arraysAndStrings;

import java.util.HashMap;
import java.util.Map;

public class ZeroSumSubArray {
	static int[] arr = new int[]{2,3,4,5,-5,-4};
	public static void main(String[] args) {
		System.out.println(isZeroSumSubArrayPresent());
	}
	
	public static boolean isZeroSumSubArrayPresent() {
	    Map<Integer, Integer> sumMap = new HashMap<>();
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			if (arr[i] == 0 || sum == 0 || sumMap.containsKey(sum)) {
				return true;
			}
			sumMap.put(sum, i);
		}
		return false;
	}

}
