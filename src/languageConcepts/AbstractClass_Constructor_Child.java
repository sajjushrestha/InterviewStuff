package languageConcepts;

public class AbstractClass_Constructor_Child extends AbstractClass_Constructor{

	AbstractClass_Constructor_Child() {
		super(5);
		
	}

	public static void main(String[] args) {
		
		AbstractClass_Constructor_Child c=new AbstractClass_Constructor_Child();
		

	}

}
/**
When we can't create object of abstract class then why java allow defining a constructor in its body?

Its true that abstract classes cannot be instantiated, but since they are classes they surely allow creation of constructors. The reason behind this might be that :

Those abstract classes which have constructors defined need their subclasses to invoke them.

Suppose we have an abstract class

abstract class A{
	private int num;
}
Now the member “num” of this class is private i.e. even its subclasses can’t use or modify it. But what if you want to initialize it to a value other than zero? I know we could simply initialize it at time of declaration, but this practice is generally not encouraged. We should initialize members inside constructor.

One way is to provide getter and setter. But if we only want to initialize it once, best way to do it would be by providing a constructor. Example :

abstract class A{
	private int num;
	A(int num){
		this.num = num; 	
	}
}
Now this constructor must be invoked inside the constructor of subclass (or else it would fail to compile!). Example :

class B extends A{
	B(){
		super(5);
	}
}
Whenever an object of B is created, it would always invoke the super class’ constructor, no matter what.

I hope the reason behind providing constructors inside abstract classes should be clear by now. Would be more than happy to clear any more doubts.
**/