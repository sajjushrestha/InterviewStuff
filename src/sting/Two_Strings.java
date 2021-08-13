package sting;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Two_Strings {
	
	
	public static void main(String[] args) throws Exception {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		testCase:
		for(int i = 0; i < N; i++) {
			String left = in.next();
			String right = in.next();
			boolean[] leftC = new boolean[26];
			for(int j = 0; j < left.length(); j++) {
				leftC[left.charAt(j) - 'a'] = true;
			}
			for(int k = 0; k < right.length(); k++) {
				if(leftC[right.charAt(k) - 'a']) {
					System.out.println("YES");
					continue testCase;
				}
			}
			System.out.println("NO");
		}
	}
	
	
}
