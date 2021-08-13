package search;

public class Count_Array {

	public static void main(String[] args) {
		
		
		int a[]= {1,1,3,4,5,6,7,1,2,3,5};
		int arr[]=new int[10000];
		
		   for(int i=0;i<a.length;i++)
		   {
			   int num=a[i];
			   arr[num]+=1;
			   
			   System.out.println(arr[num]);
		   }

	}

}
