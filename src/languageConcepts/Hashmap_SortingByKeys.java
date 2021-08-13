package languageConcepts;


import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Hashmap_SortingByKeys {

	public static void main(String[] args) {
		
		Map<String,Integer> m=new HashMap<String, Integer>();
		m.put("Sajju", 101);
		m.put("Cheri", 48);
		m.put("Naji", 102);
		m.put("Zeera", 120);
		
		/*
		 * Set<Entry<String, Integer>> set=m.entrySet(); Iterator<Entry<String,
		 * Integer>> itr=set.iterator(); while(itr.hasNext()) { Map.Entry<String,
		 * Integer> entry = itr.next(); System.out.println(entry.getKey() ); }
		 */
		System.out.println("*******Before Keys Sorting****************");
		  for(Map.Entry<String, Integer> entry:m.entrySet()) {
		  System.out.println(entry.getKey() +" - "+entry.getValue()); }
		 

		
		
		System.out.println("*******After Keys Sorting in Ascending order****************");
		Map<String, Integer> t=new TreeMap<String, Integer>(m);
		for(Map.Entry<String, Integer> entry:t.entrySet()) {
			  System.out.println(entry.getKey() +" - "+entry.getValue()); }
	}

	

}

class MyComparator implements Comparator<Object>
{

	public int compare(Object o1, Object o2) {
		
		String a=(String)o1;
		String b=(String)o2;
		
		return b.compareTo(a);
	}
	
}
