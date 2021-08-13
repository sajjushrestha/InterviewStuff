package sting;

import java.util.Scanner;

public class Java_string_compare {

	public static void main(String[] args) { 
		String A="madams";


int n=A.length();
String rev="";
for(int i=n-1;i>=0;i--)
{
rev=rev+A.charAt(i);
}
System.out.println(rev);

   System.out.println(rev.equals(A) ? "Yes":"");
    }

}
