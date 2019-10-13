package interview;

public class Reverse_each_word_in_string {

	public static void main(String[] args) {
		String s="java is a programming language";
		String[] sp=s.split(" ");
		int n=sp.length;
		
		String rev="";
		for(int i=0;i<n;i++)
		{
			String d = "";
			for(int j=sp[i].length()-1;j>=0;j--)
			{
				
				d=d+sp[i].charAt(j);
				
			}
			rev=rev+d+" ";
		}
		
		System.out.println(rev);
	}

}
