package sting;

import java.util.Scanner;

public class Beautiful_Binary_String {

	public static void main(String[] args) {
		
		 Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        String B = in.next();
	        System.out.println((B.length() - B.replaceAll("010", "").length())/3);
		/*
		 * 
		 * Scanner sc=new Scanner(System.in); int n=sc.nextInt();
		 * 
		 * String s=sc.next();
		 * 
		 * int count=0; String t="";
		 * 
		 * 
		 * for(int i=0;i<n-1;i=i+3) { if(i+3<=n) t=s.substring(i, i+3); else
		 * t=s.substring(i);
		 * 
		 * if(t.contains("010")) { count++; //System.out.println(i);
		 * //System.out.println(i+3); }
		 * 
		 * } System.out.println(count);
		 */}

}
