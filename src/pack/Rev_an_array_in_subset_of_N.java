package pack;

import java.util.Stack;

public class Rev_an_array_in_subset_of_N {

	static void rev(int[] a,int k)
	{
		int n=a.length;
		for(int i=0;i<n-1;i+=k)
		{
			int start=i;
			
			int end=Math.min(i+k-1, n-1);
			int temp;
			
			while(start<end)
			{
				temp=a[start];
				a[start]=a[end];
				a[end]=temp;
				start++;
				end--;
			}
		}
	}
	
	
	public static void main(String[] args) {
		int a[]= {1,4,3,2,5,9,8,0,1,2,3,4};
		
		int n=a.length;
int k=5;
rev(a,k);

for (int i = 0; i < n; i++) 
    System.out.print(a[i] + " "); 

int b[]= {1,4,3,2,5,9,8,0,1,2,3,4};
rev2(b,k);

} 
	
	
	public static void rev2(int[] a,int k)
	{
		StringBuffer sb=new StringBuffer();
		
		
		for(int i:a)
		{
			sb.append(i);
		}
		
		System.out.println();
		int i=0;
		while(i<sb.length())
		{
			
			String n=sb.substring(i, k+i>sb.length()?sb.length():k+i);
			
			for(int j=n.length()-1;j>=0;j--)
			{
				System.out.print(n.charAt(j)+" ");
			}
		i=i+k;
		}
	}
	}


