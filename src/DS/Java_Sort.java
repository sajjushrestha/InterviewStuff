package DS;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Java_Sort implements Comparator<Java_Sort_StudentInfo>
{

	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		
		List<Java_Sort_StudentInfo> studentList = new ArrayList<Java_Sort_StudentInfo>();
		while(testCases>0){
			int id = in.nextInt();
			String fname = in.next();
			double cgpa = in.nextDouble();
			
			Java_Sort_StudentInfo st = new Java_Sort_StudentInfo(id, fname, cgpa);
			studentList.add(st);
			
			testCases--;
		}
		
		/*
		 * Collections.sort(studentList, Comparator.comparing(Java_Sort_StudentInfo ::
		 * getCgpa).reversed(). thenComparing(Java_Sort_StudentInfo ::
		 * getFname).thenComparing(Java_Sort_StudentInfo :: getId));
		 */
		 
		  
		 
      	for(Java_Sort_StudentInfo st: studentList){
			System.out.println(st.getFname());
		}

	}


	public int compare(Java_Sort_StudentInfo s1, Java_Sort_StudentInfo s2) {

	    if (s1.getCgpa() == s2.getCgpa()) {
	        if (s1.getFname().compareTo(s2.getFname()) == 0) {
	            return s1.getId() - s2.getId();
	        } else {
	            return s1.getFname().compareTo(s2.getFname());
	        }
	    } else if (s1.getCgpa()>s2.getCgpa())
	            { return -1; }
	        else return 1; 


	}

}
