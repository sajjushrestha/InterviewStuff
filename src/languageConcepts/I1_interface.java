package languageConcepts;

public interface I1_interface {
	
	// Two abstract methods 
		void printSomething();
	 
		void printAnything();
		
		default void met()
		{
			System.out.println("im inside interface");
		}

}
