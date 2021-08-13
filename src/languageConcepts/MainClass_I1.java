package languageConcepts;

	
public class MainClass_I1 {
	
	
	public static void main(String[] args)
	{
		// Same reference type but different implementation is called
		I1_interface ref1 = Usage_I1.someMethod1();
		ref1.printSomething();
		ref1.printAnything();
		
		
		I1_interface ref2 = Usage_I1.someMethod2();
		ref2.printSomething();
		ref2.printAnything();
	}
 
}