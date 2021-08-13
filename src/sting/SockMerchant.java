package sting;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class SockMerchant {

	private static final Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		
		 int n = scanner.nextInt();
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        int[] ar = new int[n];

	        String[] arItems = scanner.nextLine().split(" ");
	       

	        for (int i = 0; i < n; i++) {
	            int arItem = Integer.parseInt(arItems[i]);
	            ar[i] = arItem;
	        }

	      HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();  
	      
	      for(int i:ar)
	      {
	    	  if(map.containsKey(i))
	    	  {
	    		  map.put(i,map.get(i)+1);
	    	  }
	    	  else
	    	  {
	    		  map.put(i,1);
	    	  }
	      }
	      
	      int count=0;
	      for(Entry<Integer,Integer> entry:map.entrySet())
	      {
	    	  if(entry.getValue()>1)
	    	  {
	    		  count=count+(entry.getValue()/2);
	    	  }
	      }
	      
	      System.out.println(count);
	        
	}

}
