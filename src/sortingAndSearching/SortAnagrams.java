package sortingAndSearching;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class SortAnagrams {
	
	private static void sortMyAnagramsArray(String[] myAnagrams) {
		Arrays.sort(myAnagrams, new AnagramComparator());
	}
	
	private static void sortMyAnagramsArrayUsingHashMap(String[] myAnagrams) {
		Map<String, LinkedList<String>> myHashMap = new HashMap<String, LinkedList<String>>();
		for (String s : myAnagrams) {
			if (!myHashMap.containsKey(sortChars(s))) {
				myHashMap.put(sortChars(s), new LinkedList<String>());
			}
			LinkedList<String> anagrams = myHashMap.get(sortChars(s));
			anagrams.push(s);
		}
		
		int index = 0;
		for (String key : myHashMap.keySet()) {
			for (String ana : myHashMap.get(key)) {
				myAnagrams[index] = ana;
				index++;
			}
		}
	}
	
	private static void printStringArray(String[] myArray) {
		for (String s : myArray) {
			System.out.print(s + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		String[] myAnagrams1 = {"ravi","teja","kadiyam","ivar","ajet","yamkadi", "abc", "xyzx"};
		printStringArray(myAnagrams1);
		sortMyAnagramsArray(myAnagrams1);
		printStringArray(myAnagrams1);
		
		String[] myAnagrams2 = {"ravi","teja","kadiyam","ivar","ajet","yamkadi", "abc", "xyzx"};
		sortMyAnagramsArrayUsingHashMap(myAnagrams2);
		printStringArray(myAnagrams2);
		
	}
	
	public static String sortChars(String s) {
		char[] content = s.toCharArray();
		Arrays.sort(content);
		return new String(content);
	}

}

class AnagramComparator implements Comparator<String>{
	public String sortChars(String s) {
		char[] content = s.toCharArray();
		Arrays.sort(content);
		return new String(content);
	}
	@Override
	public int compare(String o1, String o2) {
		return sortChars(o1).compareTo(sortChars(o2));
	}
	
}
