package interview;

public class LowerCaseToUpper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		conversion("abcXYZ");

	}
	
	public static void conversion(String s)
	{
		StringBuffer sb=new StringBuffer();
		char[] ch=s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
		if(ch[i]>=97 && ch[i]<=122)
		{
			sb.append((ch[i]+"").toUpperCase());
		}
		else
		{
			sb.append((ch[i]+"").toLowerCase());
		}
		}
		
		System.out.println(sb);
	}

}
