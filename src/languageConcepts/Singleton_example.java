package languageConcepts;

public class Singleton_example {
	
	
	private static Singleton_example t=null;
	
	private Singleton_example()
	{
		System.out.println("Im a constructor");
	}
	
public static Singleton_example Test()
{
	if(t==null)
	{
		t=new Singleton_example();
		
	}
	
	return t;
}
	
	
	public static void main(String[] args) {
		
		
		System.out.println(t.Test().hashCode());
		System.out.println(t.Test().hashCode());
		

	}

}
