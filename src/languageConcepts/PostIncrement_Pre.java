package languageConcepts;

import java.lang.reflect.Method;

public class PostIncrement_Pre {

	public static void main(String[] args) {
		
		
		postIncrement(10,0);
		preIncrement(10,0);
		postDecrement(10,0);
		preDecrement(10,0);
		
		int z=10;
		System.out.println(z++*5);
		
		/*
		 * Method[] methods=PostIncrement_Pre.class.getMethods(); for (Method method :
		 * methods) {
		 * 
		 * String MethodName = method.getName();
		 * System.out.println("Name of the method: " + MethodName);
		
        }  */
	}
	
	
	public static void postIncrement(int x,int y)
	{
		String method=new Throwable().getStackTrace()[0].getMethodName();
		System.out.println(method);
		y=x++;System.out.println("x : "+x +" -- y : "+y);
		 
	}
	
	public static void preIncrement(int x,int y)
	{
		String method=new Throwable().getStackTrace()[0].getMethodName();
		System.out.println(method);
		
		y=++x;System.out.println("x : "+x +" -- y : "+y);
		 
	}
	
	public static void postDecrement(int x,int y)
	{
		String method=new Throwable().getStackTrace()[0].getMethodName();
		System.out.println(method);
		y=x--;System.out.println("x : "+x +"  -- y : "+y);
		 
	}
	
	public static void preDecrement(int x,int y)
	{
		String method=new Throwable().getStackTrace()[0].getMethodName();
		System.out.println(method);
		y=--x;System.out.println("x : "+x +"  -- y : "+y);
		 
	}

}
