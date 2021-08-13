package regExp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp2_Quantifiers {
	
	/*
	 * Quantifiers: · Quantifiers can be used to specify no of characters to match.
	 * a-----------------------Exactly one ‘a’ 
	 * a+----------------------At least one‘a’ 
	 * a*----------------------Any no of a’s including zero number 
	 * a? ----------------------At most one ‘a’
	 */
	public static void main(String[] args) {
		Pattern p=Pattern.compile("a");
		Matcher m=p.matcher("abaabaaaba");
		while(m.find())
		{
		System.out.println(m.start()+"-------"+m.group());
		}

	}

}
