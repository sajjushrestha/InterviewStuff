package languageConcepts;

public class Infinity_NaN_Float {

	public static void main(String[] args) {
		int x=10;
		 System.out.println(x>Float.NaN);//false
		 System.out.println(x<Float.NaN);//false
		 System.out.println(x>=Float.NaN);//false
		 System.out.println(x<=Float.NaN);//false
		 System.out.println(x==Float.NaN);//false 
		 
		 System.out.println(x!=Float.NaN);//true
		 System.out.println(Float.NaN!=Float.NaN);//true 
		 
		 System.out.println(10/0.0);//+Infinity
		 System.out.println(-10/0.0);//-Infinity
		 
		 System.out.println(0/0.0);//Nan
		 System.out.println(-0/0.0);//NaN
		 
		 System.out.println(0.0/0);//Nan
		 System.out.println(-0.0/0);//NaN

		 System.out.println(~5);//5
		 
		 int i=1;
		 i+=++i + i++ + ++i + i++ + ++i + i++ + ++i + i++;
		 System.out.println(i);//13Analysis: 

	}

}
