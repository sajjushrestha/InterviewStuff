package sorting;

import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		/*
		 * int a[]= {1,4,-3,14,2,8,0}; selection(a); for(int i=0;i<a.length;i++) {
		 * System.out.println((a[i])); }
		 */
		
		int a[]= {1,4,-3,14,2,8,0}; selection(a); for(int i=0;i<a.length;i++) {
			  System.out.println((a[i])); }
		
		int size, i, j, temp;  
	       int arr[] = new int[50];  
	       Scanner scan = new Scanner(System.in);  
	         
	       System.out.print("Enter Array Size : ");  
	       size = scan.nextInt();  
	         
	       System.out.print("Enter Array Elements : ");  
	       for(i=0; i<size; i++)  
	       {  
	           arr[i] = scan.nextInt();  
	       }  
	         
	       System.out.print("Sorting Array using Selection Sort Technique..\n");  
	       for(i=0; i<size; i++)  
	       {  
	           for(j=i+1; j<size; j++)  
	           {  
	               if(arr[i] > arr[j])  
	               {  
	                   temp = arr[i];  
	                   arr[i] = arr[j];  
	                   arr[j] = temp;  
	               }  
	           }  
	       }  
	         
	       System.out.print("Now the Array after Sorting is :\n");  
	       for(i=0; i<size; i++)  
	       {  
	           System.out.print(arr[i]+ "  ");  
	       }  

	}

	
	/*
	 * How The Selection Sort Works? Selection sort involves two things. One is the
	 * SELECTION – selecting the lowest (or highest) element and another one is the
	 * PLACEMENT – placing the element selected in the first step in an appropriate
	 * position. Selection sort first selects the lowest (or highest) element and
	 * exchanges it with the element in the first position. Then, again selects
	 * lowest (or highest) element in the remaining elements i.e in the elements
	 * between inputArray[1] and inputArray[n-1] and exchanges it with the element
	 * in the second position. This selection and placement is continued until all
	 * the elements are in the sorted order.
	 */
	
	public static void selection(int a[])
	{
		int n=a.length;
		
		for(int i=0;i<n-1;i++)
		{
			int pos=i;
			//finding the position of smallest element between (i+1)th element and last element
			for(int j=i+1;j<n;j++)
			{
				if(a[j]<a[pos])
				{
					pos=j;
				}
			}
			//Swapping inputArray[i] and inputArray[pos]
			int temp=a[pos];
			a[pos]=a[i];
			a[i]=temp;
		}
	}
}
