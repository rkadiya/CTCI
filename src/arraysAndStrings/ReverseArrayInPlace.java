package arraysAndStrings;

public class ReverseArrayInPlace {

	public static void main(String[] args) {
		int[] arr = new int[]{1,2,3,4,5};
		for (int a : arr) {
			System.out.print(a);
		}
		
		for (int i = 0; i < arr.length/2; i++) {
			int temp = arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = arr[i];
			arr[i] = temp;
		}
		
		for (int a : arr) {
			System.out.print(a);
		}
	}

}
