package sortingAndSearching;

public class MergeSortedArrays {
	
	private static int[] getMerged(int[] a, int[] b) {
		int aIndex = a.length - 1;
		int bIndex = b.length - 1;
		int[] c = new int[a.length + b.length];
		int cIndex = c.length - 1;
		
		while (aIndex >=0 && bIndex >=0) {
			if (a[aIndex] > b[bIndex]) {
				c[cIndex] = a[aIndex];
				cIndex--;
				aIndex--;
			} else {
				c[cIndex] = b[bIndex];
				cIndex--;
				bIndex--;
			}
		}
		
		if (bIndex >= 0) {
			c[cIndex] = b[bIndex];
			cIndex--;
			bIndex--;
		}
		
		if (aIndex >= 0) {
			c[cIndex] = a[aIndex];
			cIndex--;
			aIndex--;
		}
		
		return c;
		
	}
	
	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[] a = new int[]{2,3,4,6,8};
		int[] b = new int[]{1,5,7,9};
		
		printArray(a);
		printArray(b);
		
		int[] mergedArray = getMerged(a, b);
		
		printArray(mergedArray);
		
	}

}
