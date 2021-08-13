package sting;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Two_Characters {

	public static void main(String[] args) {
		
		//System.out.println(alternate("asdcbsdcagfsdbgdfanfghbsfdab"));
		solution();
		
	}
	
	static void solution()
	{

        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        
        int max = 0;
        for (char c1 = 'a'; c1 <= 'z'; c1++) {
            for (char c2 = (char)(c1 + 1); c2 <= 'z'; c2++) {
                int len = 0;
                char prev = '\0';
                for (int i = 0; i < s.length(); i++) {
                    char next = s.charAt(i);
                    if (next == c1 || next == c2) {
                        if (next != prev) {
                            len++;
                            prev = next;
                        } else {
                            len = 0;
                            break;
                        }
                    }
                }
                max = Math.max(max, len);
            }
        }
        System.out.println(max>1?max:0);
	}
	
	
	static int alternate(String s) {

		
		//String s="beabeefeab";
		int n=s.length();
		String t="";
		
		char[] c=s.toCharArray();
		Set<String> set=new HashSet<>();
		
	
		for(int j=1;j<c.length;j++)
		{
			int flag=0;
			char x=c[j];
			char y=c[j-1];
			if(x!=y) {
			t=s.replaceAll("["+x+y+"]"+"","");
			}
			//System.out.println("t is "+t);
			char[] f=t.toCharArray();
			
			for(int i=1;i<f.length;i++)
			{
				if(f[i]==f[i-1])
				{
				flag=1;
				break;
				}
				
				
			}
			
			if(flag==0)
			{
				set.add(t);
			}
			
		}
		
		
		  String r=""; 
		  Iterator<String> itr=set.iterator();
		  int temp=0;
		  while(itr.hasNext()) 
		  {

			  String res=itr.next();
			  int l=res.length();
			  
			  
			  if(l>temp)
			  {
				  temp=l;
				  r=res;
			  }
		  }
		 
		  System.out.println(r);
		return r.length();

	
	}

}
