package miscellaneous;

public class FindKthLargest {
	static int[] arr = new int[]{6,7,5,9,8,3,2,1,4};
	public static void main(String[] args) {
		for (int i = 1; i <= arr.length; i++) {
			System.out.println(kthLargest(0, arr.length - 1, i));
		}
	}

	public static int kthLargest(int low, int high, int k) {
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
		if (arr.length - k == j + 1) {
			return pivot;
		} else if(arr.length - k < j + 1) {
				return kthLargest(low, j, k);
		} else {
			return kthLargest(i, high, k);
		}
	}
	
	public static void swap(int i, int j) {
		int temp = arr[j];
		arr[j] = arr[i];
		arr[i] = temp;
	}
}
