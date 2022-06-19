package sting;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class Test {

	public static void main(String[] args) {
		
		int[] a= {2,1,4,7};
		Arrays.sort(a);
		int j=0;
		int n=a.length;

		for(int i=0;i<a[n-1];i++)
		{
		if(i==a[j])
		{
			j++;
		}
		else
		{
			System.out.println(i);
		}
		}
		
		Integer[] b=new Integer[] {1,3,1,5,6,4,3,2,1};
		
		LinkedHashSet<Integer> ls=new LinkedHashSet<>(Arrays.asList(b));
		
		Integer[] c=ls.toArray(new Integer[] {});
		
		System.out.println(Arrays.asList(c));
		
		System.out.print(perm("ABC",""));
		
		/*
		 * HashMap<Integer,Integer> map=new HashMap<Integer,Integer>(); map.put(10, 1);
		 * map.put(20, 2); map.put(30, 3); map.put(40, 4); map.put(50, 5); map.put(60,
		 * 6);
		 * 
		 * System.out.println(map.containsKey(20)); map.replace(20, 2, 3);
		 * map.replace(20, 2);
		 * 
		 * System.out.println(map);
		 */
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
	
	
	public static String perm(String s,String ans)
	{
		if(s.length()==0)
			System.out.print(ans+" ");
		
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(0);
			String left=s.substring(0,i);
			String right=s.substring(i+1);
			String total=left+right;
			perm(total,ans+ch);
			
		}
			
		
		return ans;
		
	}
	
	
}

