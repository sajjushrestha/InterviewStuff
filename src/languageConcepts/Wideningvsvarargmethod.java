package languageConcepts;

public class Wideningvsvarargmethod {

	public static void methodOne(long l)
	 {
	 System.out.println("widening");
	 }
	 public static void methodOne(int... i)
	 {
	 System.out.println("var-arg method");
	 }
	 public static void main(String[] args)
	 {
	 int x=10;
	 methodOne(x);
	 } 



}
/**
 * Widening dominates var-arg method.
 * 
 * Autoboxing dominates var-arg method.
 * 
• In general var-arg method will get least priority. That is if no other method matched
then only var-arg method will get chance. It is exactly same as “default” case inside a
switch
 * 
 * 
 */

