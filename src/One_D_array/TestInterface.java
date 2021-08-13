package One_D_array;

public interface TestInterface {

	
	public static void staticMethod(){
		System.out.println("this is from StaticMethod....");
	}
	public default void defaultMethod(){
		System.out.println("this is from defalut method...");
	}
	public void abstractMethod();
	
}
