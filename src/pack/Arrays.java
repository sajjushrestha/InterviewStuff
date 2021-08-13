package pack;


public class Arrays {
	
	static int count=0;
	 {
	 count++;
	 System.out.println(count);
	 }
	 Arrays()
	 {}
	 Arrays(int i)
	 {System.out.println(i);} 

	
	public static void main(String[] args) {	
		
		Arrays a=new Arrays(10);
		
		Runtime r1=Runtime.getRuntime();
		Runtime r2=Runtime.getRuntime();
		System.out.println(r1.equals(r2));
}
}

