package sting;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SherlockHomes_valid_string {

	public static void main(String[] args) {
		
		 Scanner scan = new Scanner(System.in);
		  String s = scan.nextLine();
		char[] ch=s.toCharArray();
		int l=s.length();
		
		HashMap<Character,Integer> map=new HashMap<Character,Integer>();
		Map<Integer, Integer> countCount = new HashMap<Integer, Integer>();
		for(char c:ch)
		{
	if(map.containsKey(c))
	{
		map.put(c, map.get(c)+1);
	}
	else
	{
		map.put(c, 1);
	}
		}
		
		
		 for(Map.Entry<Character, Integer> entry : map.entrySet()){
			   if(countCount.containsKey(entry.getValue())){
			    countCount.put(entry.getValue(), countCount.get(entry.getValue())+1);
			   }
			   else{
			    countCount.put(entry.getValue(), 1);
			   }
			   
			  }
			  if(countCount.size() == 1){
			   System.out.println("YES");
			  }
			  else if(countCount.size() == 2){
			   if(countCount.containsValue(1)){
			    System.out.println("YES");
			   }
			   else{
			    System.out.println("NO");
			   }
			  }
			  else{
			   System.out.println("NO");
			  }

		
		/*
		 * TreeMap<Character,Integer> sort=new TreeMap<Character,Integer>(map);
		 * 
		 * 
		 * Comparator<Entry<Character,Integer>> comp=new
		 * Comparator<Entry<Character,Integer>>() {
		 * 
		 * @Override public int compare(Entry<Character, Integer> o1, Entry<Character,
		 * Integer> o2) {
		 * 
		 * Integer i1=o1.getValue(); Integer i2=o2.getValue();
		 * 
		 * return i1-i2; }
		 * 
		 * };
		 * 
		 * List<Entry<Character,Integer>> list=new
		 * ArrayList<Entry<Character,Integer>>(sort.entrySet());
		 * 
		 * Collections.sort(list, comp); System.out.println(list);
		 */

	}

}
