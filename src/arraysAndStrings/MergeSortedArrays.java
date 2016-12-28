package arraysAndStrings;

import java.util.Arrays;

public class MergeSortedArrays {
	static int[] arr1 = new int[]{1,1,3,4,4,7,7,7};
	static int[] arr2 = new int[]{1,2,2,2,5,5,6};

	public static void main(String[] args) {
		int[] mergedArray = new int[arr1.length + arr2.length];
		int i = 0;
		int j = 0;
		int k = 0;
		
		while (i < arr1.length && j < arr2.length && k < mergedArray.length) {
			System.out.println("i" + i + ":" + " j" + j);
			if (arr1[i] == arr2[j]) {
				mergedArray[k++] = arr1[i++];
				mergedArray[k++] = arr2[j++];
			} else if (arr1[i] < arr2[j]) {
				mergedArray[k++] = arr1[i++];
			} else {
				mergedArray[k++] = arr2[j++];
			}
		}
		
		while (i < arr1.length) {
			mergedArray[k++] = arr1[i++];
		}
		
		while (j < arr2.length) {
			mergedArray[k++] = arr2[j++];
		}
		
		Arrays.stream(mergedArray).forEach(System.out::print);
	}

}
