package leetcode;

import java.util.Arrays;

public class Missing_Number {

	public static void main(String[] args) {
		int[] a= {7,2,3,5};
		
		
		
		allMissing(a);

	}
	
	public static void allMissing(int[] a) {
		
	Arrays.sort(a);
	int j = 0;
	int n=a.length;
	
	for (int i = 0; i < a[n - 1]; i++) {
	    if (i == a[j]) {
	        j++;
	    }
	    else {
	        System.out.println(i);
	    }
	}}
	
	private static void printMissingNumber(int[] a) {
		int n=a.length;
	
	
	int sum=0;
	for(int i:a)
		sum=sum+i;
	
	//System.out.println(sum);
	
	Arrays.sort(a);
	int l=a[n-1];
	
	int p=(l+(l*l))/2;
	//
	System.out.println("Missing number "+(p-sum));}
	
}
