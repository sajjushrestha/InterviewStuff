package languageConcepts;

public class WideningvsAutoboxing {public static void methodOne(long l)
{
System.out.println("widening");
}
public static void methodOne(Integer i)
{
System.out.println("autoboxing");
}
public static void main(String[] args)
{
int x=10;
methodOne(x);
}}
/**
Widening: Converting a lower data type into a higher data type is called widening
Widening dominates Autoboxing. 
**/