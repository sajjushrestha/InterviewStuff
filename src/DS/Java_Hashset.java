package DS;

import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Java_Hashset {

	public static void main(String[] args) throws Exception, IOException { 
		
		Scanner s = new Scanner(System.in);
    int t = s.nextInt();
    String [] pair_left = new String[t];
    String [] pair_right = new String[t];
    Set<String> set=new HashSet<String>();
    
    for (int i = 0; i < t; i++) {
        pair_left[i] = s.next();
        pair_right[i] = s.next();
        
        
    }
    int j=0;
	
    for (int i = 0; i < t; i++) {
   
        set.add(pair_left[i] + " "+pair_right[i] );  
    }
	for (int i = 0; i < t; i++) {
		
       if(set.contains(pair_left[i] + " "+pair_right[i] ))
       {
    	   j++;
    	   System.out.println(j);
    	   set.remove(pair_left[i] + " "+pair_right[i] );
       }
       else
       {
    	   System.out.println(j);
       }
    }
	
	
	}

}
