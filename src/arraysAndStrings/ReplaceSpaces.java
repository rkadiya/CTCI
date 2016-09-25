package arraysAndStrings;

public class ReplaceSpaces {
	
	
	public static String replacespaces(String str) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0 ; i < str.length(); i++) {
			if (str.charAt(i) == ' ') {
				sb.append("%20");
			} else {
				sb.append(str.charAt(i));
			}
		}
		return sb.toString();	
	}
	
	public static void main(String[] args) {
		String myStr = "ravi is a developer";
		String updatedString = replacespaces(myStr);
		System.out.println(updatedString);
	}

}
