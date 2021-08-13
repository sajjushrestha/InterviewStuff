package sting;

import java.util.Scanner;

public class HackerRank_in_a_String {

	 private static final Scanner sc = new Scanner(System.in);
	 
	public static void main(String[] args) {
		
		
		int n=sc.nextInt();
		sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		String s = "";
		
		boolean flag=false;
		
		for(int i=0;i<n;i++)
		{
		s=sc.nextLine();
		
		 String result = hackerrankInString(s);
System.out.println(result);
		}
		
		
		sc.close();
	}
	
	static String hackerrankInString(String s) {
		String e="hackerrank";

		char[] ch=s.toCharArray();
	
		char[] eh=e.toCharArray();
	
		String temp="";
		
		int j=0,count=0;
		
		for(int i=0;i<ch.length;i++)
		{
			
			{
				
			if(eh[j]==ch[i])
			{
				
				temp=temp+" "+i;
				count++;
				j++;
				
				
			}
			}
		}
	
		
	System.out.println(count);
		
		
		return (count!=10)?"NO":"YES";
		
    }
	
	
	static void working()
	{

        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        
        char[] hr = "hackerrank".toCharArray();
        
        for(int a0 = 0; a0 < q; a0++){
            char[] test = in.next().toCharArray();
            int i = 0, j = 0;
            
            while (i < hr.length && j < test.length){
                if (hr[i] == test[j]){
                    i++;
                    j++;
                } else {
                    j++;
                }
            }
            if (i == hr.length) System.out.println("YES");
            else                System.out.println("NO");
        }
    
	}

}
