package languageConcepts;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ConncurrentModificationException {

	public static void main(String[] args) {
	
		List<Integer> l=new ArrayList<Integer>();
		l.add(1);
		l.add(2);
		l.add(3);
	
		Iterator itr=l.iterator();
		while(itr.hasNext())
		{
			String z=(String) itr.next();
			if(itr.next()==(Integer)1) {
				itr.remove();
			}
			
			
		}

	}

}
