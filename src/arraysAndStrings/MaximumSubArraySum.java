package arraysAndStrings;


public class MaximumSubArraySum {
	public static void main(String[] args) {
		int[] arr = new int[]{-2,1,-3,4,-1,2,1,-5,4};
		int[] arr2 = new int[]{-1,-2, -3, 3, 2, 1};
		System.out.println(maxSubArray(arr2));
	}
	
	public static int maxSubArray(int[] A) {
		   int newSum = A[0];
		   int max = A[0];
		   
		   int first = 0;
		   int last = 0;
		   
		   for (int i = 1; i < A.length; i++) {
			   if (newSum + A[i] > A[i]) {
				   newSum = newSum + A[i];
				   
				   if (newSum > max) {
					   max = newSum;
					   last = i;
				   }
			   } else {
				   newSum = A[i];
				   
				   if (newSum > max) {
					   first = i;
					   max = newSum;
					   last = i;
				   }
			   }
		   }
		   System.out.println("First: " + first + " Last: " + last);
	       return max;
	    }

}

