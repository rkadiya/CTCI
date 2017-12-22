package sortingAndSearching;

public class SelectionSort {
	public static void main(String[] args) {
		int[] arr = {3,4,5,2,1,8,6,9};
		int n = arr.length;
		 
        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;
 
            // Swap the found minimum element with the first
            // element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
		
		for (int a : arr) {
			System.out.println(a);
		}
	}
}
