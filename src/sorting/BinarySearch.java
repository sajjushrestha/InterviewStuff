package sorting;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		int a[]= {3,1,2,-9,7,0};
		Arrays.sort(a);
		
		for(int c:a)
		System.out.print(+c +" ");
		System.out.println();
		binary(a,0,a.length-1,7);
	}
	
	static void binary(int arr[],int first,int last,int key)
	{
		 int mid = (first + last)/2; 
		 
		   while( first <= last )
		   {
			   
		      if ( arr[mid] < key )
		      {  
		        first = mid + 1;     
		      }else if ( arr[mid] == key )
		      {  
		        System.out.println("Element is found at index: " + mid);  
		        break;  
		      }else{  
		         last = mid - 1;  
		      }  
		      mid = (first + last)/2;  
		   }  
		   if ( first > last )
		   {  
		      System.out.println("Element is not found!");  
		   }  
		
		
	}

}
