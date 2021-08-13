package sting;

import java.util.Scanner;

public class CamelCase {

	public static void main(String[] args) {

 //String s="saveChangesInTheEditor";
 Scanner sc=new Scanner(System.in);
 String s=sc.next();
 char[] ch=s.toCharArray();
 int count=0,scount=1;
 
 for(char c:ch)
 {
	 if(!Character.isLowerCase(c))
	 {
		count++; 
	 }
 }

 System.out.println(count+1);
 
 for(char c:ch)
 {
	 if(c>=67 && c<=91)
	 {
		scount++; 
	 }
 }
 
 System.out.println(scount);
 
	}

}
