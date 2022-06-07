package sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TestClass {
	
	public static void main(String args[]) {
	int[] a= {1,1,3,5,1,3,2,3,6};
	Arrays.sort(a);
	int n=a.length;
   
	n=remove(a,n);
	

for(int i=0;i<n;i++)
{
System.out.print(a[i]+" " );

	}

System.out.println("\n**************Using LinkedHashSet***********************");  
Integer[] numbers = new Integer[] {1,1,3,5,1,3,2,3,6};
linkedList(numbers);


TreeMap<String,Integer> t=new TreeMap<String,Integer>();

t.put("sajju", 101);
t.put("guna", 48);
t.put("abcd", 123);
t.put("qwerty", 3);

Set<Entry<String, Integer>> set=t.entrySet();

System.out.println(set);


List<Entry<String, Integer>> l=new ArrayList<Entry<String, Integer>>(set);

Comparator<Entry<String, Integer>> comp=new Comparator<Entry<String, Integer>>() {


	@Override
	public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
		// TODO Auto-generated method stub
		return o1.getValue()-o2.getValue();
	}
	
};

		Collections.sort(l,comp);
		
		 for(Map.Entry<String, Integer> entry:l){
	            System.out.println(entry.getKey()+"  ====   "+entry.getValue());
	        }




	}
	
	
	
	public static int remove(int a[],int n)
	{
		if(n==0 || n==1)
			return n;
		 int j=0;
		 for(int i=0;i<n-1;i++)
		 {
		 	if(a[i]!=a[i+1])
		 	{
		 		
		 		a[j++]=a[i];
		 	}
		 	
		 	
		 }

		 a[j++]=a[n-1];
		
		 return j;
		 	}
	
	
	public static void linkedList(Integer[] a)
	
	{
		Arrays.sort(a);
		LinkedHashSet<Integer> l=new LinkedHashSet<>(Arrays.asList(a));
		
		Integer[] num=l.toArray(new Integer[] {});
		
		System.out.println(Arrays.toString(num));
	}
	
	
	}

	

