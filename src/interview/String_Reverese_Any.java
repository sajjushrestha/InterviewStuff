package interview;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
//Oracle 
public class String_Reverese_Any {

	public static void main(String[] args) {
		met("sajju");
		met(1234);
		
		Map<String,Integer> map=new HashMap<String,Integer>();
		map.put("a",1);
		map.put("b",2);
		map.put("aa",26);
		map.put("ab",27);
		
		Scanner sc=new Scanner(System.in);
		String input=sc.next();

		String[] input_split=input.split(",");

		for(String ch:input_split)
			System.out.println(map.get(ch));
		
		String_Reverese_Any a=new String_Reverese_Any();
		System.out.println(a.Add(1,2));

	}
	
	 public   int Add(int a, int b)
	 {
	  int c = a+b;
	  return c;
	 }
	
	public static void met(Object obj)
	{

	if(obj instanceof String)
	{
	String s=obj.toString();
	System.out.println(rev(s));
	}
	else if(obj instanceof Integer)
	{
	Integer i=(Integer)obj;
	String s=String.valueOf(i);
	System.out.println(rev(s));
	}
	}

	

	public static String rev(String s)
	{

	if(s.length()<=1)
		return s;

	return rev(s.substring(1))+s.charAt(0);

	}   

}
