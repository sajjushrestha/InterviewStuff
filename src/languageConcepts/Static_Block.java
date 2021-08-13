package languageConcepts;

import java.util.ArrayList;

public class Static_Block {
	
	/*Static block gets executed every time when the class loads into memory not every time an object is created.
	 * 
	 * Instance blocks are different. Unlike static blocks, they execute every time you create an object for a class.
	 * 
	 * 
	 */
	
	
	 static int i; 
	    int j;
	    
	    
	    //Static block
	    static 
	    { 
	        i = 10; 
	        System.out.println("static block called "); 
	    } 
	    
	    //Constructor
	    Static_Block(){ 
	        System.out.println("Constructor called"); 
	    } 
	    
	    
	    //Instance Block
	    {
	    	System.out.println("Instnace block called"); 
	    }

	public static void main(String[] args) {
		Static_Block s=new Static_Block();
		Static_Block s1=new Static_Block();
		
		
		//Double brace initialization is using the instance blocks in the anonymous inner classes as done in the previous program
		 ArrayList<String> as=new ArrayList<String>(){
	            {
	            add("Foo");
	            add("Bar");
	            }
	        };
	        
	        System.out.println(as);
	}

}
