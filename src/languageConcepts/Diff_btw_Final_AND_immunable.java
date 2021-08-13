package languageConcepts;

public class Diff_btw_Final_AND_immunable {

	public static void main(String[] args) {

		 final StringBuffer sb=new StringBuffer("bhaskar");
		 sb.append("software");
		 System.out.println(sb);//bhaskarsoftware
		// sb=new StringBuffer("solutions");//C.E: can

	}

}
/*
 * In the above example even though “sb” is final we can perform any type of
 * change in the corresponding object. That is through final keyword we are not
 * getting any immutability nature.
 */