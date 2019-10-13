package interview;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class Print_Duplicates_in_a_string {

	public static void main(String[] args) {

String s="sajjushrestha";
Set<Character> set=new LinkedHashSet<Character>();

for(int i=0;i<s.length()-1;i++)
{
	char c=s.charAt(i);


set.add(c);
if(s.indexOf(c)!=s.lastIndexOf(c))
{
	System.out.print(c+" ");
}

}
System.out.println(" ");
System.out.println(set);

usingMap();
//******************************************************************//

	}
	
	
	static void usingMap()
	{
		 String blogName = "howtodoinjava dot com";
	        char[] chars = blogName.toCharArray();
	         
	        Map<Character, Integer> map = new HashMap<>();
	        for(char c : chars)
	        {
	            if(map.containsKey(c)) {
	                int counter = map.get(c);
	                map.put(c, ++counter);
	            } else {
	                map.put(c, 1);
	            }
	        }
	         
	        System.out.println("Duplicate characters:");
	         
	        //Print duplicate characters
	        for(char c : map.keySet()) {
	            if(map.get(c) > 1) {
	                System.out.println(c);
	            }
	        }
	         
	        System.out.println("Duplicate characters excluding white space :");
	         
	        //Print duplicate characters excluding white space
	        for(char c : map.keySet()) {
	            if(map.get(c) > 1 && !Character.isWhitespace(c)) {
	                System.out.println(c);
	            }
	        }
	         
	        System.out.println("Distinct characters:");
	         
	        //Print distinct characters
	        for(char c : map.keySet()) {
	            if(map.get(c) == 1) {
	                System.out.println(c);
	            }
	        }
	}

}
