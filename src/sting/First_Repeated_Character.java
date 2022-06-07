
package sting;

public class First_Repeated_Character {

	public static void main(String[] args) {
		
		
		String s="horizon tutorials";
		String rep="";
		int count=0;
		int j=0;
		char[] ch=s.toCharArray();
		
		for(int i=0;i<ch.length;i++)
		{
			if(!rep.contains(Character.toString(ch[i])))
			{
				rep+=rep.concat(Character.toString(ch[i]));
			}
			else
			{
				count++;
				j=i;
				break;
			}
		}
		
		if(count>0)
		{
			System.out.println(s.charAt(j));
		}
		if(count==0)
		{
			System.out.println("No repeating character found");
		}

		
		
	}

}
