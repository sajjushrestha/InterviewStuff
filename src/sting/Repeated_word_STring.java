package sting;

import java.util.HashSet;
import java.util.Set;

public class Repeated_word_STring {

	public static void main(String[] args) {

String s="She sells sea sells near the sea shore";
String[] sp=s.split(" ");

Set set=new HashSet();

for(String a:sp)
{
	if(set.add(a)!=true)
	{
		System.out.print(a+" ");
	}
}

	}

}
