package edabit;

public class Change_Every_Letter_toNext {

	public static String move(String word) {
		
		String s=new String();
		char ch[]=word.toCharArray();
		
		for(char c:ch)
		{
			int i=c;
			
			char m=(char) (i+1);
			
			s=s.concat(m+"");
		}
		return s;

	}
	
	public static void main(String[] args) {
		
		System.out.println(move("sajju"));
		
	}

}
