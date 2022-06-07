package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

/*
 *https://leetcode.com/problems/longest-palindromic-substring/
*/
public class LongestPalindromeSubString {

	public static void main(String[] args) {
	
		String s="babad";
		 //Scanner sc=new Scanner(System.in); String s=sc.next();
		//System.out.println(longestPalindrome(s));
		System.out.println(findLongestPalindromicSubstring(s));
		
		System.out.println(longestPalSubstr(s));
		

		

	}
	
	static int longestPalSubstr(String str)
    {
        int n = str.length(); // calculcharAting size of string
        if (n < 2)
            return n; // if string is empty then size will be 0.
                  // if n==1 then, answer will be 1(single
                  // character will always palindrome)
 
        int maxLength = 1,start=0;
        int low, high;
        for (int i = 0; i < n; i++) {
            low = i - 1;
            high = i + 1;
            while ( high < n && str.charAt(high) == str.charAt(i)) //increment 'high'                                  
                high++;
       
            while ( low >= 0 && str.charAt(low) == str.charAt(i)) // decrement 'low'                   
                low--;
       
            while (low >= 0 && high < n && str.charAt(low) == str.charAt(high) ){
                  low--;
                  high++;
        }
 
        int length = high - low - 1;
        if (maxLength < length){
            maxLength = length;
            start=low+1;
        }
    }   
    System.out.print("Longest palindrome substring is: ");
    System.out.println(str.substring(start, start + maxLength ));
    return maxLength;
       
 }
 
	
	 private static String findLongestPalindromicSubstring(String input) {
		    if(input.isEmpty()) {
		      return "";
		    }
		    int n = input.length();
		    int longestSoFar = 0, startIndex = 0, endIndex = 0;
		    boolean[][] palindrom = new boolean[n][n];
		  
		    for(int j = 0; j < n; j++) {
		      palindrom[j][j] = true;
		      for(int i = 0; i < j; i++) {
		        if(input.charAt(i) == input.charAt(j) && (j-i <= 2 || palindrom[i+1][j-1])) {
		          palindrom[i][j] = true;
		          if(j-i+1 > longestSoFar) {
		            longestSoFar = j-i+1;
		            startIndex = i;
		            endIndex = j;
		          }  
		        }
		      }
		    }
		    return input.substring(startIndex, endIndex+1);
		  }
	 
	 public static String longestPalindrome(String s) {
		
		 if(s==null || s.length() == 0 || s.length() == 1)
			 return s;
		 int i=0;
		 Map<String,Integer> map=new TreeMap<String,Integer>();
		 List<String> list=new ArrayList<String>();
		 
		 while(i<s.length())
		 {
			for( int j=i+1;j<=s.length();j++)
			{
				// System.out.println(s.substring(i,j));
				// System.out.println(isPalindrome(s.substring(i,j)));
			if(isPalindrome(s.substring(i,j)))	
			{
			  map.put((s.substring(i,j)),s.substring(i,j).length());
			}
			
			} i++;
		 }
		 
		//System.out.println(map);
		 
		 for(Map.Entry<String, Integer> entry:sortKey(map)){
	            //System.out.println(entry.getKey()+"  ====   "+entry.getValue()); 
			 list.add(entry.getKey());
	        }
		 
		 String n= list.size() == 0 ? "" : list.get(list.size()-1);
		 
		 return n;
	        
	    }
	 
	 public static boolean isPalindrome(String s)
	 {
		char[] ch=s.toCharArray();
		String rev="";
		
		for(int i=ch.length-1;i>=0;i--)
		{
			rev=rev+ch[i];
		}
		
		//System.out.println("Rev : "+rev);
		if(rev.equals(s))
			return true;
		else
		   return false;
	 }
	 
	 public static List<Entry<String,Integer>> sortKey(Map<String, Integer> map)
	 {
		Set<Entry<String,Integer>> entrySet=map.entrySet();
		List<Entry<String,Integer>> list=new ArrayList<>(entrySet);
		Comparator<Entry<String,Integer>> comp=new Comparator<Entry<String,Integer>>() {

		@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				// TODO Auto-generated method stub
			 return (o1.getValue()).compareTo(o2.getValue() );
			}
			
		};
		
		Collections.sort(list,comp);
		 
		return list;
	 }
}
