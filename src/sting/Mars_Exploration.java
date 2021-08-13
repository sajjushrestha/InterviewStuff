package sting;

public class Mars_Exploration {

	public static void main(String[] args) {
		
		
		String s="SOSOSOSOSDSDSKWOSDOSDOASDOASDFAFJDFDOSOSOWNSOSOSNDSKDDOSOSOSJDSDSOOSOSDSDOSASSOASDSAOSOSODSDSOASDWS";
		
		int count=0;
		for(int i=0;i<s.length();i=i+3) {
			
		String d=s.substring(i,i+3);
		
		if(d.charAt(0)!='S')
		{
			count++;
		}
		if(d.charAt(1)!='O')
		{
			count++;
		}
		
		if(d.charAt(2)!='S')
		{
			count++;
		}
		}
		
		System.out.println(count);
	}

}
