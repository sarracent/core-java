package coreJava;

public class Palindrome {
	//hola mundo
	public static boolean isPalindrome(String str) {
		if (str == null)
			return false;
		StringBuilder strBuilder = new StringBuilder(str);
		strBuilder.reverse();
		return strBuilder.toString().equals(str);
	}
	
	public static boolean isPalindromeString(String str) {
		if (str == null)
			return false;
		int lenght = str.length();
		System.out.println(lenght / 2);
		for (int i = 0; i < lenght / 2; i++) {
			
			if (str.charAt(i) != str.charAt(lenght - i - 1) ) {
				return false;
				
			}	
		}
		return true;
	}
	
}
