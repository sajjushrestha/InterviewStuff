package sting;

import java.util.HashMap;

public class Test {

	public static void main(String[] args) {
		
		
		HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
		map.put(10, 1);
		map.put(20, 2);
		map.put(30, 3);
		map.put(40, 4);
		map.put(50, 5);
		map.put(60, 6);
		
		System.out.println(map.containsKey(20));
		map.replace(20, 2, 3);
		map.replace(20, 2);
		
		System.out.println(map);
		/*
		 * String s="ACDCED2CB4C24C599015B47D8175775B";
		 * System.out.println(s.toUpperCase()); System.out.println(s.toLowerCase());
		 */
		/*
		 * 
		 * int a[]= {1,3,6,7,-3}; int n=a.length;
		 * 
		 * 
		 * for(int i=0;i<n;i++) { for(int j=i+1;j<n;j++) { if(a[i]+a[j]==4) {
		 * System.out.println(a[i]+" "+a[j]); } } }
		 * 
		 * Set<Integer> s=new HashSet<Integer>();
		 * 
		 * List<Integer> l=new ArrayList<Integer>(); for(int i=0;i<n;i++) { int
		 * temp=4-a[i];
		 * 
		 * if(l.contains(temp)) { System.out.println(a[i] + " "+temp); }
		 * 
		 * l.add(a[i]);
		 * 
		 * }
		 * 
		 */}

}
