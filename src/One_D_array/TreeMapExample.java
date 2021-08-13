package One_D_array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {


		TreeMap<String,Integer> t=new TreeMap<String,Integer>();
        t.put("c", 102);
        t.put("b", 101);
        t.put("a", 103);
        
        System.out.println("Without Sorting");
        System.out.println(t);
        
        List<Entry<String,Integer>> l=new ArrayList<Entry<String,Integer>>(t.entrySet());
        
        Collections.sort(l, new Comp());
        System.out.println("With Sorting by values");
        System.out.println(l);
	}

}


class Comp implements Comparator<Entry<String,Integer>>
{

	@Override
	public int compare(Entry<String,Integer> e1, Entry<String,Integer> e2) {
		Integer i1=e1.getValue();
		Integer i2=e2.getValue();
		
		return i1.compareTo(i2);
		
	}


	
}
