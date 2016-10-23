package sortingAndSearching;

public class FindElementInRotatedSortedArray {
	
	private static int getIndexOfElement(int[] a, int leftIndex, int rightIndex, int element) {
		int mid = (leftIndex + rightIndex)/2;
		if (rightIndex < leftIndex) {
			return -1;
		}
		
		if (a[mid] == element) {
			return mid;
		}
		
		if (a[leftIndex] <= a[mid]) {
			if (a[leftIndex] <= element && element <= a[mid]) {
				return getIndexOfElement(a, leftIndex, mid-1, element);
			} else {
				return getIndexOfElement(a, mid+1, rightIndex, element);
			}
		} else if (a[mid] <= a[leftIndex]) {
			if (a[mid] <= element && element <= a[rightIndex]) {
				return getIndexOfElement(a, mid+1, rightIndex, element);
			} else {
				return getIndexOfElement(a, leftIndex, mid-1, element);
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] myArray = {4,5,6,1,2,3};
		System.out.println(getIndexOfElement(myArray, 0, 5, 3));
	}

}
