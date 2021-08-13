package edabit;

import java.util.Scanner;

public class CommonFactor {
	static long gcd(long a, long b)
	{
		if (a == 0) 
			return b;
		
		return gcd(b%a,a);
	}
	static long commDiv(long a,long b)
	{
		long n = gcd(a, b);
	
		long result = 0;
		for (int i=1; i<=Math.sqrt(n); i++)
		{
			if (n%i==0)
			{
				if (n/i == i)
					result += 1;
				else
					result += 2;
			}
		}
		return result;
	}

    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        long a=sc.nextLong();
        long b=sc.nextLong();
        System.out.println(commDiv(a, b));
    }

}
