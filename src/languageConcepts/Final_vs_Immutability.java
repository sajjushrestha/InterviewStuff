package languageConcepts;

public class Final_vs_Immutability {

	public static void main(String[] args) {
		final StringBuffer sb=new StringBuffer("bhaskar");
		 sb.append("software");
		 System.out.println(sb);//bhaskarsoftware
		// sb=new StringBuffer("solutions");//C.E: cannot assign a value to final variable  sb

	}

}

/**
 * 
 * 
 * Final vs immutability:
• If we declare a variable as final then we can’t perform reassignment for that variable. It
doesn’t mean in the corresponding object we can’t perform any changes. That is
through final keyword we won’t get any immutability that is final and immutability
concepts are different. 

• In the above example even though “sb” is final we can perform any type of change in
the corresponding object. That is through final keyword we are not getting any
immutability nature. 


**/