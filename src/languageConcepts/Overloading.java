package languageConcepts;


/**
 * 
 * 
 * In overloading method resolution is always based on reference type and runtime object
	won’t play any role in overloading. 
 * @author esparja
 *
 */

class Animal{}
class Monkey extends Animal{}
class Overloading
{
 public void methodOne(Animal a)
 {
 System.out.println("Animal version");
 }
 public void methodOne(Monkey m)
 {
 System.out.println("Monkey version");
 }
 public static void main(String[] args)
 {
	 Overloading t=new Overloading();
 Animal a=new Animal();
 t.methodOne(a);//Animal version
 Monkey m=new Monkey();
 t.methodOne(m);//Monkey version
 Animal a1=new Monkey();
 t.methodOne(a1);//Animal version
 }
}

