package leetcode;

import java.util.Arrays;

public class Scramble_String {

	public static void main(String[] args) {
		String s1="abcde";
		String s2="caebd";
		
		System.out.println(scramble(s1,s2));

	}
	
	public static boolean scramble(String s1,String s2)
	{
		char[] ch1=s1.toCharArray();
		char[] ch2=s2.toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		
		
		
		return Arrays.equals(ch1, ch2);
	}

}
