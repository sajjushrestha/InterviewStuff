package sting;

public class Count_upper_lower_numeric_specialCase {

	public static void main(String[] args) {

 String s="S@jju101!#$";
 
 char ch[]=s.toCharArray();
 int lower=0,upper=0,numeric=0,spl=0;
 
 
 	for(int i=0;i<ch.length;i++)
 	{
 		if(Character.isAlphabetic(ch[i]))
 		{
 			
 			if(ch[i]>=97 && ch[i]<=122)
 			{
 				lower++;
 			}
 			else
 			{
 				upper++;
 			}
 		}
 		else if(Character.isDigit(ch[i]))
 		{
 			numeric++;
 		}
 		else
 		{
 			spl++;
 		}
 	}

 	
 	System.out.println("Upper Case letters : "+upper);
 	System.out.println("Lower Case letters : "+lower);
 	System.out.println("Numerics Case letters : "+numeric);
 	System.out.println("Special Case letters : "+spl);
	}

}
