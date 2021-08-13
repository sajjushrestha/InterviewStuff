package comparable_Comparator_Programs;

import java.util.Comparator;

public class Author implements Comparable<Author>

{
String firstName;
String lastName;
int age;

Author(String firstName,String lastName,int age)
{
	this.firstName=firstName;
	this.lastName=lastName;
	this.age=age;
}
	
	
public String getFirstName() {
	return firstName;
}


public void setFirstName(String firstName) {
	this.firstName = firstName;
}


public String getLastName() {
	return lastName;
}


public void setLastName(String lastName) {
	this.lastName = lastName;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

	
	public int compareTo(Author au) {
		
		 return this.firstName.compareTo(au.firstName);
	}

}

class AuthorAgeComparator implements Comparator<Author>
{
	   public int compare(Author a1,Author a2){
	     if(a1.age==a2.age)
	       return 0;
	   else if(a1.age>a2.age)
	       return 1;
	   else
	       return -1;
	  }
	}


class LastNameComparator implements Comparator<Author>
{ 
	  public int compare(Author a1,Author a2){   
	     return a1.lastName.compareTo(a2.lastName); 
	  }  
	}