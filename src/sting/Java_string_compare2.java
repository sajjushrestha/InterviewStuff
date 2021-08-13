package sting;

import java.util.Scanner;

public class Java_string_compare2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        int k = scanner.nextInt();
        String minSubstring = line.substring(0,k);
        String maxSubstring = line.substring(0,k);
        
        for (int i = 1; i < line.length()-k+1; i++) {
            String sub = line.substring(i,i+k);
            if (sub.compareTo(minSubstring) < 0) {
                minSubstring = sub;
            }
            if (sub.compareTo(maxSubstring) > 0) {
                maxSubstring = sub;
            }
        }
        System.out.println(minSubstring);
        System.out.println(maxSubstring);
		
		
		/*
		 * 
		 * String s="welcometojava"; int k=3; List<String> l=new ArrayList<String>();
		 * 
		 * StringBuffer sb=new StringBuffer(); for(int i=0;i<s.length()-1;i++) { int
		 * start=i; int end=Math.min(i+k-1, s.length()-1);
		 * 
		 * while(start<end) { String ss=s.substring(start, end+1);
		 * 
		 * l.add(ss); start++; end--; }
		 * 
		 * 
		 * 
		 * } System.out.println(l);
		 * 
		 * for(int i=0;i<l.size();i++) { for(int j=i+1;j<l.size();j++) {
		 * if(l.get(i).compareTo(l.get(j))<0) { System.out.println(l.get(j)); } } }
		 * 
		 */}

}
