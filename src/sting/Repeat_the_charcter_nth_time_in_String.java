package sting;

public class Repeat_the_charcter_nth_time_in_String {

	public static void main(String[] args) {
		Thread.currentThread().setPriority(6);
		System.out.println(Thread.currentThread().getPriority());

String s="sajju";

for(char c:s.toCharArray())
{

	for(int i=0;i<(s.indexOf(c)+1);i++)
	{
		System.out.print(c);
	}
}
	}

}
