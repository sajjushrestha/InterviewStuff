package sting;

import java.util.Arrays;

public class Anagrams {
	
	
	
	
	static boolean isAnagram(String a, String b) {
        System.out.println(a.replaceAll("[^a-z]","").length()!=b.replaceAll("[^a-z]","").length() ? "Not Anagrams":"" );

    char[] c=a.toLowerCase().replaceAll("[^a-z]", "").toCharArray();
    char[] d=b.toLowerCase().replaceAll("[^a-z]", "").toCharArray();
    
   
    Arrays.sort(c);
    Arrays.sort(d);
   
    if(Arrays.equals(c,d)) {
    	return true;
    }
    
    
    
    
	return false;

    }

	public static void main(String[] args) {
		
		System.out.println(isAnagram("Mother-in-law","Hilter Woman"));

	}

}
