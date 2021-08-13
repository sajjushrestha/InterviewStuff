package java;

public class Third_highest {

	public static void main(String[] args) {
		
		
		int a[]= {3,1,5,9,0};
		int h=a[0];
		for(int i=0;i<a.length;i++)
		{
			
			
			if(a[0]>a[i])
			{
				h=a[0];
			}
			else
			{
				h=a[i];
			}
		}
		
		System.out.println(h);

	}

}
