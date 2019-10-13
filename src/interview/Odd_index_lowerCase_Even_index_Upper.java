package interview;

public class Odd_index_lowerCase_Even_index_Upper {

	public static void main(String[] args) {
		  
		  String s="Sajju is a good boy";
		  
		  char[] c=s.toCharArray(); 
		  StringBuffer sb=new StringBuffer();
		  
		  int n=c.length;
		  
		  for(int i=0;i<n;i++) { 
			  char temp = c[i]; 
			  if(i%2==0)
			  {
		  temp=Character.toLowerCase(c[i]); 
		  } 
			  else 
			  { 
				  temp=Character.toUpperCase(c[i]);
		  }
		  
		  sb.append(temp); } System.out.println(sb);
		  

	}

}
