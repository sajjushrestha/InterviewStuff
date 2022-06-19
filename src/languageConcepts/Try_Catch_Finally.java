package languageConcepts;

public class Try_Catch_Finally {

	/*
	 * If return statement present try catch and finally blocks then finally block
	 * return statement will be considered.
	 */
	
	public static void main(String[] args) {
		System.out.println(methodOne());
	}
	public static int methodOne(){
	try
	{
	System.out.println(10/0);
	return 777;
	}
	catch(ArithmeticException e)
	{
		
	return 888;
	}
	finally{
		return 999;
	}

	}

}
