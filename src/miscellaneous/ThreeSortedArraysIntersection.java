package miscellaneous;

public class ThreeSortedArraysIntersection {
	static int[] arr1 = new int[]{2,3,6,7,9};
	static int[] arr2 = new int[]{1,3,5,6,8};
	static int[] arr3 = new int[]{3,6,10,12};

	public static void main(String[] args) {
		int i = 0;
		int j = 0;
		int k = 0;
		
		while(i < arr1.length && j < arr2.length && k < arr3.length) {
			if (arr1[i] == arr2[j] && arr2[j] == arr3[k]) {
				System.out.println(arr1[i]);
				i++; j++; k++;
			} else if (arr1[i] < arr2[j]) {
				i++;
			} else if (arr2[j] < arr3[k]) {
				j++;
			} else {
				k++;
			}
		}
	}

}
