package sting;

public class Remove_duplicates {

	public static void main(String[] args) {
		
	String s="sajju is a goodgood good boy good";
	int n=s.length();
	System.out.println(n);
	
	System.out.println(s.lastIndexOf(""));
	
	String f="good";
	s=s.replaceAll("good", "");
	System.out.println((n-s.length())/f.length());
		
		
		

	}

}
