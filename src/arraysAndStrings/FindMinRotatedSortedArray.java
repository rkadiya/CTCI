package arraysAndStrings;
public class FindMinRotatedSortedArray {

	public static void main(String[] args) {
		int[] arr = new int[]{5,6,7,8,1,2,3,4};
		int[] arr2 = new int[]{1,2,3,4,5,6,7,8};
		System.out.println(getMinSortedArray(arr2, 0, arr2.length - 1));
	}
	
	public static int getMinSortedArray(int[] A, int first, int last) {
		//if (first > last) {
			//return A[0];
		//}
		if (first == last) {
			return A[first];
		}
		int mid = (last + first)/2;
		
		if (A[mid] < A[mid-1]) {
			return A[mid];
		}
		
		if (A[mid + 1] < A[mid]) {
			return A[mid+1];
		}
		
		if (A[last] > A[mid]) {
			return getMinSortedArray(A, first, mid-1);
		}
		
		return getMinSortedArray(A, mid+1, last);
	}

}
