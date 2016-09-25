package arraysAndStrings;

public class IsRotation {
	
	public static boolean isrotation(String str1, String str2) {
		if (str1.length() != str2.length()) {
			return false;
		}
		String newStr = str1 + str1;
		if (newStr.indexOf(str2) != -1) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		String str1 = "raviteja";
		String str2 = "itejarav";
		System.out.println(isrotation(str1, str2));
	}

}
