package arraysAndStrings;

public class RemoveDuplicatesSortedArray {
	static int[] arr = new int[]{1,1,2,2,2,3,3,4,4,4,4,5};
	public static void main(String[] args) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
		System.out.println();
		int last = removeDuplicates();
		for (int i = 0; i < last; i++) {
			System.out.print(arr[i]);
		}
	}

	static int removeDuplicates() {
		int i = 1;
		int j = 0;
		
		while (i < arr.length) {
			if (arr[i] == arr[j]) {
				i++;
			} else {
				j++;
				arr[j] = arr[i];
				i++;
			}
		}
		
		return j + 1;
	}
}
