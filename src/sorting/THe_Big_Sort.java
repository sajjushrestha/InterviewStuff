package sorting;

import java.math.BigInteger;
import java.util.Scanner;

public class THe_Big_Sort {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String[] p=new String[n];
		BigInteger[]  k = null;
		long temp;
		long l[] = new long[n];
		
		for(int i=0;i<n;i++)
		{
			p[i]=sc.next();
			l[i]=Long.parseLong(p[i]);
			k[i] =BigInteger.valueOf(l[i]);
			
			System.out.println(k[i]);
	
		}
		

		/*
		 * for(int i=0;i<n-1;i++) { for (int j = i + 1; j < n; j++) { if(k[i]>k[j]) {
		 * temp=k[j]; k[j]=k[i]; k[i]=temp;
		 * 
		 * } } }
		 */
		
		
		
	/*	for(int i=0;i<n;i++)
		{
		System.out.println(k[i]);
		}
		
		*/
		
		
	}

}
