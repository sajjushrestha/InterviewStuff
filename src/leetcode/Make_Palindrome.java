package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Make_Palindrome {

	public static void main(String[] args) {
		 if (canFormPalindrome("geeksforgeeks"))
	            System.out.println("Yes");
	        else
	            System.out.println("No");
	  
	        if (canFormPalindrome("malatreyalam"))
	            System.out.println("Yes");
	        else
	            System.out.println("No");
	    }

	

	
	static boolean canFormPalindrome(String str)
    {
  
        // Create a list
        List<Character> list = new ArrayList<Character>();
  
        // For each character in input strings,
        // remove character if list contains
        // else add character to list
        for (int i = 0; i < str.length(); i++) 
        {
            if (list.contains(str.charAt(i)))
                list.remove((Character)str.charAt(i));
            else
                list.add(str.charAt(i));
        }
  
        // if character length is even 
        // list is expected to be empty or 
        // if character length is odd list size 
        // is expected to be 1
        
        
        // if string length is even
        if (str.length() % 2 == 0
                && list.isEmpty() 
            || (str.length() % 2 == 1
                && list.size()
                       == 1)) 
            return true;
        
        // if string length is odd
        else
            return false;
}
}
