package sting;

import java.io.IOException;
import java.util.Scanner;

public class Alternating_Characters {
	
	public static void main(String[] args) throws IOException {
		String a="ABABA";
		String b=""; 
		int count=0; 
		int n=a.length();
		  
		  for(int i=1;i<=n-1;i++) 
		  { 
			  if(a.charAt(i-1)==a.charAt(i))
			  {
		  a=a+a.replace(a.charAt(i-1)+"", ""); 
		  count++; 
		  } 
			  }
		  
		  
		  
		  System.out.println(count); 
		  
		  
		
		
	}
	
	
	/*
	 * 
	 * // Complete the alternatingCharacters function below. static int
	 * alternatingCharacters(String a) {
	 * 
	 * String b=""; int count=0; int n=a.length();
	 * 
	 * for(int i=1;i<=n-1;i++) { if(a.charAt(i-1)==a.charAt(i)) {
	 * b=a.replace(a.charAt(i-1)+"", ""); count++; } }
	 * 
	 * 
	 * 
	 * return count;
	 * 
	 * }
	 * 
	 * private static final Scanner scanner = new Scanner(System.in);
	 * 
	 * public static void main(String[] args) throws IOException {
	 * 
	 * 
	 * int q = scanner.nextInt(); scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
	 * 
	 * for (int qItr = 0; qItr < q; qItr++) { String s = scanner.nextLine();
	 * 
	 * int result = alternatingCharacters(s); System.out.println(result); }
	 * 
	 * 
	 * 
	 * scanner.close(); }
	 */}
