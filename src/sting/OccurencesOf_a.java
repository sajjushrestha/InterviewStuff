package sting;

import java.util.Scanner;

public class OccurencesOf_a {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
        String s = in.next();
        long n = in.nextLong();
        int len = s.length();
        long ans = 0;
        long as = 0;
        
        for(int i = 0; i < len; i++){
            if(s.charAt(i) == 'a'){
                as++;
            }
        }
        
        ans += n / len * as;
        
        for(int i = 0; i < n % len; i++){
            if(s.charAt(i) == 'a'){
                ans++;
            }
        }
        
        System.out.println(ans);
		
		
		
		/*
		 * 
		 * @SuppressWarnings("resource") Scanner scanner = new Scanner(System.in);
		 * String s = scanner.nextLine();
		 * 
		 * long k = scanner.nextLong();
		 * scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		 * 
		 * String repeated = new String(new char[(int) k]).replace("\0", s);
		 * 
		 * System.out.println(repeated.substring(0, (int)
		 * k).replaceAll("[^a]","").length());
		 * 
		 * 
		 * 
		 */}

}
