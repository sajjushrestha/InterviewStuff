package languageConcepts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMap_SortByValues {

	public static void main(String[] args) {
		
		TreeMap<String,Integer> t=new TreeMap<String,Integer>();
		t.put("Python", 20);
        t.put("C++", 45);
        t.put("Java", 2);
        t.put("Unix", 67);
        t.put("Linux", 26);
        t.put("Perl", 93);
        
        Set<Entry<String, Integer>> set = t.entrySet();
        
        System.out.println("**********Sort by Keys in ASC order*******");
        
        for(Map.Entry<String, Integer> entry:set){
            System.out.println(entry.getKey()+" ==== "+entry.getValue());
        }
        
        List<Entry<String, Integer>> list = new ArrayList<Entry<String, Integer>>(set);
        
        Comparator<Entry<String, Integer>> sortValues=new Comparator<Entry<String, Integer>>()
        {
            public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2 )
            {
                return (o1.getValue()).compareTo(o2.getValue() );
            }
        } ;
        
        Comparator<Entry<String, Integer>> sortKeys=new Comparator<Entry<String, Integer>>()
        {
            public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2 )
            {
                return (o2.getKey()).compareTo(o1.getKey() );
            }
        } ;
        
        System.out.println("**********Sort by Values in ASC order*******");
        Collections.sort( list, sortValues);
        
		/*
		 * System.out.println("**********Sort by Keys in DESC order*******");
		 * Collections.sort( list, sortKeys);
		 */
        
        for(Map.Entry<String, Integer> entry:list){
            System.out.println(entry.getKey()+"  ====   "+entry.getValue());
        }
		
       
        

	}



}
