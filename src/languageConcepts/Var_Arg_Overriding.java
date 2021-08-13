package languageConcepts;

/**
 * 
 * 
 Overriding with respect to Var arg methods:
• A var arg method should be overridden with var-arg method only. If we are trying to
override with normal method then it will become overloading but not overriding. 

 *
 */


class Parent
{ 
public void methodOne(int... i)
{
System.out.println("parent class");
}
}
class Child extends Parent   //overloading but not overriding.
{
public void methodOne(int i)
{
System.out.println("child class");
}
}
class Var_Arg_Overriding
{
public static void main(String[] args)
{
Parent p=new Parent();
p.methodOne(10);//parent class
Child c=new Child();
c.methodOne(10);//child class
Parent p1=new Child();
p1.methodOne(10);//parent class
}
}

/*
• In the above program if we replace child class method with var arg then it will become
overriding. In this case the output is
Parent class
Child class
Child class 
*/

/**
Overriding with respect to variables:
• Overriding concept is not applicable for variables.
• Variable resolution is always takes care by compiler based on reference type. 

**/