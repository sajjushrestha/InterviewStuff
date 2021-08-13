package search;

import java.util.Scanner;

public class Paris {

	 private static final Scanner scanner = new Scanner(System.in);
	 
	public static void main(String[] args) {
	
		 String[] nk = scanner.nextLine().split(" ");

	        int n = Integer.parseInt(nk[0]);

	        int k = Integer.parseInt(nk[1]);

	        int[] a = new int[n];
	        int count=0;

	        String[] arrItems = scanner.nextLine().split(" ");
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        for (int i = 0; i < n; i++) {
	            int arrItem = Integer.parseInt(arrItems[i]);
	            a[i] = arrItem;
	        }
	        
	       
	        
	        for (int i = 0; i < n; i++) {
	        	
	        	 for (int j = i+1; j < n; j++) 
	        
	        	if(Math.abs(a[j]-a[i])==k )
	        	{
	        		count++;
	        		
	        		
	        	}
	        
	        	
	        }
	        System.out.println(count);
	        
	}

}
