package interview;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Remove_duplicate_in_array {

	public static void main(String[] args) {
		
		
		int[] a= {7,3,2,1,7,6,0,3,3,2,3,4,5,6,0,-1};
		//int a[] = {1, 2, 2, 3, 4, 4, 4, 5, 5}; 
		Arrays.sort(a);
		int n=a.length;
		
	   n=removeDuplicates(a,n);
		 // Print updated array 
        for (int i=0; i<n; i++) 
           System.out.print(a[i]+" "); 
		
		}
	
	
	
	 static int removeDuplicates(int arr[], int n) 
	    { 
	        if (n == 0 || n == 1) 
	            return n; 
	       
	        // To store index of next unique element 
	        int j = 0; 
	       
	        // Doing same as done in Method 1 
	        // Just maintaining another updated index i.e. j 
	        for (int i = 0; i < n-1; i++) 
	            if (arr[i] != arr[i+1]) 
	                arr[j++] = arr[i]; 
	       
	        arr[j++] = arr[n-1]; 
	       
	        return j; 
	    } 
	}

