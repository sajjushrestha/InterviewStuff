package interview;

import java.util.HashSet;

public class Character_Frequency_print {

	//print character frequency after consecutive occurances
	public static void main(String[] args) {

		String s="cccOOddEEEccABAA";
		
		char[] ch=s.toCharArray();
		StringBuffer sb=new StringBuffer(s);
		char prev = ch[0];
		int pos=0;
		
		
		HashSet<Character> set=new HashSet<>();
		int count = 0;
		
		for(char c:ch)
		{	
			if(prev!=c)
			{
			 pos=pos+count;
			 sb.insert(pos, count);
			 pos++;
			 set=new HashSet<>();
			}
			
			if(set.add(c))
			{				
				set.add(c);				
				count=1;
				prev=c;
				
			}
			else
			{
				count++;
			}
		}
		
		
		System.out.println(sb.insert(sb.length(), count));

	}

}
