package arraysAndStrings;

public class matrixrotation {
	public static void main(String args[]) {
		int n = 4;
		int num = 0;
		Integer[][] given = new Integer[4][4];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				given[i][j] = num++;
			}
		}
		printMatrix(given);
		
		Integer[][] rotated = new Integer[4][4];
		
		for (int i = 0; i < given.length; i++) {
			for (int j = 0; j < given[i].length; j++) {
				rotated[j][n-1-i] = given[i][j]; 
			}
		}
		
		System.out.println();
		printMatrix(rotated);
		
	}
	
	public static void printMatrix(Integer[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
