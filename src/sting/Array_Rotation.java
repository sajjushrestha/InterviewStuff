package sting;

import java.util.Scanner;

public class Array_Rotation {

	
	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6};
		vamsi(a,1);
		/*
		 * String[] nd = scanner.nextLine().split(" ");
		 * 
		 * int n = Integer.parseInt(nd[0]);
		 * 
		 * 
		 * int d = Integer.parseInt(nd[1]);
		 * 
		 * 
		 * int[] a = new int[n];
		 * 
		 * String[] aItems = scanner.nextLine().split(" "); //
		 * scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		 * 
		 * for (int i = 0; i < n; i++) { int aItem = Integer.parseInt(aItems[i]); a[i] =
		 * aItem;
		 * 
		 * System.out.println(a[i]+" "); }
		 * 
		 * for(int i=0;i<d;i++) {
		 * 
		 * System.out.print(a[i+n-d]+" "); }
		 * 
		 * for(int j=0;j<n-d;j++) { System.out.print(a[j]+" "); }
		 * 
		 * scanner.close();
		 */}
    
    
    public static void vamsi(int a[],int k)
    {
    	for(int i=a.length-k;i<=a.length-1;i++)
    	{
    		System.out.println(a[i]);
    	}
    	
    	for(int j=0;j<a.length-k;j++)
    	{
    		System.out.println(a[j]);
    	}
    }
}
