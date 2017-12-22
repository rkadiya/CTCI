package miscellaneous;
import java.util.LinkedList;
import java.util.List;

public class chunkrotation {
	public static void main(String[] args) {
		int c = 2;
		List<Integer> given = new LinkedList<>();
		given.add(1);given.add(2);given.add(3);given.add(4);given.add(5);given.add(6);given.add(7);given.add(8);
		for (Integer i : given) {
			System.out.print(i + "\t");
		}
		
		
		for (int i = 0 ; i <= given.size() - c; i=i+c) {
			chunkrotate(given, i , i+1);
		}
		
		System.out.println();
		for (Integer i : given) {
			System.out.print(i + "\t");
		}
	}
	
	public static void chunkrotate(List<Integer> given, int i, int j) {
		while (i < j) {
			int temp = given.get(i);
			given.set(i, given.get(j));
			given.set(j, temp);
			i++;
			j--;
		}
	}
}
