package DS;

import java.util.HashMap;

public class StringOccurence {

	public static void main(String[] args) {
		
		
		
		String s="sajju";
		char[] ch=s.toCharArray();
		HashMap<Character,Integer> map=new HashMap<Character,Integer>();
				for(char c:ch)
				{
					if(map.containsKey(c)) {
					map.put(c, map.get(c)+1);
					}
					else
					{
						map.put(c, 1);
					}
				}
				
	for(Character sh:map.keySet())
	{
		//System.out.println(sh +" "+map.get(sh));
		
		if(map.get(sh)>1)
		{
			System.out.println("Duplicate elemenst are "+sh);
		}
		else
		{
			System.out.println("Unique elemenst are "+sh);
		}
	}

	
	
	}

}
