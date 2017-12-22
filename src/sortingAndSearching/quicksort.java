package sortingAndSearching;
public class quicksort {
	public static void main(String[] args) {
		int[] arr = {7,8,9,3,2,6,1};
		for (int a : arr) {
			System.out.println(a);
		}
		quickSort(arr, 0, 6);
		System.out.println();
		for (int a : arr) {
			System.out.println(a);
		}
	}
	
	public static void quickSort(int[] arr, int low, int high) {
		int i = low;
		int j = high;
		int pivot = arr[low+(high-low)/2];
		
		while(i  < j) {
			while(arr[i] < pivot) {
				i++;
			}
			
			while(arr[j] > pivot) {
				j--;
			}
			
			if (i <= j) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}
		}
		
		if (low < j) {
			quickSort(arr, low, j);
		}
		
		if (i < high) {
			quickSort(arr, i, high);
		}
	}

}
