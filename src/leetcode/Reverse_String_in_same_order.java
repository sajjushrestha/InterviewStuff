package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Reverse_String_in_same_order {

	public static void main(String[] args) {

		String s="Hello My Name is Shiva";
		String[] split=s.split("\\s+");
		
		String rev="";
		
		for(String st:split)
		{
			rev=rev+reverse(st)+" ";
		}
		
		System.out.println(rev);
		
		List<String> list=new ArrayList<>();
		list.add("sajju");list.add("guna");list.add("saji");list.add("cheri");
		
		System.out.println(list.subList(1, 4));
		Collections.swap(list, 1,3);
		
		System.out.println(list);
		
		LinkedList<String> l=new LinkedList<>();
		l.addFirst("First");l.addLast("Last");
		l.add("third");l.add("Last");
		
		l.remove("Last");
		
		System.out.println(l);

	}
	
	public static String reverse(String s)
	{
		if(s.length()<=1 || s==null)
			return s;
		
		return s.charAt(s.length()-1)+reverse(s.substring(0,s.length()-1));
	}

}
