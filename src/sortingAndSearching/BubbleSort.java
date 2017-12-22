package sortingAndSearching;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = {3,5,6,2,8,9,1};
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length-1; j++) {
				if (arr[j] > arr[j+1] ) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		for (int a : arr) {
			System.out.println(a);
		}
	}

}
