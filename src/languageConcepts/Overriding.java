package languageConcepts;

public class Overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}


/**
Parent class final methods we can’t override in the Child class. 
Child.java:8: methodOne() in Child cannot override methodOne() in Parent; overridden method
is final 


Parent class non final methods we can override as final in child class. We can override
native methods in the child classes.

• We should override Parent class abstract methods in Child classes to provide
implementation. 

• We can override Parent class non abstract method as abstract to stop availability of
Parent class method implementation to the Child classes. 

Diagram:
• While overriding we can’t reduce the scope of access modifier. 




**/