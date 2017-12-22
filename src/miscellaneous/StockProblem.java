package miscellaneous;

public class StockProblem {

	public static void main(String[] args) {
		int[] stocks = {100,80, 60, 70, 60, 75, 85};
		int[] spans = new int[stocks.length];
		
		for (int i = 6; i>=0; i--) {
			int count = 1;
			for (int j =i-1; j>=0; j--) {
				if (stocks[i] >= stocks[j]) {
					count++;
				} else {
					break;
				}
			}
			spans[i] = count;
		}
		for (int span : spans) {
			System.out.println(span);
		}
	}

}
