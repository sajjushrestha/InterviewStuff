package pack;

import java.util.HashSet;
import java.util.Set;

public class PermutationANDCombinations {

	    public static void main(String[] args)
	    {
	        System.out.println(getPermutations("ABCDE"));
	        System.out.println(permuations("ABCDE",""));
	 
	        //Prints
	        //[ACB, BCA, ABC, CBA, BAC, CAB]
	    }
	    
		public static String permuations(String s,String ans)
		{
			
			
			
			if(s.length()==0)
				System.out.print(ans+" ");

			for(int i=0;i<s.length();i++)
			{
				char ch=s.charAt(i);
				String left=s.substring(0,i);
				String right=s.substring(i+1);
				String rest=left+right;
				permuations(rest,ans+ch);
			
			}
			
			
			return ans;
			
		}
	 
	    public static Set<String> getPermutations(String string)
	    {
	        //All permutations
	        Set<String> permutationsSet = new HashSet<String>();
	         
	        // invalid strings
	        if (string == null || string.length() == 0)
	        {
	            permutationsSet.add("");
	        }
	        else
	        {
	            //First character in String
	            char initial = string.charAt(0);
	             
	            //Full string without first character
	            String rem = string.substring(1);
	             
	            //Recursive call
	            Set<String> wordSet = getPermutations(rem);
	            
	           // System.out.println(wordSet);
	            
	            
	            for (String word : wordSet) {
	                for (int i = 0; i <= word.length(); i++) {
	                    permutationsSet.add(charInsertAt(word, initial, i));
	                }
	            }
	        }
	        return permutationsSet;
	    }
	 
	    public static String charInsertAt(String str, char c, int position)
	    {
	        String begin = str.substring(0, position);
	        String end = str.substring(position);
	        return begin + c + end;
	    }
	}

