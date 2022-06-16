package interview;

//Asked in Oraclec
public class String_Rotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			rot("ABCDE");
	}
	
	  public static void rot(String s)
	    {
		  int i=0; 
		  String rev=s.charAt(s.length()-1)+s.substring(0,s.length()-1);   
		  
	      while(i<s.length())
	      {	
	    	  System.out.println(rev); 
	       rev=rev.charAt(rev.length()-1)+rev.substring(0,rev.length()-1);    
	        
	      
	      i++;
	      }
	    }

}
