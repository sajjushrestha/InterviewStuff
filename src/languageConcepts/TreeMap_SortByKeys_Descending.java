package languageConcepts;

import java.util.Collections;
import java.util.Comparator;
import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMap_SortByKeys_Descending {

	public static void main(String[] args) {
		
		TreeMap<String,Integer> t=new TreeMap<String,Integer>(Collections.reverseOrder());
		t.put("Python", 20);
        t.put("C++", 45);
        t.put("Java", 2);
        t.put("Unix", 67);
        t.put("Linux", 26);
        t.put("Perl", 93);
        
        System.out.println("********Sort By Key in Descending Order***********");
        
        for(Entry<String,Integer> entry:t.entrySet())
        {
        	System.out.println(entry.getKey() +" - "+entry.getValue());
        }
        
       
        

	}



}
