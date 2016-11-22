package miscellaneous;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConstantTimeDataStructure {
	List<Integer> arr = new ArrayList<Integer>();
	Map<Integer, Integer> hash = new HashMap<Integer, Integer>();
	
	void add(int x) {
		if (hash.containsKey(x)) {
			return;
		}
		
		int size = arr.size();
		arr.add(x);
		hash.put(x, size);
	}
	
	int search(int x) {
		return hash.get(x);
	}
	
	void remove(int x) {
		if (!hash.containsKey(x)) {
			return;
		}
		
		int index = hash.get(x);
		hash.remove(x);
		int last = arr.get(arr.size() - 1);
		
		Collections.swap(arr, index, arr.size() - 1);
		arr.remove(arr.size() - 1);
		
		hash.put(last, index);
		
	}
	
	void print() {
		for (int element : arr) {
			System.out.print(element + " " );
		}
		System.out.println();
	}

	public static void main(String[] args) {
		ConstantTimeDataStructure myds = new ConstantTimeDataStructure();
		myds.add(10);
		myds.add(20);
		myds.add(30);
		myds.add(40);
		
		myds.print();
		
		myds.remove(20);
		myds.print();
		
		System.out.println(myds.search(40));
		
		myds.remove(40);
		myds.print();
	}

}
