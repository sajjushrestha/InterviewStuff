package interview;

public class Rotation_Array {

	public static void main(String[] args) {
	
		int[] a= {1,2,3,4,5,6,7,8,9,0};
		int[] b= {1,2,3,4,5,6,7,8,9,0};
		//rotate(a,1);
		int right=2;  //right rotation
		int left=b.length-right; 
		anil(a,right);
		System.out.println("");
		vamsi(a,right);
		System.out.println("");
		anil(b,left);
		System.out.println("");
		vamsi(a,left);
		
		
	
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
			System.out.print(a[n+i-k]+" ");
		}
		
		for(int j=0;j<(n-k);j++)
		{
			System.out.print(a[j]+" ");
		}
	}
	
public static void vamsi(int[] a, int k) {
		
		
		int n=a.length;
		
		
		for(int i=n-k;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		
		for(int j=0;j<(n-k);j++)
		{
			System.out.print(a[j]+" ");
		}
	}
}
