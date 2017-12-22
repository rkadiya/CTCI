package miscellaneous;
import java.util.Arrays;

public class nksum {
	

	public static void main(String[] args) {
		int[] arr = {2,3,4,6,7,1,5,9,8};
		int n = arr.length;
		int k = 3;
		int x = 9;
		Arrays.sort(arr);
		int l;
		int r;
		for (int i = 0 ; i < n-k-1; i++) {
			l = i+1;
			r = n-1;
			while(l<r) {
				if(arr[i] + arr[l] + arr[r] == x) {
					System.out.println(arr[i] + "-" + arr[l] + "-" + arr[r]);
					l++;r--;
				} else if (arr[i] + arr[l] + arr[r] < x) {
					l++;
				} else {
					r--;
				}
			}
		}
		
	}

}
