package sting;

import java.util.Scanner;

public class Array_Rotation {

	
	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7};
		int b[]= {-1,-100,3,99};
		vamsi(b,2);
		rotate(b,2);
		
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
    		System.out.print(a[i]+" ");
    	}
    	
    	for(int j=0;j<a.length-k;j++)
    	{
    		System.out.print(a[j]+" ");
    	}
    }
    
    public static void rotate(int[] arr, int order) {
    	if (arr == null || order < 0) {
    	    throw new IllegalArgumentException("Illegal argument!");
    	}
     
    	for (int i = 0; i < order; i++) {
    		for (int j = arr.length - 1; j > 0; j--) {
    			int temp = arr[j];
    			arr[j] = arr[j - 1];
    			arr[j - 1] = temp;
    		}
    	}
    	System.out.println();
    	for(int i=0;i<arr.length;i++)
    	{
    		System.out.print(arr[i]+" ");
    	}
    }
}
