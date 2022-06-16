package interview;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class Remove_duplicate_in_array {

	public static void main(String[] args) {
		
	//	removeUsingLinkedHashSet();
		int[] a= {7,3,2,1,7,6,0,3,3,2,3,4,5,6,0,-1};
		//int a[] = {1, 2, 2, 3, 4, 4, 4, 5, 5}; 
		Arrays.sort(a);
		int n=a.length;
		
	   n=removeDuplicates(a,n);

		 // Print updated array 
        for (int i=0; i<n; i++) 
           System.out.print(a[i]+" "); 
        
        System.out.println("**************Using removeDuplicates***********************");  
        int[] b= {7,3,2,1,7,6,0,3,3,2,3,4,5,6,0,-1};
        System.out.println( removeDuplicates(b)); 
       
        
      System.out.println("**************Using LinkedHashSet***********************");  
        removeUsingLinkedHashSet();
		
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
	 
	 
	 private static int[] removeDuplicates(int[] origArray) {
		 
	        int[] tempArray = new int[origArray.length];
	         
	        int indexJ = 0;
	        for (int indexI = 0; indexI < origArray.length - 1; indexI++) 
	        {
	            Integer currentElement = origArray[indexI];
	             
	            if (currentElement != origArray[indexI+1]) {
	                tempArray[indexJ++] = currentElement;
	            }
	        }
	         
	        tempArray[indexJ++] = origArray[origArray.length-1];
	         
	        return tempArray;
	    }
	 
	 
	 
	 public static void removeUsingLinkedHashSet()
	    {
	        //Array with duplicate elements
	        Integer[] numbers = new Integer[] {1,2,3,4,5,1,3,5};
	         
	        //This array has duplicate elements
	        System.out.println( Arrays.toString(numbers) );
	         
	        //Create set from array elements
	        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>( Arrays.asList(numbers) );
	         
	        //Get back the array without duplicates
	        Integer[] numbersWithoutDuplicates = linkedHashSet.toArray(new Integer[] {});
	         
	        //Verify the array content
	        System.out.println( Arrays.toString(numbersWithoutDuplicates) );
	    }
	
	}

