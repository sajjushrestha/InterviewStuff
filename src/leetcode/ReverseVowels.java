package leetcode;

import java.util.Stack;

public class ReverseVowels {

	public static void main(String[] args) {
	
		System.out.println(reverse("leetcode"));
	}
	
	
	public static String reverse(String s)
	{
		
		Stack<Character> st=new Stack<>();
		
		for(char ch:s.toCharArray())
		{
			if(isVowel(ch))
			{
				st.add(ch);
			}
			
		}
		
		System.out.println(st);
		StringBuffer sb=new StringBuffer();
		
		for(char ch:s.toCharArray())
		{
			if(isVowel(ch))
			{
				sb.append(st.pop());
			}
			else
			{
				sb.append(ch);
			}
			
		}
		
		return sb.toString();
	}
	
	
	public static boolean isVowel(Character ch)
	{
		if(ch=='a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') 
			return true;
		if(ch=='A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') 
			return true;
		
		return false;
	}

}
