package pack;

import java.util.Scanner;

public class RemoveDuplicatesinaString {

	public static void main(String[] args) {
		
		  Scanner sc=new Scanner(System.in);
		  
		  String s="sajju";
		  String nw=""; 
		  char c[]=s.toCharArray();
		  
		  for(int i=0;i<c.length;i++) 
		  { 
			  char ch =s.charAt(i); 
			  if(ch!=' ') 
			  { 
				  nw=nw+ch;
		          s=s.replace(ch, ' ');
		  } 
			  }
		  
		  System.out.println("First ="+nw);
		 

//************************************************************************************************************//

StringBuffer sbu=new StringBuffer();
int idx;
String x=sc.next();
char[] ci=x.toCharArray();
for(int i=0;i<ci.length;i++)
{
	idx=x.indexOf(ci[i], i+1);
	
	if(idx==-1)
	{
		sbu.append(ci[i]);
	}
	
}

System.out.println("Second = "+sbu);

	}

}
