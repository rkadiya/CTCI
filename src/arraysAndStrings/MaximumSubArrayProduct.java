package arraysAndStrings;


public class MaximumSubArrayProduct {

	public static void main(String[] args) {
		int[] arr = new int[]{2,3,-3,-4};
		System.out.println(maximumSubArrayProduct(arr));
	}
	
	public static int maximumSubArrayProduct(int[] A) {
		int[] min = new int[A.length];
		int[] max = new int[A.length];
		
		min[0] = max[0] = A[0];
		int result = A[0];
		
		int first = 0;
		int last = 0;
		
		for (int i = 1; i < A.length; i++) {
			if (A[i] > 0) {
				if (A[i]*max[i-1] > A[i]) {
					max[i] = A[i]*max[i-1];
					if (max[i] > result) {
						if (max[i] == A[i]) {
							first = i;
						}
						result = max[i];
						last = i;
					}
				} else {
					max[i] = A[i];
					if (max[i] > result) {
						if (max[i] == A[i]) {
							first = i;
						}
						result = max[i];
						last = i;
					}
				}
				min[i] = Math.min(A[i], A[i]*min[i-1]);
			} else {
				if (A[i]*min[i-1] > A[i]) {
					max[i] = A[i]*min[i-1];
					if (max[i] > result) {
						if (max[i] == A[i]) {
							first = i;
						}
						result = max[i];
						last = i;
					}
				} else {
					max[i] = A[i];
					if (max[i] > result) {
						if (max[i] == A[i]) {
							first = i;
						}
						result = max[i];
						last = i;
					}
				}
				min[i] = Math.min(A[i], A[i]*max[i-1]);
			}
		}
		System.out.println("First: " + first + " Last: " + last);
		return result;
	}

}

