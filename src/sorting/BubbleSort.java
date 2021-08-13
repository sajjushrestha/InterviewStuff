package sorting;

public class BubbleSort {

	public static void main(String[] args) {

		int[] a = { 2, 34, 54, 6, 7 };
		bubble(a);

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

	public static void bubble(int arr[]) {

		int n = arr.length;
		int temp = 0;

		
		  for(int i=0;i<n;i++) 
		  { 
			  for(int j=1;j<n;j++) 
			  { 
				  if(arr[j-1]>arr[j]) 
				  {
					  
		  temp=arr[j]; 
		  arr[j]=arr[j-1];
		  arr[j-1]=temp; 
		  } 
				  }
		  
		  
		  }
		  
		 

	}

}
