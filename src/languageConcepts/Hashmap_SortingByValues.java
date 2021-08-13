package languageConcepts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Hashmap_SortingByValues {

	public static void main(String[] args) {
		

        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("java", 20);
        map.put("C++", 45);
        map.put("Java2Novice", 2);
        map.put("Unix", 67);
        map.put("MAC", 26);
        map.put("Why this kolavari", 93);
        
        Set<Entry<String, Integer>> set = map.entrySet();
        
        List<Entry<String, Integer>> list = new ArrayList<Entry<String, Integer>>(set);
        
        Comparator<Entry<String, Integer>> sort=new Comparator<Entry<String, Integer>>()
        {
            public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2 )
            {
                return (o1.getValue()).compareTo(o2.getValue() );
            }
        } ;
        
        Collections.sort( list, sort);
        
        for(Map.Entry<String, Integer> entry:list){
            System.out.println(entry.getKey()+" ==== "+entry.getValue());
        }
		
	}
}
