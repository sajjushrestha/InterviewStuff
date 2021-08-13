package pack;

public class SingletonCreation {

public static void main(String args[])
{
	System.out.println(Test.method().hashCode());
	System.out.println(Thread.currentThread().getPriority());
	SingletonCreation d=new SingletonCreation();

	}
	
 SingletonCreation()
{
	 System.out.println(Thread.currentThread().getPriority());
}
	
}

class Test
{
	
	private static Test t;
	
	private Test()
	{
		
	}
	
	public static Test method()        //By using class name if we are calling a method and that method returns the same class
											//object such type of method is called factory method. 
	{
		if(t==null)
		{
			t=new Test();
		}
		return t;
	}
	
	
}
