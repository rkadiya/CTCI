package miscellaneous;

public class ArrayUnionIntersection {
	public static void printUnion(int[] arr1, int[] arr2) {
		int i = 0;
		int j = 0;
		
		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] < arr2[j]) {
				System.out.print(arr1[i]);
				i++;
			} else if (arr1[i] > arr2[j]) {
				System.out.print(arr2[j]);
				j++;
			}
			else {
				System.out.print(arr2[j]);
				i++;
				j++;
			}
		}
		
		if (i < arr1.length) {
			System.out.print(arr1[i]);
			i++;
		}
		
		if (j < arr2.length) {
			System.out.print(arr2[j]);
			j++;
		}
	}
	
	public static void printIntersection(int[] arr1, int[] arr2) {
		int i = 0;
		int j = 0;
		
		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] < arr2[j]) {
				//System.out.print(arr1[i]);
				i++;
			} else if (arr1[i] > arr2[j]) {
				//System.out.print(arr2[j]);
				j++;
			} else {
				System.out.print(arr2[j++]);
				i++;
			}
		}
	}

	public static void main(String[] args) {
		int[] arr1 = new int[]{1,3,4,5,7,8,9};
		int[] arr2 = new int[]{2,3,5,6,7,8};
		printUnion(arr1, arr2);
		System.out.println();
		printIntersection(arr1, arr2);
	}

}
