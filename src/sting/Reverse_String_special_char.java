package sting;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Reverse_String_special_char {

	public static void main(String[] args) {


		System.out.println(reverseOnlyLetters("S@jj&shre#th@"));
		System.out.println(reverseStringWithoutSpecialChar("S@jj3,u5e&"));
		
	}
	
	 public static String reverseOnlyLetters(String S) {
	        Stack<Character> letters = new Stack<>();
	        for (char c: S.toCharArray())
	            if (Character.isAlphabetic(c) || Character.isDigit(c))
	                letters.push(c);

	        StringBuilder ans = new StringBuilder();
	        for (char c: S.toCharArray()) {
	            if (Character.isAlphabetic(c) )
	                ans.append(letters.pop());
	            else
	                ans.append(c);
	        }

	        return ans.toString();
	    }
	 
	 public static String reverseOnlyLettersAndNumbers(String S) {
	        Stack<Character> letters = new Stack<>();
	        for (char c: S.toCharArray())
	            if (!(Character.isLetter(c) || Character.isAlphabetic(c)))
	                letters.push(c);

	        StringBuilder ans = new StringBuilder();
	        for (char c: S.toCharArray()) {
	            if (!(Character.isLetter(c) || Character.isAlphabetic(c)))
	                ans.append(letters.pop());
	            else
	                ans.append(c);
	        }

	        return ans.toString();
	    }
	 
	 public static String reverseStringWithoutSpecialChar(final String str) {
			int len = str.length() - 1;
			char[] chars = str.toCharArray();

			int i = 0;

			while (i < len) {
				char firstCh = str.charAt(i);
				char lastCh = str.charAt(len);

				if (!isAlphabet(firstCh) && !isDigit(firstCh)) {
					i++;
				} else if (!isAlphabet(lastCh) && !isDigit(lastCh)) {
					len--;
				} else {
					char temp = chars[i];
					chars[i] = chars[len];
					chars[len] = temp;
					i++;
					len--;
				}
			}

			return String.copyValueOf(chars);
		}

		private static boolean isAlphabet(char ch) {
			if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
				return true;
			}

			return false;
		}

		private static boolean isDigit(char ch) {
			if (ch >= '0' && ch <= '9') {
				return true;
			}

			return false;
		}

}
