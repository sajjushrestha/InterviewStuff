package regExp;

import java.util.regex.Pattern;

public class RegExp3_Patternclasssplit_method {

	public static void main(String[] args) {
		Pattern p=Pattern.compile("\\s");
		String[] s=p.split("bhaskar software solutions");
		for(String s1:s)
		{
		System.out.println(s1);//bhaskar
		//software
		//solutions
		}
		
		
		Pattern p1=Pattern.compile("\\."); //(or)[.]
				String[] s11=p1.split("www.dugrajobs.com");
				for(String s1:s11)
				{
				System.out.println(s1);//www
				//dugrajobs
				//com
				}

	}

}
