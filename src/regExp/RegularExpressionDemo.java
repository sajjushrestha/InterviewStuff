package regExp;

import java.util.StringJoiner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionDemo {

	public static void main(String[] args) 
	{
		String s="#bhaskar";
		
		Pattern p=Pattern.compile("[a-zA-Z][a-zA-Z0-9-#]+"); 
		Pattern p11=Pattern.compile("[a-zA-Z][a-zA-Z0-9-#][a-zA-Z0-9-#]*");
		Matcher m=p.matcher(s);
		if(m.find() && m.group().equals(s))
		{
		System.out.println("valid identifier");
		}
		else
		{
		System.out.println("invalid identifier");
		}
		
		//#################################################################3
		String num="9989575334";
		
		//Pattern p1=Pattern.compile("[7-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]");
		Pattern p1=Pattern.compile("[7-9][0-9]{9}");
		Matcher m1=p1.matcher(num);
		if(m1.find()&& m1.group().equals(num))
		{
			//System.out.println(m1.group());
		System.out.println("valid number");
		}
		else
		{
		System.out.println("invalid number");
		}
		
		//############################################################
		String email="1sajindra.prasad@gmail.com";
		Pattern p3=Pattern.compile("[a-zA-Z0-9][a-zA-Z0-9-.]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+");
		Matcher m3=p3.matcher(email);
		if(m3.find()&&m3.group().equals(email))
		{
		System.out.println("valid mail id");
		}
		else
		{
			System.out.println("invalid mail id");
		}
		
		
        StringBuilder sb=new StringBuilder();
		StringBuilder maprOozieRole = new StringBuilder().append("\\").append("\\").append("du");

		System.out.println(maprOozieRole);
		
		StringBuilder v=maprOozieRole;
		
		System.out.println(v.toString());
		
		
}


	

}
