package javaConcepts;

public class StaticKeyword {
	
	int x=10;
	static int y=20;
	 
	 public static void main(String[] args)
	 {
		 StaticKeyword t1=new StaticKeyword();
	 t1.x=888;
	 t1.y=999;
	 
	 StaticKeyword t2=new StaticKeyword();
	 
	 System.out.println(t2.x+"----"+t2.y);//10----999
	 } 

}
