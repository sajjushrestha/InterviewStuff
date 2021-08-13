package javaConcepts;

import java.util.TreeSet;

final class MyImmutableClass {
	
	final  String name;
	final  int id;
	
	
	
	MyImmutableClass(String name,int id)
	{
		this.name=name;
		this.id=id;
	}
	
	public String getName()
	{
		return name;
	}
	public int getId()
	{
		return id;
	}

	public static void main(String[] args) {
		
		MyImmutableClass m=new MyImmutableClass("Sajju",101);
		System.out.println(m.getName());
		System.out.println(m.getId());
		
		Integer i=Integer.valueOf("1000",3);
		System.out.println(i);
		
		
		
				
			

	}

}
