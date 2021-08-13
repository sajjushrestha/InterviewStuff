package sting;

public class Min_num_times_A_to_be_repeated_SuchThat_B_is_substring_of_it {

	public static void main(String[] args) {
		
		String a="abcda";
		String b="cdab";
		int count=1;
	
		while(!a.contains(b))
		{
			a=new String(new char[count]).replace("\0", a);
			System.out.println("in do loop : "+ a);
			
			count++;
			System.out.println("count is "+count);
		}
		
		
        System.out.println(a);
		System.out.println(count-1);
	}

}
