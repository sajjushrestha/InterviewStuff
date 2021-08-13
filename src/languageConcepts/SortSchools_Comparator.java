package languageConcepts;

import java.util.Comparator;

 
   class SortSchools implements Comparator<SortSchools_Comparator> {
		 

	public static void main(String[] args) {
		SortSchools_Comparator sch1 = new SortSchools_Comparator("sch1", 20);
		SortSchools_Comparator sch2 = new SortSchools_Comparator("sch2", 15);
	SortSchools sortSch = new SortSchools();
	int retval = sortSch.compare(sch1, sch2);
	switch(retval) {
	case -1: {
	System.out.println("The " + sch2.getName() + " is bigger!");
	break;
	}
	case 1: {
	System.out.println("The " + sch1.getName() + " is bigger!");
	break;
	}
	default:
	System.out.println("The two schools are of the same size!");
	}
	}

	public int compare(SortSchools_Comparator sch1, SortSchools_Comparator sch2) {
	if(sch1.getNumOfStudents()== sch2.getNumOfStudents())
	return 0;
	else
	return sch1.getNumOfStudents() > sch2.getNumOfStudents() ? 1 : -1;
	}
	

	
}
  
  
  class SortSchools_Comparator {
		
		private int num_of_students;
		private String name;
		public  SortSchools_Comparator(String name, int num_of_students) {
		this.name = name;
		this.num_of_students = num_of_students;
		}
		public int getNumOfStudents() {
		return this.num_of_students;
		}
		public String getName() {
		return this.name;
		}
		}
