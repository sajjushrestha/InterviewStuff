package One_D_array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Memorise_Me {

	public static void main(String[] args) throws Exception, IOException {
		
		
		BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
		  int n=Integer.parseInt(sc.readLine());
		 
		  String[] s=sc.readLine().split(" ");
 
		  int[] a=new int[n];
		  int[] count=new int[1001];
		  int spl=s.length; 
		  
		  for(int i=0;i<spl;i++)
		  {
			a[i]=Integer.parseInt(s[i]);
		  count[a[i]]++;
		
		  }
		  int q=Integer.parseInt(sc.readLine());
		  
		  for(int i=0;i<q;i++) 
		  { 
			  int x =Integer.parseInt(sc.readLine()); 
			  
		  if(count[x]==0) 
		  {
		  System.out.println("NOT PRESENT"); 
		  } 
		  else 
		  { 
			  System.out.println(count[x]);
		  
		  } 
		  }
		 
		 
		
	}

	

	
	
}
