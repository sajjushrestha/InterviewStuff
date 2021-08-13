package pack;

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
		int a[]= {1,4,3,2,5,9,8,0,1};
		
		int n=a.length;
int k=4;
rev(a,k);

for (int i = 0; i < n; i++) 
    System.out.print(a[i] + " "); 
} 
	}


