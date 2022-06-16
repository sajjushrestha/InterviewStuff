package pack;



public class Reverse_A_String {
	
	
	
//@Test
public void reverse()
{
	
String s="Sajju";
char[] ch=s.toCharArray();
String rev="";

for(int i=s.length()-1;i>=0;i--)
{
	rev=rev+ch[i];
}
	
System.out.println(rev);
	
}
	
//@Test
public static void main(String[] args)
{
	System.out.println(reverseRecursion("Sajju"));
	System.out.println(reverseRecursion2("Sajju"));
}



public static String reverseRecursion(String s)
{

	if(s.length()==1)
	{
		return s;
	}
	else
	{
		return s.charAt(s.length()-1)+reverseRecursion(s.substring(0,s.length()-1));
	}
	
}
	
public static String reverseRecursion2(String s)
{

	if(s.length()==1)
	{
		return s;
	}
	else
	{
		return reverseRecursion2(s.substring(1))+s.charAt(0);
	}
	
}

}
