package search;

import java.io.IOException;
import java.util.Scanner;

public class Sherlock_and_Array {
	
	
	public static void main(String[] args) throws Exception, IOException {
		
		 /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        for(int i=0; i<k; i++){
            int n = in.nextInt();
            int[] arr = new int[n];
            for(int j=0; j<n; j++){
                arr[j] = in.nextInt();
            }
            System.out.println(decision(arr));
        }
    }
    
    public static String decision(int[] arr){
        int sum = 0;
        
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
        }
        
        //curr is cimulated sum in the left
        int curr = 0;
        for(int j=0; j<arr.length; j++){
            //left part equals right part
            if(curr == sum - arr[j]-curr){
                return "YES";
            }
            curr += arr[j];
        }
        return "NO";
		
        
    }

}



/*
 * 
 * 
 * 
 * Scanner sc=new Scanner(System.in);
 * 
 * System.out.println("Enter no of TC's"); int n=sc.nextInt();
 * 
 * 
 * 
 * boolean flag=false;
 * 
 * 
 * 
 * for(int i=1;i<=n;i++) { System.out.println("Enter no of elemnets in TC"+i);
 * int a=sc.nextInt();
 * 
 * System.out.println("Enter  elemnets in TC"+i); String s=sc.next(); String[]
 * sp=s.split(" "); int[] x=new int[sp.length];
 * 
 * for(int m=0;m<=(x.length)-1;m++) {
 * 
 * x[m]=Integer.parseInt(sp[m]); }
 * 
 * for(int m=0;m<x.length;m++) { System.out.print(x[m]+" "); }
 * 
 * 
 * 
 * if(x.length%2!=0) { int right = 0,left=0; int mid=(x.length-1)/2;
 * 
 * for(int j=1;j<=mid;j++) { right=right+x[mid+j];
 * 
 * }
 * 
 * for(int k=0;k<mid;k++) { left=left+x[k]; }
 * 
 * if(right==left) { flag=true; } } else { int right = 0,left=0;
 * 
 * int mid1=(x.length-1)/2; int mid2=0;
 * 
 * if(mid1-1==0) { mid2=mid1+1; } else { mid2=mid1-1; }
 * 
 * for(int j=1;j<=mid1;j++) { right=right+x[mid1+j];
 * 
 * }
 * 
 * for(int k=0;k<mid1;k++) { left=left+x[k]; }
 * 
 * if(right==left) { flag=true; }
 * 
 * right = 0;left=0; for(int j=1;j<mid2;j++) { right=right+x[mid2+j];
 * 
 * }
 * 
 * for(int k=0;k<mid2;k++) { left=left+x[k]; }
 * 
 * if(right==left) { flag=true; } }
 * 
 * 
 * System.out.println(flag ?"YES":"NO");
 * 
 * }
 * 
 */