package sting;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Funny_String {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
String s="";
for(int j=0;j<n;j++) {
s=sc.next();

boolean flag=true;



StringBuffer sb=new StringBuffer(s);
sb.reverse();

for(int i=0;i<s.length()-1;i++)
{
	int d=s.charAt(i+1)-s.charAt(i);
	
	
	
	int e=sb.charAt(i+1)-sb.charAt(i);
	
	
	if(Math.abs(d)!=Math.abs(e))
	{
	 flag=false;
	}
	
	
}


System.out.println(flag ? "Funny":"Not Funny");


}

	
}
}
