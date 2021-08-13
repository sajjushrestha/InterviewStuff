package regExp;

import java.util.StringTokenizer;

public class StringTokenizerEg {

	public static void main(String[] args) {
		StringTokenizer st=new StringTokenizer("durga software solutions");
	while(st.hasMoreTokens())
	{
	System.out.println(st.nextToken());//durga
	//software
	//solutions
	}
	
	
	StringTokenizer st1=new StringTokenizer("1,99,988",",");
	while(st1.hasMoreTokens())
	{
	System.out.println(st1.nextToken());//1
	//99
	//988
	}
	}
}


//The default regular expression for the StringTokenizer is space.