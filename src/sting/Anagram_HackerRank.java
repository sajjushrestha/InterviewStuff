package sting;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram_HackerRank {
	
	 static int anagram(String s) {
		 int count=0;
		 int n=s.length();
		 if(n%2==0)
		 {
			String a= s.substring(0, n/2);
			Arrays.sort(a.toCharArray());
			String b= s.substring(n/2);
			Arrays.sort(b.toCharArray());
			
			for(int i=0,j=0;i<j;i++,j--)
			{
				if(a.charAt(i)!=b.charAt(j))
				{
					count++;
				}
			}
			 
		 }
		 else
		 {
			 return -1;
		 }
		 
		return count;


	    }

	    private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
		 int q = scanner.nextInt();
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        for (int qItr = 0; qItr < q; qItr++) {
	            String s = scanner.nextLine();

	            int result = anagram(s);

	           
	        }

	        scanner.close();
	}

}
