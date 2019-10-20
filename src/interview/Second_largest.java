package interview;

import java.util.Scanner;

public class Second_largest {

	public static void main(String[] args) {
		  int arr[] = {12,35, 1, 10, 34, 1,36,63}; 
          int n = arr.length; 
          print2largest(arr, n);
	}
	
	
	
	public static void print2largest(int arr[], int arr_size) 
	{ 
		int i, first, second; 

/* There should be atleast two elements */
		if (arr_size < 2) 
		{ 
			System.out.print(" Invalid Input "); 
			return; 
		} 

		first = second = Integer.MIN_VALUE; 
		for (i = 0; i < arr_size ; i++) 
		{ 
/* If current element is smaller than  
first then update both first and second */
			if (arr[i] > first) 
			{ 
				second = first; 
				first = arr[i]; 
			} 

/* If arr[i] is in between first and  
second then update second  */
			else if (arr[i] > second && arr[i] != first) 
				second = arr[i]; 
		} 

		if (second == Integer.MIN_VALUE) 
			System.out.print("There is no second largest"+ 
        " element\n"); 
		else
			System.out.println("The second largest element"+ 
             " is "+ second ); 
		
		System.out.println("The First largest element"+ 
	             " is "+ first); 
		
		System.out.println("The Samllest element"+ 
	             " is "+ first); 
	} 
	
	
	
	
	//***********************************USing Sorting****************************************//
	public static void met()
	{
		int n, temp;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array(Minimum 2):");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all the elements:");
        for (int i = 0; i < n; i++) 
        {
            a[i] = s.nextInt();
        }
        for (int i = 0; i < n; i++) 
        {
            for (int j = i + 1; j < n; j++) 
            {
                if (a[i] > a[j]) 
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("Second Largest:"+a[n-2]);
        System.out.println("Smallest:"+a[0]);
	}
	
	
	}
