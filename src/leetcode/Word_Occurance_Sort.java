package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Word_Occurance_Sort {

	public static void main(String[] args) {
		
		String s="Overloading";
		System.out.println(rev(s));
		char ch[]=s.toCharArray();
		TreeMap<Character,Integer> map=new TreeMap<Character,Integer>();
		
		
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
		
		//System.out.println(map);
		
		Set<Entry<Character,Integer>> set=map.entrySet();
		
		for(Map.Entry<Character,Integer> e:set)
		{
			System.out.println(e.getKey() +"--"+e.getValue());
		}

		List<Entry<Character,Integer>> list=new ArrayList<>(set);
		
		Comparator<Entry<Character, Integer>> comp=new Comparator<Entry<Character, Integer>>() {
			public int compare(Entry<Character, Integer> o1, Entry<Character, Integer> o2) {
				
				return o1.getValue().compareTo(o2.getValue());
			}
		};
	
	Collections.sort(list,comp);
	
	System.out.println("After Sorting values");
	
	for(Map.Entry<Character,Integer> e:list)
	{
		System.out.println(e.getKey() +"--"+e.getValue());
	}

}

	public static String rev(String s)
	{
		if(s.length()==0 || s==null)
			return s;
		
		return s.charAt(s.length()-1)+rev(s.substring(0,s.length()-1));
		
	}

}
