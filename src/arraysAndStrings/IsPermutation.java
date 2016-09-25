package arraysAndStrings;

public class IsPermutation {
	
	public static boolean isStringsPermutation(String str1, String str2) {
		if (str1.length() != str2.length()) {
			return false;
		}
		
		int[] charset = new int[256];
		for (int i=0; i < str1.length(); i++) {
			int val = str1.charAt(i);
			charset[val]++;
		}
		for (int i=0; i < str2.length(); i++) {
			int val = str2.charAt(i);
			if (--charset[val] < 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		String str1 = "ravi";
		String str2 = "vire";
		System.out.println(isStringsPermutation(str1, str2));
	}

}
