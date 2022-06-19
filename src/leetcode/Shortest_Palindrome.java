package leetcode;

public class Shortest_Palindrome {

	public static void main(String[] args) {
		String s="abcd";
		
		System.out.println(shortest(s));

	}

	
	public static String shortest(String s)
	{
		String rev="";
		while(!rev.equals(palindrome(s)))
		{
			System.out.println(rev);
			rev=palindrome(s)+s;
		}
		
		
		return rev;
	}
	
	public static String shortest2(String s)
	{
		String rev="";
		
		
		
		return rev;
	}
	
	
	public static String palindrome(String s)
	{
		if(s.length()<=1 || s==null)
			return s;
		
				
		return s.charAt(s.length()-1)+ palindrome(s.substring(0,s.length()-1));
	}
}
