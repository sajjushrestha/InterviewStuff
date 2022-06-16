package leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DuplicatesInArray {

	public static void main(String[] args) {
		
		int a[]= {1,2,2,3,1,4,5};
		Arrays.sort(a);
		int n[]=new int[a.length];
		int j=0;
		
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]!=a[i+1])
			{
				a[j++]=a[i];
			}
			
			a[j++]=a[a.length-1];
		}
		
		  for (int i=0; i<a.length; i++) 
	           System.out.print(a[i]+" "); 
		
		/*
		 * Set<Integer> set=new HashSet<Integer>();
		 * 
		 * for(int i:a) { if(set.add(i)) {
		 * 
		 * n[j]=i; // System.out.println(n[j]); } j++; //n[j++]=n[a.length-1]; }
		 * 
		 * System.out.println(n.length);
		 * 
		 * for(int i:n) { System.out.println(i); }
		 */
		
		
	}

}
