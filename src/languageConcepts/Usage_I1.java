package languageConcepts;


public class Usage_I1 {
	
	// Return type is I1 but returning an object of ImplementInterface1 which implements I1
	public static I1_interface someMethod1()
	{
		return new ImplementationClass();
	}
	
	// Return type is I1 but returning an object of ImplementInterface2 which implements I1
	public static I1_interface someMethod2()
	{
		return new ImplementationClass2();
	}
 
}
