package sting;

public class Reverse_String_removing_duplicates {

	public static void main(String[] args) {
		
		String s="sajindra prasad";
		String temp="";
		
	
		
		String d=removeDuplicates(s);
		
		char ch[]=d.toCharArray();
		
		
		  for(int i=ch.length-1;i>=0;i--) { 
			  temp=temp+ch[i];
		  
		  
		  }
		 
		
		System.out.println(temp);
		
		
		
	}
	
	

	
	
	
	public static String removeDuplicates(String input){
		
	    String result = "";
	    
	    for (int i = 0; i < input.length(); i++) 
	    {
	        if(!result.contains(String.valueOf(input.charAt(i)))) {
	            result += String.valueOf(input.charAt(i));
	        }
	    }
	    return result;
	}

}
