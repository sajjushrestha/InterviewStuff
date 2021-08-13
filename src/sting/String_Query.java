package sting;


import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class String_Query {

	
	// Complete the matchingStrings function below.
	  public static void main(String[] args) throws IOException { 
    	
		/*
		 * String[] strings= {"ab","ab","abc"}; String[] queries= {"ab","abc","bc"};
		 */
		  
		  Scanner scanner = new Scanner(System.in);
		  
		  int stringsCount = scanner.nextInt();
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        String[] strings = new String[stringsCount];

	        for (int i = 0; i < stringsCount; i++) {
	            String stringsItem = scanner.nextLine();
	            strings[i] = stringsItem;
	        }

	        int queriesCount = scanner.nextInt();
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        String[] queries = new String[queriesCount];

	        for (int i = 0; i < queriesCount; i++) {
	            String queriesItem = scanner.nextLine();
	            queries[i] = queriesItem;
	        }
		  
    	HashMap<String,Integer> str=new HashMap<String,Integer>();
    	
    	
    	
    	for(String s:strings)
    	{
    		if(str.containsKey(s))
    		{
    			
    			str.put(s, str.get(s)+1);
    		}
    		else
    		{
    			str.put(s, 1);
    		}
    	}
	
    for(String q:queries) {
    	
    	if(str.containsKey(q))
{
		System.out.println(str.get(q));
	
}
    	else
    	{
    		System.out.println(0);
    	}
    }

    }

}