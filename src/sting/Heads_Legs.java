package sting;


public class Heads_Legs {

	public static void main(String[] args) {

		int heads=200 , legs=540;
		System.out.println("Rabbits : "+countRabbits(heads,legs));
		System.out.println("Pigeons : "+(heads-countRabbits(heads,legs)));

	}
	
	static int countRabbits(int Heads,
            int Legs)
{
int count = 0;

count=Legs/2-Heads;
return count;
}
	 
	

	       
	   

}
