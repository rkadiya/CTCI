package miscellaneous;

public class Bloomberg {

	/**
	 * print 
	 * 			X if N = 1
	 * 			XX if N ==2
	 * 			XX
	 * 
	 *           X X if N ==3
	 *            X
	 *           X X
	 * 
	 * 
	 * 				X  X N==4
	 * 				 XX
	 * 				 XX
	 * 				X  X
	 * 
	 * 	`			X   X
	 * 				 X X 
	 * 				  X
	 * 				 X X
	 * 				X   X n == 5
	 */
	static int row = 0;
	static int col = 0;
	public static void main(String[] args) {
		int N = 6;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (i == j || i + j == N - 1) {
					System.out.print('X');
				} else {
					System.out.print(' ');
				}
			}
			System.out.println();
		}
	}

}
