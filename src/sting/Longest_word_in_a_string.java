package sting;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Longest_word_in_a_string {

	public static void main(String[] args) {
		
		
		String s="India Global Services Private Limited Chennai TamilNadu";
		
		List<String> words=Arrays.asList(s.split(" "));
		
		System.out.println(words);
		
		int l=words.size();
		
		Iterator<String> itr=words.iterator();
		String longest="";
		int t=0;
		
		while(itr.hasNext())
		{
			String p=(String)itr.next();
	
			if(t<p.length())
			{
				t=p.length();
				longest=p;
				
			}
		
		}
		
		System.out.println("Longest word in given string "+s +" is : " + longest + " with length : "+t);

	}

}
