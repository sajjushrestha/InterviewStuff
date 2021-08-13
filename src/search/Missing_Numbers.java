package search;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Missing_Numbers {

	

	    private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		
		//Solution();
		
		
		
		  
		
		  int n = scanner.nextInt(); scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		  
		  int[] arr = new int[n];
		  
		  String[] arrItems = scanner.nextLine().split(" ");
		  scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		  
		  Map<Integer,Integer> map1=new HashMap<>(); HashMap<Integer,Integer> map2=new
		  HashMap<>();
		  
		  for (int i = 0; i < n; i++) { int arrItem = Integer.parseInt(arrItems[i]);
		  arr[i] = arrItem;
		  
		  if(map1.containsKey(arr[i])) { map1.put(arr[i],map1.get(arr[i])+1); }
		  
		  else { map1.put(arr[i],1); }
		  
		  }
		  
		  int m = scanner.nextInt(); scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		  
		  int[] brr = new int[m];
		  
		  String[] brrItems = scanner.nextLine().split(" ");
		  scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		  
		  for (int i = 0; i < m; i++) { int brrItem = Integer.parseInt(brrItems[i]);
		  brr[i] = brrItem;
		  
		  if(map2.containsKey(brr[i])) { map2.put(brr[i],map2.get(brr[i])+1); }
		  
		  else { map2.put(brr[i],1); } }
		  
		  
		  for(Map.Entry<Integer, Integer> entry:map2.entrySet()) { int
		  map2Key=entry.getKey(); int map2Value=entry.getValue();
		  
		  if(map1.containsKey(map2Key)) { int map1Value=map1.get(map2Key);
		  
		  if(map1Value!=map2Value) { System.out.print(map2Key+ " "); } }
		  
		  else { System.out.print(map2Key+ " "); }
		  
		
		  }
		  
		   
		  
		  
		 
		 }
		
		static void Solution()
		{
			Scanner kb=new Scanner(System.in);
			int arr1[]=new int[10000];
			int arr2[]=new int[10000];
			int T=kb.nextInt();
			for(int i=0;i<T;i++)
			{
			int num=kb.nextInt();
			arr1[num]+=1;
			System.out.println(arr1[num]);
			}
			int N=kb.nextInt();
			for(int j=0;j<N;j++)
			{int num=kb.nextInt();
			arr2[num]+=1;
			}
			for(int k=0;k<10000;k++)
			{
			if(Math.abs(arr1[k]-arr2[k])>0)

			System.out.print(k+" ") ;
			else
			continue;

			}
		}
		

	}


