package sorting;

import java.util.Scanner;

public class InsertionSortPart1 {
	 private static final Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		
		int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] a = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
      

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            a[i] = arrItem;
        }

        int least=a[n-1];
        
        for (int i = 0; i < n; i++) {
        	
        		  if(a[n-1-i]>least)
        		  {
        			  a[n-i]=a[n-1-i];
        			 
        		  }
        		  
        		  else if(a[n-1-i]<least)
        		  {
        			  a[n-i]=least;
        			  break;
        			 
        		  }
        		  else
        		  {
        			  
        		  }
        		  
        		  if(a[n-1]!=least)
        	        for (int j = 0; j < n; j++) {
        	          
        	           System.out.print(a[j]+" "); 
        	         
        	        }	
        		  
        System.out.println(""); 
        	      
        }
        
      

	}

}
