package edabit;

import java.util.Arrays;

public class Programmers_Problem {
	
	public static int programmers(int one, int two, int three) {
		int[] a= {one,two,three};
		
		Arrays.sort(a);
		
		
		return a[2]-a[0];
		
		 
		
	  }
	
	public static boolean checkEnding(String str1, String str2) {
		
		if(str1.endsWith(str2))
			return true;
		else
			return false;
    
  }	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		programmers(147, 33, 526);
		
	}

}
