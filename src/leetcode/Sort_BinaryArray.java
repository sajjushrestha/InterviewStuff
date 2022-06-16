package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sort_BinaryArray {

	public static void main(String[] args) {
		int[] a={0,1,0,1,1,1,0,0,0,1};
		//int[] a={1,2,3,0,0,12};
		String[] s={"A","Z","B"};
		
		List<Integer> list=new ArrayList<>();
		
		for(int i:a)
		{
			list.add(i);
		}
		
		Collections.sort(list,new MyComparator());
		
		
		for(int i=0;i<list.size();i++)
		  System.out.print(list.get(i)+" ");
		
		Arrays.sort(s, new MyStringComparator());
		
		for(String s1: s)
		 {
		// System.out.println(s1);
		 }

	}
	
	
	

}


class MyComparator implements Comparator<Object>
{

	@Override
	public int compare(Object o1, Object o2) {
		
		Integer i=(Integer)o1;
		Integer j=(Integer)o2;
		return j-i;
	}
	
}

class MyStringComparator implements Comparator<Object>
{

	@Override
	public int compare(Object o1, Object o2) {
		
		String i=o1.toString();
		String j=o2.toString();
		return i.compareTo(j);
	}
	
}