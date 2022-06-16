package leetcode;

import java.util.LinkedList;

public class Move_Zeros_End {

	public static void main(String[] args) {
		 int a[]= {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0};
		 LinkedList<Integer> l=new LinkedList<Integer>();
		 int count=0;
		 
		 for(int i:a)
		 {
			 if(i!=0)
				 l.add(i);
			 else
				 count++;
		 }
		 
		 System.out.println(count);
		 int i=0;
		 while(i<count)
		 {
			 l.add(0);
			 i++;
		 }
		 System.out.println(l);
		 
		 pushZerosToEnd(a,a.length);
		 for (int j=0; j<a.length; j++) {
	            System.out.print(a[j]+" ");
	    }
	}
	
	
	static void pushZerosToEnd(int arr[], int n)
    {
        int count = 0;  // Count of non-zero elements
 
        // Traverse the array. If element encountered is
        // non-zero, then replace the element at index 'count'
        // with this element
        for (int i = 0; i < n; i++)
            if (arr[i] != 0)
                arr[count++] = arr[i]; // here count is
                                       // incremented
 
        // Now all non-zero elements have been shifted to
        // front and 'count' is set as index of first 0.
        // Make all elements 0 from count to end.
        while (count < n)
            arr[count++] = 0;
    }
}
