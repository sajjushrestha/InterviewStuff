package regExp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp1_Predefined_character_classes {
	
	/*
	 * Predefined character classes: 
	 * \s---------------------space character
	 * \d---------------------Any digit from o to 9[o-9] 
	 * \w---------------------Any word character[a-zA-Z0-9] 
	 * . ---------------------Any character including
	 * special characters.
	 */

	public static void main(String[] args) {
		Pattern p=Pattern.compile("\\w");
		Matcher m=p.matcher("a1b7@az#");
		while(m.find())
		{
		System.out.println(m.start()+"-------"+m.group());
		}
	}

}
