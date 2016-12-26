package miscellaneous;

import java.util.Arrays;

public class QuickSort {
	static int[] arr = new int[]{6,7,5,9,8,3,2,1,4};
	public static void main(String[] args) {
		Arrays.stream(arr).forEach(System.out::print);
		quickSort(0, arr.length - 1);
		System.out.println();
		Arrays.stream(arr).forEach(System.out::print);
	}
	
	public static void quickSort(int low, int high) {
		int i = low;
		int j = high;
		int pivot = arr[(j + i)/2];
		while(i <= j) {
			while (arr[i] < pivot) {
				i++;
			}
			while (arr[j] > pivot) {
				j--;
			}
			if (i <= j) {
				swap(i, j);
				i++;
				j--;
			}
			
		}
		if (low <= j) {
			quickSort(low, j);
		}
		
		if (i <= high) {
			quickSort(i, high);
		}
	}
	
	public static void swap(int i, int j) {
		int temp = arr[j];
		arr[j] = arr[i];
		arr[i] = temp;
	}
}
