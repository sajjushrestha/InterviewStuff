package languageConcepts;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedLists {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		LinkedList<String> l=new LinkedList<String>();
		l.add("A");
		l.add("B");
		l.add("C");
		l.add("D");
		
		l.addFirst("First");
		l.addLast("Last");
		
		l.push("push");
		
		System.out.println(l);
		
		l.pop();
		l.peek();
		
		Iterator<String> itr=l.descendingIterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		LinkedList<String> l2=new LinkedList<String>();
		l2=(LinkedList<String>) l.clone();
		
		System.out.println(l2);
		
		String[] array=l.toArray(new String[l.size()]);
		for (int i = 0; i < array.length; i++)
	    {
	       System.out.println(array[i]);
	    }
	}

}
