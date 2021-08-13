package sting;

import java.util.HashSet;
import java.util.Set;

public class Permutations {

	
		public static Set<String> permutationFinder(String str) {
	        Set<String> perm = new HashSet<String>();
	        //Handling error scenarios
	        if (str == null) {
	            return null;
	        } else if (str.length() == 0) {
	            perm.add("");
	            return perm;
	        }
	        char initial = str.charAt(0); // first character
	        String rem = str.substring(1); // Full string without first character
	        Set<String> words = permutationFinder(rem);
	        for (String strNew : words) {
	            for (int i = 0;i<=strNew.length();i++){
	                perm.add(charInsert(strNew, initial, i));
	            }
	        }
	        return perm;
	    }

	    public static String charInsert(String str, char c, int j) {
	        String begin = str.substring(0, j);
	        String end = str.substring(j);
	        return begin + c + end;
	    }

	  //****************************************************************************//  
	    static void printPermutn(String str, String ans) 
	    { 
	  
	        // If string is empty 
	        if (str.length() == 0) { 
	            System.out.print(ans + " "); 
	            return; 
	        } 
	  
	        for (int i = 0; i < str.length(); i++) { 
	  
	            // ith character of str 
	            char ch = str.charAt(i); 
	  
	            // Rest of the string after excluding  
	            // the ith character 
	            String ros = str.substring(0, i) +  
	                         str.substring(i + 1); 
	  
	            // Recurvise call 
	            printPermutn(ros, ans + ch); 
	        } 
	    } 
	    
	    //********************************************************************
	    
	    static void printDistinctPermutn(String str,  
                String ans) 
{ 

// If string is empty 
if (str.length() == 0) { 

// print ans 
System.out.print(ans + " "); 
return; 
} 

// Make a boolean array of size '26' which 
// stores false by default and make true  
// at the position which alphabet is being 
// used 
boolean alpha[] = new boolean[26]; 

for (int i = 0; i < str.length(); i++) { 

// ith character of str 
char ch = str.charAt(i); 

// Rest of the string after excluding  
// the ith character 
String ros = str.substring(0, i) +  
    str.substring(i + 1); 

// If the character has not been used  
// then recursive call will take place.  
// Otherwise, there will be no recursive 
// call 
if (alpha[ch - 'a'] == false) 
printDistinctPermutn(ros, ans + ch); 
alpha[ch - 'a'] = true; 
} 
} 
	    
	    public static void main(String[] args) {
	        String s = "AAC";
	        String s1 = "ABC";
	        String s2 = "geek";
	        System.out.println("\nPermutations for " + s + " are: \n" + permutationFinder(s));
	        System.out.println("\nPermutations for " + s1 + " are: \n" + permutationFinder(s1));
	        System.out.println("\nPermutations for " + s2 + " are: \n" + permutationFinder(s2));
	        
	        
		/*
		 * String s3 = "aac"; printPermutn(s3, "");
		 * 
		 * System.out.println(""); printDistinctPermutn("geek", "");
		 */
	    }

	}


