package xjava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MiComparator {

	public static void main(String[] args) {

List<String> list=new ArrayList<>();
list.add("sajju");
list.add("Sajju");
list.add("sAjju");
list.add("sajjU");

Collections.sort(list);

System.out.println(list);
System.out.println(list.indexOf("sajju"));
Collections.sort(list,new ComparatorMi());

System.out.println(list.indexOf("sajju"));
System.out.println(Collections.binarySearch(list, "sajju"));
	
int[] a={10,5,20,11,6};
Arrays.sort(a);
System.out.println(Arrays.binarySearch(a,6));//1
System.out.println(Arrays.binarySearch(a,14));//-5
	}

}


class ComparatorMi implements Comparator
{

	@Override
	public int compare(Object o1, Object o2) {
		String s1=o1.toString();
		String s2=(String)o2;
		
		
		return -s1.compareTo(s2);
	}
	
}