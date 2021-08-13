package pack;

import java.util.Comparator;
import java.util.TreeSet;

public class ComparatorLearn  {

	public static void main(String args[]) {
	TreeSet<Integer> t=new TreeSet<Integer>(new MyComp());
	t.add(4);
	t.add(5);
	t.add(2);
	t.add(6);
	t.add(6);
	
	
	System.out.println(t);
	
	}
}


/*class MyComparator implements Comparator<Object>
{

	@Override
	public int compare(Object o1, Object o2) {
		Integer i1=(Integer)o1;
		Integer i2=(Integer)o2;
		if(i1<i2)
		{
			return 1;
		}
		else if(i1>i2)
		{
			return -1;
		}
		return 0;
		
	}*/

	
	class MyComp implements Comparator<Object>
	{

		@Override
		public int compare(Object o1, Object o2) {
			Integer x=(Integer)o1;
			Integer y=(Integer)o2;
			return -x.compareTo(y);
		}
		
	}
	

