package pack;

public class ReverseAString {

	public static void main(String[] args) {
		 String blogName = "howtodoinjava.com";
         
	        String reverseString = recursiveSwap(blogName);
	         
	        System.out.println(reverseString);
	        
	        System.out.println( "a".compareTo("b") );  //-1 - apple comes before banana
	        System.out.println( "apple".compareTo("cherry") );  //-2 - apple comes before cherry
	        System.out.println( "cherry".compareTo("banana") ); //1  - cherry comes after banana
	        System.out.println( "cherry".compareTo("cherry") ); //

	}
	
	static String recursiveSwap(String str)
    {
         if ((null == str) || (str.length() <= 1))
         {
                return str;
         }
         return recursiveSwap(str.substring(1)) + str.charAt(0);
    }

}
