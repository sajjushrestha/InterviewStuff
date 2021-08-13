package pack;


public class Anagrams {

	public static void main(String[] args) {
		
		String a="Father-in-law";
		String b="Hilter fanaw";
		
		String aa=a.toLowerCase().replaceAll("[^a-z]", "").replace("\\s", "");
		String bb=b.toLowerCase().replaceAll("[^a-z]", "").replace("\\s", "");
		
		System.out.println(aa.toCharArray());
		System.out.println(bb.toCharArray());
		boolean status=true;
		
		if(aa.length()!=bb.length())
		{
			status=false;
		}
		else
		{
			    char[] ArrayS1 = aa.toLowerCase().toCharArray();  
	            char[] ArrayS2 = bb.toLowerCase().toCharArray();  
	            java.util.Arrays.sort(ArrayS1);  
	            java.util.Arrays.sort(ArrayS2);
	            
	            status= java.util.Arrays.equals(ArrayS1, ArrayS2);
	            
		}
		
	if(status)
	{
		System.out.println("Both are Anagrams");
	}
	else
	{
		System.out.println("Both are not Anagrams");
	}
		
	}

}
