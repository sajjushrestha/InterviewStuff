package sting;

public class Count_occurrences_of_a_character_in_a_repeated_string {

	public static void main(String[] args) {
		
		int n=10;
		String s="aba",t="";
		
		for(int i=1;i<=n;i++)
		{
			t=s+t;
		}

		System.out.println(t.substring(0,n).length()-t.substring(0,n).replace("a", "").length());
		
		

	}

}
