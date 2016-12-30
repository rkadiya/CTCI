package miscellaneous;

public class StairCase {

	public static void main(String[] args) {
		stairCase(1000);
	}
	
	static void stairCase(int n) {
        if (n < 1 || n > 1000000) {
            return;
        }
        
        printStairs(n, 1);

    }

    static void printStairs(int n , int row) {
        if (n+1 == row) {
            return;
        }
        for (int i = 0; i < n - row; i++) {
            System.out.print(" ");
        }
        for (int i = 0; i < row; i++) {
            System.out.print("#");
        }
        System.out.println();
        printStairs(n, row+1);
        
    }

}
