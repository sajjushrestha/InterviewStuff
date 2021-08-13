package sting;

import java.util.Scanner;

public class CaesarCipher_Charcters_Rotation {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		
		String s=sc.next();
		int n=sc.nextInt();
		
		String q = "",p="";

		for(char i='a';i<='z';i++)
		{
		q=q+i;
			
		}
		

		
		
		p=q.substring(n%26)+q.substring(0, n%26);
		
		
		
		for(char l:s.toCharArray())
		{
			if(Character.isAlphabetic(l) && Character.isLowerCase(l))
			{
			 System.out.print(p.charAt(q.indexOf(l)));
			
			}
			else if(Character.isAlphabetic(l) && Character.isUpperCase(l))
			{
				System.out.print(Character.toString(p.charAt(q.toUpperCase().indexOf(l))).toUpperCase());
			}
			else
			{
				System.out.print(l);
			}
				
		}
		

	}

}
