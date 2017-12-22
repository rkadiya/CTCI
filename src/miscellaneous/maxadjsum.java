package miscellaneous;

public class maxadjsum {

	public static void main(String[] args) {
		int[] arr = {10, 5, 10, 100, 10, 5};
		
		int incl = arr[0];
		int excl = 0;
		int exclnew;
		for (int i = 1; i < 6 ; i++) {
			exclnew = incl > excl ? incl : excl;
			incl = excl + arr[i];
			excl = exclnew;
		}
		System.out.println(incl);
	}

}
