package languageConcepts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList_Comparator {

	public static void main(String args[])
	{
		List<Student> l=new ArrayList<Student>();
		l.add(new Student("Sajju",121));
		l.add(new Student("Cheri",47));
		l.add(new Student("Anoop",48));
		l.add(new Student("Vamsi",119));
		
		System.out.println("******Name Sorting**********");
		Collections.sort(l,Student.name_Sorting);
		
		for(Student s:l )
		System.out.println(s);
		
		System.out.println("******Age Sorting**********");
		Collections.sort(l,Student.age_Sorting);
		
		for(Student s:l )
		System.out.println(s);
		
	}

}
