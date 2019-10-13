package interview;

import java.io.InputStream;
import java.util.Scanner;

public class Reverse_array {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] a=new int[n];
		
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
			
		}
		
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[(a.length-1)-i]);
        }

	}

}
