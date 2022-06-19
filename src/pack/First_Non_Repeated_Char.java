package pack;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;



public class First_Non_Repeated_Char {
	static String s="analogy";
	
	public static void main(String[] args) {
		
		nonRepeat_map();
		nonRepeat();
	        System.out.println();

	}
	
	//@Test
	public static void nonRepeat_map()
	{
		//String s="easiest";
		char[] ch=s.toCharArray();
		
		Map<Character,Integer> map=new LinkedHashMap<Character,Integer>();
		
		for(char c:ch)
		{
			if(map.containsKey(c))
			{
				map.put(c, map.get(c)+1);
			}
			else
			{
				map.put(c, 1);
			}
		}
		
		for(Entry<Character, Integer> entry:map.entrySet())
		{
			//System.out.println(entry.getKey() +" - "+entry.getValue());
			if(entry.getValue()==1)
			{
				System.out.println("First non repeated charcater using map = "+entry.getKey());
				break;
			}
		}
		
	}
	

	
	public static void nonRepeat()
	{
		
		char[] ch=s.toCharArray();
		
		for(char c:ch)
		if(s.lastIndexOf(c) == s.indexOf(c))
		{
			System.out.println("First non repeated charcater with string func ="+ c);
			break;
		}
		
	}

}
