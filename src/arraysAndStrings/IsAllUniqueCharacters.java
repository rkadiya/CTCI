package arraysAndStrings;

public class IsAllUniqueCharacters {
	
	public static boolean uniqueCharactersExtraSpace(String str) {
		if (str.length() > 256) {
			return false;
		}
		
		boolean[] charset = new boolean[256];
		for (int i = 0; i < str.length(); i++) {
			int val = str.charAt(i);
			if (charset[val]) {
				return false;
			}
			charset[val] = true;
		}
		return true;
	}
	
	public static boolean uniqueCharactersNoExtraSpace(String str) {
		for (int i = 0; i < str.length() - 1; i++) {
			for (int j = i + 1; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j)) {
					return false;
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {
		String str = "ravi";
		System.out.println(uniqueCharactersExtraSpace(str));
		System.out.println(uniqueCharactersNoExtraSpace(str));
	}

}
