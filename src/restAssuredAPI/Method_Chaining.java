package restAssuredAPI;



public class Method_Chaining {
	
	//return “this” as it always points to current object.
	
	public Method_Chaining M1()
	{
		System.out.println("M1");
		return this;
	}
	
	public Method_Chaining M2(String str)
	{
		System.out.println("Pass string is "+str);
		return this;
	}
	
	public Method_Chaining M3()
	{
		System.out.println("M3");
		return this;
	}
 
	public static void main(String[] args) {
		
		Method_Chaining nbp = new Method_Chaining();
		nbp.M1().M2("Sajju").M3();
	}

}
