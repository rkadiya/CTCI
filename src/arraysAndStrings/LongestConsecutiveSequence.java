package arraysAndStrings;

import java.util.HashSet;
import java.util.Set;


public class LongestConsecutiveSequence {

	public static void main(String[] args) {
		int[] arr = new int[]{6,8,7,18,19,20,17,16,15,11,10,12,2,3,1,4};
		System.out.println(getLongestConsecutiveSequence(arr));
	}
	
	public static int getLongestConsecutiveSequence(int[] A) {
		int result = 1;
		
		Set<Integer> hashSet = new HashSet<>();
		for (int i = 0; i < A.length; i++) {
			hashSet.add(A[i]);
		}
		
		for (int i = 0; i < A.length; i++) {
			int count = 1;
			int left = A[i] - 1;
			int right = A[i] + 1;
			
			while(hashSet.contains(left)) {
				count++;
				hashSet.remove(left);
				left--;
			}
			
			while(hashSet.contains(right)) {
				count++;
				hashSet.remove(right);
				right++;
			}
			
			result = Math.max(result, count);
		}
		return result;
	}

}

