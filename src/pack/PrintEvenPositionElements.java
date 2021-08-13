package pack;

public class PrintEvenPositionElements {

	public static void main(String[] args) {
		int[] a= {1,3,4,5,7};
		
		int n=a.length;
		
		for(int i=1;i<n;i=i+2)
		{
			System.out.println(a[i]);
		}

	}

}
