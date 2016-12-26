package miscellaneous;

import java.util.HashSet;
import java.util.Set;

public class SumPairs {
	public static void printSumPairsBadTimeComplexity(int[] arr, int k) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == k) {
					System.out.println(arr[i] + ":" + arr[j]);
				}
			}
		}
	}
	
	public static void printSumPairsGoodTimeComplexity(int[] arr, int k) {
		Set<Integer> mySet = new HashSet<>();
		for (int i = 0; i < arr.length; i++) {
			int value = arr[i];
			int target = k - value;
			
			if (mySet.contains(target)) {
				System.out.println(target + ":" + value);
			} else {
				mySet.add(value);
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = new int[]{1,2,3,4,5,6,7,8,9};
		printSumPairsBadTimeComplexity(arr, 10);
		System.out.println();
		printSumPairsGoodTimeComplexity(arr, 10);
	}

}
