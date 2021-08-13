package sting;

import java.util.Scanner;

public class The_Love_Letter_Mystery {

	public static void main(String[] args) {
		
		
		
		 /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        input.nextLine();
        
        tests:
        for(int t = 0; t < T; t++)
        {
            String s = input.nextLine();
            int operationsPerformed = 0;
            int i = 0;
            int j = s.length() - 1;
            while(i < j)
            {
                operationsPerformed += Math.abs(s.charAt(i) - s.charAt(j));
                i++;
                j--;
            }
            System.out.println(operationsPerformed);
        }
		/*
		 * 
		 * String s="abcd"; int n=s.length(); char[] ch=s.toCharArray(); String
		 * t="",rev=""; int count=0,z = 0;
		 * 
		 * for(int i=0;i<ch.length;i++) { char c=s.charAt(i); z=0; while(c>'a') { z++;
		 * rev=""; int x=c; int p=x-1; char m=(char)p;
		 * 
		 * t=s.substring(0, i)+m+s.substring(s.indexOf(c)+z);
		 * 
		 * 
		 * 
		 * for(int k=t.length()-1;k>=0;k--) { rev=rev+t.charAt(k); }
		 * 
		 * if(rev.equals(t)) { count++; break; } else { rev=""; } c--;
		 * 
		 * } } System.out.println(z);
		 * 
		 * 
		 * 
		 */}

}

/*
 * int j=1,count=0; char ch[]=s.toCharArray(); String t="";
 * 
 * 
 * for(int ii=0;ii<ch.length;ii++) { int i=ch[ii]; String rev="";
 * 
 * int index;
 * 
 * while(i>97 && i<122) { int p=i-j;
 * 
 * char x=(char)p;
 * 
 * index=s.indexOf(i);
 * 
 * String before=s.substring(0,index); String after=s.substring(index+1);
 * 
 * t=before+x+after; // t=s.replace((char)i, x);
 * 
 * for(int k=t.length()-1;k>=0;k--) { rev=rev+t.charAt(k); }
 * 
 * if(rev.equals(t)) { count++; break; } else { rev=""; }
 * 
 * i--;
 * 
 * } } //System.out.println(count);
 */