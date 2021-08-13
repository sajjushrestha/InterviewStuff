package languageConcepts;


 final class Immutable_Example2
 {
  private int i;
  
  Immutable_Example2(int i)
  {
  this.i=i;
  }
  
  public Immutable_Example2 modify(int i)
  {
  if(this.i==i)
  return this;
  else
  return (new Immutable_Example2(i));
  }
  
  
  public static void main(String[] args)
  {
	  Immutable_Example2 c1=new Immutable_Example2(10);
	  Immutable_Example2 c2=c1.modify(100);
	  Immutable_Example2 c3=c1.modify(10);
	  
	  
  System.out.println(c1==c2);//false
  System.out.println(c1==c3);//true
  Immutable_Example2 c4=c1.modify(100);
  System.out.println(c2==c4);//false
  }
 }