package interview;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Remove_duplicates_from_string {

	public static void main(String[] args) {
		
		
		String s="sajjushrestha";
		int n=s.length();
		char c[]=s.toCharArray();
		StringBuilder sb = new StringBuilder(); 
		
		for(int i=0;i<n;i++)
		{
			/*
			 * if(s.indexOf(c[i])!=s.lastIndexOf(c[i])) {
			 * 
			 * s=s.replaceAll(String.valueOf(c[i]), ""); }
			 */
			
			if(s.indexOf(c[i])==s.lastIndexOf(c[i]))
			{
				sb.append(c[i]);
				
			}
			
		}
System.out.println("To remove duplicates and print non repated charcaters = "+sb);
//System.out.println(s);

Set set=new HashSet();
StringBuffer sbf=new StringBuffer();

for(int j=0;j<c.length;j++)
if(!set.contains(c[j]))
{
	set.add(c[j]);
	sbf.append(c[j]);
}

System.out.println("To remove duplicates from String = "+sbf);


		//**************************************************************************************************.//
		  //String st="sajju shrestha";
		  
		  LinkedHashSet<Character> lhs = new LinkedHashSet<Character>();
		  
		  for(int i=0;i<s.length();i++) { lhs.add(s.charAt(i)); }
		  
		  for(Character ch : lhs) System.out.print(ch);
		 

		
		
		
		/*
		 * String str="sajju is a good boy"; StringBuilder sbc = new StringBuilder();
		 * int idx; for (int i = 0; i < str.length(); i++) { char cc = str.charAt(i);
		 * 
		 * System.out.println("ch is "+ cc +" "+str.indexOf(cc, i +1));
		 * 
		 * idx = str.indexOf(cc, i + 1);
		 * 
		 * 
		 * if (idx == -1) { sbc.append(cc); } }
		 * 
		 * System.out.println(sbc);
		 */
		 
		 
		 
		/*
		 * String s1="this is index of example"; //passing substring int
		 * index1=s1.indexOf("is");//returns the index of is substring int
		 * index2=s1.indexOf("index");//returns the index of index substring
		 * System.out.println(index1+"  "+index2);//2 8
		 * 
		 * //passing substring with from index int index3=s1.indexOf("ex",13);//returns
		 * the index of is substring after 4th index System.out.println(index3);//5 i.e.
		 * the index of another is
		 * 
		 * //passing char value int index4=s1.indexOf('s');//returns the index of s char
		 * value System.out.println(index4);//3
		 */	}

}
