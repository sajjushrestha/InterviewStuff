package sting;

import java.util.Scanner;

public class Jumping_on_the_clouds {

	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);
		 int n = scanner.nextInt();
		 scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		 int arr[] = new int[n];
		 
		  String[] cItems = scanner.nextLine().split(" ");
	       

	        for (int i = 0; i < n; i++) {
	            int cItem = Integer.parseInt(cItems[i]);
	            arr[i] = cItem;
	        }

		int count=0;
		
		
		 int i = 0;
		 
		 while(i < arr.length-1)
		 {
		 if(i+2 < arr.length && arr[i + 2] == 0){
		 i = i + 2;
		 count++;
		 }
		 else{
		 i++;
		 count++;
		 }
		 }
		 System.out.println(count);

	}

}

