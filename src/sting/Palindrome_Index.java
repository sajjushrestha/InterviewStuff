package sting;

import java.util.Scanner;

public class Palindrome_Index {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int T = in.nextInt();
		for (int tc = 0; tc < T; tc++) {
			String str = in.next();
			System.out.println(findRemovalIndex(str));
		}

		in.close();
	}

	static int findRemovalIndex(String str) {
		for (int i = 0, j = str.length() - 1; i < j; i++, j--) {
			if (str.charAt(i) != str.charAt(j)) {
				return isPalindrome(str, i + 1, j) ? i : j;
			}
		}
		return -1;
	}

	static boolean isPalindrome(String str, int beginIndex, int endIndex) {
		for (int i = beginIndex, j = endIndex; i < j; i++, j--) {
			if (str.charAt(i) != str.charAt(j)) {
				return false;
			}
		}
		return true;
	}
	
	
	
	/*
	 * 
	 * private static final Scanner scanner = new Scanner(System.in);
	 * 
	 * 
	 * public static void main(String[] args) { int q = scanner.nextInt();
	 * scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
	 * 
	 * for (int qItr = 0; qItr < q; qItr++) { String s = scanner.nextLine();
	 * 
	 * int result = palindromeIndex(s);
	 * 
	 * System.out.println(result); }
	 * 
	 * 
	 * 
	 * }
	 * 
	 * static int palindromeIndex(String s) { int y=0; if(!checkPalindrome(s)) {
	 * 
	 * 
	 * char[] ch=s.toCharArray(); for(int i=0;i<ch.length;i++) { StringBuilder
	 * sb=new StringBuilder(s);
	 * 
	 * sb.setCharAt(i, '\0');
	 * 
	 * String t= sb.toString().trim(); String b=t.substring(0,
	 * i+1).trim()+t.substring(i+1).trim();
	 * 
	 * if(checkPalindrome(b)) { y=i; break; } }
	 * 
	 * 
	 * 
	 * }
	 * 
	 * else { return -1; } return y; }
	 * 
	 * public static String reverse(String s) { String rev=""; for(int
	 * i=s.length()-1;i>=0;i--) { rev=rev+s.charAt(i);
	 * 
	 * } return rev; }
	 * 
	 * public static boolean checkPalindrome(String s) {
	 * 
	 * String r=reverse(s);
	 * 
	 * if(r.equals(s)) { return true; }
	 * 
	 * return false; }
	 */}
