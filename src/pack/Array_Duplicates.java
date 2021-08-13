package pack;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Array_Duplicates {

	public static void main(String[] args) {


		int a[]= {1,2,3,4,7,6,7,4};
		java.util.Arrays.sort(a);
		int n=a.length;
		
		for(int i=0;i<n-1;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]==a[j])
				{
					System.out.println(a[i]);
				}
			}
		}
		
		System.out.println("##############################");
		
		/*
		 * String[] ar= {"java","C","python","C"}; Set<String> s=new HashSet<String>();
		 * for(String name:ar) { if(s.add(name)==false) { System.out.println(name); } }
		 */
		Set<Integer> s=new HashSet<Integer>();
		for(Integer i:a)
		{
			if(s.add(i)==false)
				{
				System.out.println(i);
			}
		}
		System.out.println("##############################");
		
		Map<Integer,Integer> map=new HashMap<Integer,Integer>();
		for(Integer i:a) {
		if(map.get(i)==null)
		{
			map.put(i, 1);
		}
		else
		{
			map.put(i, map.get(i)+1);
		}
		}
		
	
		
		Set<Entry<Integer, Integer>> set=map.entrySet();
	
		for(Map.Entry<Integer,Integer> entry:set)
		{
			
			if(entry.getValue()>1)
			{
				System.out.println(entry.getKey());
			}
		}
	}

}
