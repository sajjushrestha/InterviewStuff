package daatStructures_HR;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class TwoDArrayDS {

	    public static void main(String[] args) throws IOException {
	        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

	        List<List<Integer>> arr = new ArrayList<>();

	        for (int i = 0; i < 6; i++) {
	            String[] arrRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

	            List<Integer> arrRowItems = new ArrayList<>();

	            for (int j = 0; j < 6; j++) {
	                int arrItem = Integer.parseInt(arrRowTempItems[j]);
	                arrRowItems.add(arrItem);
	            }

	            arr.add(arrRowItems);
	        }

	        int result = TwoDArrayDS.hourglassSum(arr);
	        bufferedReader.close();
			/*
			 * bufferedWriter.write(String.valueOf(result)); bufferedWriter.newLine();
			 * 
			 * bufferedReader.close(); bufferedWriter.close();
			 */
	    }
	    
	    public static int hourglassSum(List<List<Integer>> arr) {
	    	int res=0;
	    	 List<List<Integer>> inarr = new ArrayList<>();
	    	 List<Integer> sumlist = new ArrayList<>();
	    	 int k=0;int m=0;
	    	 int sum=0;
	    	System.out.println(arr);
	    	
	    	for(int i=0;i<3;i=i++)
	    	{ List<Integer> arrRowItems = new ArrayList<>();
	    		for(int j=0;j<3;j++)
	    		{
	    			 int arrItem = arr.get(i).get(j);
	    			 arrRowItems.add(arrItem);
	    			
	    		}
	    		
	    		 inarr.add(arrRowItems);
	    	
	    	}
	    	System.out.println(inarr);
	    	 inarr.get(1).set(0, 0);
    		 inarr.get(1).set(2, 0);
    		 
    		 System.out.println(inarr);
				/*
				 * for(int i=0;i<3;i++) { for(int j=0;j<3;j++) { int arrItem =
				 * arr.get(i).get(j); sum=sum+arrItem; } // sumlist.add(sum); }
				 * 
				 * sumlist.add(sum); System.out.println(sum);
				 */
	    	
			return res;
		  
		    }

}
