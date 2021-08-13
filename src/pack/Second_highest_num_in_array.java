package pack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Second_highest_num_in_array {

	public static void main(String[] args) {
		 int arr[] = { 100,14, 46, 47, 94, 94, 52, 86, 36, 94, 89 };
	        int largest = 0;
	        int secondLargest = 0;
	        System.out.println("The given array is:");
	        for (int i = 0; i < arr.length; i++)
	        {
	            System.out.print(arr[i] + "\t");
	        }
	        for (int i = 0; i < arr.length; i++)
	        {
	            if (arr[i] > largest)
	            {
	                secondLargest = largest;
	                largest = arr[i];
	            }
	            else if (arr[i] > secondLargest)
	            {
	                secondLargest = arr[i];
	            }
	        }
	        System.out.println("\nSecond largest number is:" + secondLargest);
	        System.out.println("Largest Number is: "  +largest);
	        
	        
	        Set<Integer> s=new TreeSet<Integer>();
	        for (int i = 0; i < arr.length; i++)
	        {
	        	 s.add(arr[i]);
	        }
	       List<Integer> al=new ArrayList<Integer>(s);
	       Collections.sort(al);
	       
	       System.out.println("\nSecond largest number using collections is:" +al.get(al.size()-2));
	        		

	}

}
