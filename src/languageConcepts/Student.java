package languageConcepts;


import java.util.Comparator;



public class Student {
	
private int age;
private String name;

public Student(String name,int age) {
	this.name=name;
	this.age=age;
	
}

public void setName(String name)
{
	this.name=name;
}

public void setAge(int age)
{
	this.age=age;
}

public String getName()
{
	return name;
	
}

public int getAge()
{
	return age;
}



public static Comparator<Student> age_Sorting=new Comparator<Student>()
{

	public int compare(Student o1, Student o2) {
		
		int age1=o1.getAge();
		int age2=o2.getAge();
		
		return age1-age2;
	}
	
};

public static Comparator<Student> name_Sorting=new Comparator<Student>()
{

	public int compare(Student o1, Student o2) {
		
		String name1=o1.getName();
		String name2=o2.getName();
		
		return name1.compareTo(name2);
	}
	
};


public String toString()
{
	
	
	
	return "name is "+name +" age is "+age ;
	
}



}
