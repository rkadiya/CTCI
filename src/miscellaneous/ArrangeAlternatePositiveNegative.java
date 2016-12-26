package miscellaneous;

import java.util.Arrays;

public class ArrangeAlternatePositiveNegative {
	static int[] arr = new int[]{-1,2,-3,-4,-7,8,9,4,3};
	public static void main(String[] args) {
		boolean positivePrev = arr[0] > 0 ? true : false;
		for (int i = 1; i < arr.length; i++) {
			if (positivePrev && arr[i] < 0) {
				positivePrev = false;
			} else if (!positivePrev && arr[i] > 0) {
				positivePrev = true;
			} else if (positivePrev && arr[i] > 0) {
				int negIndex = findNegative(i + 1);
				if (negIndex > 0) {
					swap(i, negIndex);
				}
				positivePrev = false;
			} else if (!positivePrev && arr[i] < 0) {
				int posIndex = findPositive(i + 1);
				if (posIndex > 0) {
					swap(i, posIndex);
				}
				positivePrev = true;
			}
		}
		
		Arrays.stream(arr).forEach(System.out::print);
	}
	
	public static void swap(int i , int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public static int findPositive(int index) {
		for (int i = index; i < arr.length; i++) {
			if (arr[i] > 0) {
				return i;
			}
		}
		return -1;
	}
	
    public static int findNegative(int index) {
    	for (int i = index; i < arr.length; i++) {
			if (arr[i] < 0) {
				return i;
			}
		}
		return -1;
	}

}
