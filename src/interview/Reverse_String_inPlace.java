package interview;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Reverse_String_inPlace {

	public static void main(String[] args) {

		String s="test12pop90java989pyt767$test";
		String r=s.replaceAll("[^a-z]", " ");
		
		String[] split=r.split("\\s");
		StringBuffer sb=new StringBuffer();
		for(String st:split)
		{
		
			sb.append(rev(st));
		}
		
		
		for(int i=0;i<s.length();i++)
		{
			if(!(Character.isAlphabetic(s.charAt(i))))
			{
				sb.insert(i, s.charAt(i));
			}
		}
		
		
		System.out.println(sb);
		
		System.out.println(0.1+0.4);
		System.out.println(0.0/0.0);
	

	}
	
	public static String rev(String s)
	{
		if(s.length()<=1)
			return s;
		
		return rev(s.substring(1))+s.charAt(0);
	}
	
	

}
