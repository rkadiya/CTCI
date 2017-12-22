package miscellaneous;
import java.util.LinkedList;
import java.util.List;

public class listsum {

	public static void main(String[] args) {
		List<Integer> a = new LinkedList<>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(5);
		System.out.println("a is " + a.toString());
		List<Integer> b = new LinkedList<>();
		b.add(3);
		b.add(9);
		b.add(8);
		b.add(8);
		System.out.println("b is " + b.toString());
		List<Integer> c = sum(a, b);
		rev(c);
		System.out.println("c is " + c.toString());
	}
	
	public static void rev(List<Integer> c) {
		for (int i = 0 ; i < c.size()/2; i++) {
			int temp = c.get(i);
			c.set(i, c.get(c.size()-1-i));
			c.set(c.size()-1-i, temp);
		}
	}
	
	
	public static List<Integer> sum(List<Integer> a, List<Integer> b) {
		int carry = 0;
		List<Integer> newList = new LinkedList<>();
		int i,j;
		for (i = a.size()-1, j = b.size()-1; i >=0 && j >=0; i--, j--) {
				int sum = carry + a.get(i) + b.get(j);
				newList.add(sum%10);
				carry = sum/10;
		}
		
		while(i >= 0) {
			int sum = carry + a.get(i);
			newList.add(sum%10);
			carry = sum/10;
			i--;
		}
		
		return newList;
	}
}
