package miscellaneous;
import java.util.Arrays;

public class pythogores {
	public static void main(String[] args) {
		int[] arr = {2,3,4,5,7,8};
		Arrays.sort(arr);;
		int n = 6;
		int[] squarearr = {64, 49, 25, 16, 9, 4};
		
		for (int i = 0; i < 5; i++) {
			int l = i+1;
			int r = n-1;
			int sum = squarearr[i];
			
			while(l < r) {
				if (sum == squarearr[l]+squarearr[r]) {
					System.out.println("true");
					l++;
					r--;
				} else if (sum > squarearr[l]+squarearr[r]) {
					r--;
				} else {
					l++;
				}
			}
		}
	}

}
