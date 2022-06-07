package sting;

public class String_Swap {

	public static void main(String[] args) {
		
		String a="sajju";
		String b="shrestha";
		
		int n=a.length();
		int m=b.length();
		
		a=a+b;
		
		int l=a.length();
		
		b=a.substring(0, n);
		a=a.substring(n,l);
		
		System.out.println(a);
		System.out.println(b);
				

	}

}
