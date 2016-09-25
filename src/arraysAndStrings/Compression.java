package arraysAndStrings;

public class Compression {

	public static String compress(String str) {
		StringBuilder sb = new StringBuilder();
		char previous = str.charAt(0);
		int count = 1;
		for (int i = 1; i < str.length(); i++) {
			if(str.charAt(i) == previous) {
				count++;
			} else {
				sb.append(previous);
				sb.append(count);
				
				previous = str.charAt(i);
				count = 1;
			}
		}
		sb.append(previous);
		sb.append(count);
		return sb.toString();
	}
	public static void main(String[] args) {
		String str = "aaabbbbccdddddde";
		System.out.println(compress(str));
	}

}
