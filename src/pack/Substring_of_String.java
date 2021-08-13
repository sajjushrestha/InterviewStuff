package pack;



public class Substring_of_String {
	
//
public void substring() 
{
String s="abbc";	
int l=s.length();


for(int i=0;i<l;i++)
{
for(int j=i+1;j<=l;j++)
{
System.out.println(s.substring(i, j));	
	
}	
	
}
	
	
}

}
