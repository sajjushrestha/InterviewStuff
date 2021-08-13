package pack;

import java.util.HashMap;

public class OccurenceOFString {

	public static void main(String[] args) {

		String name="sajjushrestha";
		
		HashMap<Character,Integer> map=new HashMap<Character,Integer>();
		
		char[] charArray=name.toCharArray();
		
		for(char c :charArray)
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
		
		
System.out.println(map);

	}

}
