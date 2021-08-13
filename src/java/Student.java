package java;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import javax.swing.plaf.basic.BasicBorders.RolloverButtonBorder;

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


public String toString()
{
	
	
	
	return "name is "+name +" age is "+age ;
	
}



}
