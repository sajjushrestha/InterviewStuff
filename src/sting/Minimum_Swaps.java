package sting;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Minimum_Swaps {
	
	 
	  static int minimumSwaps(int[] array) 
	  {
	  
	  int n = array.length - 1; 
	  int minSwaps = 0;
	  
	  for (int i = 0; i < n; i++) 
	  { 
		  if (i < array[i] - 1) 
		  { 
			  swap(array, i,Math.min(n, array[i] - 1)); 
			  minSwaps++; 
			  i--; 
		  } 
	 } 
	  return minSwaps; 
	  }
	  
	  private static void swap(int[] array, int i, int j) 
	  { 
	  int temp = array[i];
	  array[i] = array[j]; 
	  array[j] = temp; 
	  }
	  
	  private static final Scanner scanner = new Scanner(System.in);
	  
	  public static void main(String[] args) throws IOException {
	  
	  
	  int n = scanner.nextInt(); 
	  scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
	  
	  int[] arr = new int[n];
	  
	  String[] arrItems = scanner.nextLine().split(" ");
	  
	  
	  for (int i = 0; i < n; i++) 
	  { 
		  int arrItem = Integer.parseInt(arrItems[i]);
	      arr[i] = arrItem; 
	  }
	  
	  int res = minimumSwaps(arr);
	  
	  System.out.println(res);
	  
	  scanner.close(); }
	 
	
	/*
	 * static int minimumSwaps(int[] a) { int swap=0;
	 * 
	 * for(int i=0;i<a.length;i++) { if(i+1!=a[i]) { int t=i; while(a[t]!=i+1) {
	 * t++; } int temp=a[t]; a[t]=a[i]; a[i]=temp; swap++; } } return swap;
	 * 
	 * }
	 * 
	 * public static void main(String[] args) {
	 * 
	 * 
	 * int[] a= {4,3,1,2};
	 * 
	 * int s=minimumSwaps(a);
	 * 
	 * 
	 * System.out.println(s);
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * }
	 */
	  
	 }
