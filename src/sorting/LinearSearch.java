package sorting;

public class LinearSearch {

	public static void main(String[] args) {
		
		 int[] a1= {10,20,30,50,70,90};    
	        int key = 50;    
	        System.out.println(key+" is found at index: "+linear(a1, key));    
	        
	       
	}
	
	
	public static int linear(int[] a,int key)
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==key)
			{
				return i;
			}
		}
		
		return -1;
	}

}
