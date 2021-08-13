package DS;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Genrics {
	
	public static void main( String args[] ) throws NumberFormatException, IOException {
		
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		
		String s=br.readLine();
		
		//System.out.println(s);
		
		String[] split=s.split(" ");
		int l=split.length;
	//	System.out.println(l);
		int c=0,x=0;
		for(int i=0;i<l;i++)
		{
			//c=c+Integer.parseInt(split[i]);
			c=c+Integer.valueOf(split[i]);
			
		}
		//System.out.println(c);
		
		for(int i=0;i<l;i++)
		{
			
			 x=n*Integer.parseInt(split[i]);
			if(x>c)
			{
				System.out.println(split[i]);
				break;
			}
			
			
		}
		
		
	}

}



