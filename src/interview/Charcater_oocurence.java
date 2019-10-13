package interview;

public class Charcater_oocurence {

	public static void main(String[] args) {
		String s="111000011100000";
		
		
		String d=s.replaceAll("1", "");
		
		System.out.println(s.length()-d.length());
		
		
	}

}
