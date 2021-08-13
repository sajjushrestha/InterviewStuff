package DS;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapClass {

	public static void main(String[] args) {
		
		HashMap<String,String> map=new HashMap<String,String>();
		map.put("India", "New Delhi");
		map.put("Nepal", "Kathmandu");
		map.put("Bhutan", "Timpu");
		map.put("China", "Beijing");
		
	//using keySet
		for(String countryKey:map.keySet())
		{
			System.out.println("Country is "+countryKey + " Capital is "+map.get(countryKey));
		}
		
	//using EntrySet
		for(Entry<String,String> entry:map.entrySet())
		{
			System.out.println("country "+entry.getKey() +" capital is "+entry.getValue());
		}
		
		Iterator<String> itr=map.keySet().iterator();
		while(itr.hasNext())
		{
			String country=itr.next();
			System.out.println(country +" "+ map.get(country));
		}
	}

}
