package sting;

import java.util.Comparator;

public class ComparatorClass implements Comparator
{

	@Override
	public int compare(Object obj1, Object obj2) {
		
		Integer i1=(Integer)(obj1);
		Integer i2=(Integer)(obj2);
		
		return i1-i2;
		
	}

}
