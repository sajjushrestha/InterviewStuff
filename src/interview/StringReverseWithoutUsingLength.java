package interview;

public class StringReverseWithoutUsingLength {

	public static void main(String[] args) {
		
		
		 String str = "Welcome to Beginnersbook";
	        String reversed = reverseString(str);
	        System.out.println("The reversed string is: " + reversed);
	        System.out.println(reverseString("sajju is"));
	        
	        System.out.println(reverseString2("sajju is"));
	}
	

	 public static String reverseString(String str)
	    {
	        if (str.isEmpty())
	            return str;
	        //Calling Function Recursively
	        return reverseString(str.substring(1)) + str.charAt(0);
	    }
	 
	 public static String reverseString2(String str)
	    {
	        if (str.isEmpty())
	            return str;
	        //Calling Function Recursively
	        return str.charAt(str.length()-1)+reverseString(str.substring(0,str.length()-1)) ;
	    }

}
