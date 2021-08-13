package javaConcepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

class Animal{
	int x=999;
	
	 public void methodOne1()
	 {
	 System.out.println("Animal parent version");
	 }
}
class Monkey extends Animal{
	
	int x=888;
	
	public void methodOne1()
	 {
	 System.out.println("Animal child version");
	 }
}


public class Sorting {

	
	

	 public void methodOne(Animal a)
	 {
	 System.out.println("Animal version");
	 }
	 public void methodOne(Monkey m)
	 {
	 System.out.println("Monkey version");
	 }
	 public static void main(String[] args)
	 {
		 Sorting t=new Sorting();
		 
	 Animal a=new Animal();
	 t.methodOne(a);
	 Monkey m=new Monkey();
	 t.methodOne(m);
	 Animal a1=new Monkey();
	 t.methodOne(a1);
	 
	 a1.methodOne1();
	 
	System.out.println(a1.x);System.out.println(m.x);System.out.println(a.x);
	
	 
	 Parent p=new Parent();
	 p.methodOne();
	 
	 Parent g=new GrandChild();
	 g.methodOne();

	 }
}

class MyComparator  implements Comparator<Object>
{

	@Override
	public int compare(Object o1, Object o2) {
		
		Integer i1=(Integer)o1;
		Integer i2=(Integer)o2;
		
		
		return i1-i2;
	}
	
}


class Parent
{
 public void methodOne()
 {
	System.out.println("Parent method"); 
	 
 }
}
abstract class Child extends Parent
{
 public abstract void methodOne();
 
 void methodOnes()
 {
	 System.out.println("child methods");
 }
}

class GrandChild extends Child
{

	public void methodOne() {
		System.out.println("GrandChild method"); 
		
	}
	
}

