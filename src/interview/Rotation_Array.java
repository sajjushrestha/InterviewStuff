package interview;

public class Rotation_Array {

	public static void main(String[] args) {
	
		int[] a= {1,2,3,4,5};
		int[] b= {1,2,3,4,5};
		rotate(a,1);
		
		anil(b,1);
	
	}

	
	public static void rotate(int[] arr, int order) {
		if (arr == null || order < 0) {
		    throw new IllegalArgumentException("Illegal argument!");
		}
	 
		for (int i = 0; i < order; i++) {
			for (int j = arr.length - 1; j > 0; j--) {
				int temp = arr[j];
				arr[j] = arr[j - 1];
				arr[j - 1] = temp;
			}
		}
		
		for(int j=0;j<arr.length;j++)
		{
			System.out.print(arr[j]);
		}
	}
	
	
	public static void anil(int[] a, int k) {
		
		
		int n=a.length;
		
		
		for(int i=0;i<k;i++)
		{
			System.out.print(a[n-(k-i)]);
		}
		
		for(int j=0;j<(n-k);j++)
		{
			System.out.print(a[j]);
		}
	}
}
