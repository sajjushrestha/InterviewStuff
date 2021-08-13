package sting;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Pangrams {

	public static void main(String[] args) {
		
		//String s="qmExzBIJmdELxyOFWv LOCmefk TwPhargKSPEqSxzveiun";
		 Scanner sc = new Scanner(System.in);
		 String s = sc.nextLine();
		char[] c=s.toLowerCase().replace(" ", "").toCharArray();

		Set<Character> set=new HashSet<>();
		for(char n:c)
		{
		
				set.add(n);
		}	
		
		System.out.println(set.size()==26 ? "pangram":"not pangram");
 
		 sc.close();
	}

}
