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
public void recurssion()
{
	System.out.println(reverseRecursion("Sajju"));
}



public String reverseRecursion(String s)
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
		

}
