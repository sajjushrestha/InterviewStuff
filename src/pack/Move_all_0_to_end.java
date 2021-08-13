package pack;

public class Move_all_0_to_end {

	static void move(int a[],int n)
	{
		
		int count = 0;
		
		for(int i=0;i<n;i++)
		{
			if(a[i]!=0)
			{
				a[count++]=a[i];
			}
		}
		
		while(count<n)
		{
			a[count++]=0;
		}
	}
	
	
	public static void main(String[] args) {
		
int a[]= {1,0,2,0,3,0,4,0,5,0,6,0};
int n=a.length;

move(a,n);

for(int i=0;i<n-1;i++)
{
	System.out.print(a[i]);
}
	}

}
