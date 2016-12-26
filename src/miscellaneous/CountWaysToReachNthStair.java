package miscellaneous;

public class CountWaysToReachNthStair {

	public static void main(String[] args) {
		int n = 10;
		System.out.println(countStairs(n));
	}
	
	private static int countStairs(int n) {
		return fib(n+1);
	}
	
	private static int fib(int n) {
		if (n <= 1) {
			return n;
		}
		return fib(n-1) + fib(n-2);
	}

}
