package sting;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Weighted_Uniform_Strings {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String s = in.next();
		HashSet<Integer> hset = new HashSet<Integer>();
		int curctr = 0;
		hset.add(0);
		if (s.length() > 0) {
			curctr = s.charAt(0) - 96;
			hset.add(curctr);

			for (int i = 1; i < s.length(); i++) {
				if (s.charAt(i) == s.charAt(i - 1)) {
					curctr += s.charAt(i) - 96;
					hset.add(curctr);
				} else {
					curctr = s.charAt(i) - 96;
					hset.add(curctr);
				}

			}

		} else
			hset.add(0);
		int n = in.nextInt();
		for (int a0 = 0; a0 < n; a0++) {
			int x = in.nextInt();
			// your code goes here
			if (hset.contains(x))
				System.out.println("Yes");
			else
				System.out.println("No");
		}

	}

	static void mySolution()
	{

		Scanner sc = new Scanner(System.in);
		String s = sc.next();

		int v = sc.nextInt();
		int[] a = new int[v];

		for (int i = 0; i < v; i++) {
			a[i] = sc.nextInt();
		}
		
		List<Integer> list = new ArrayList<>();
		Map<Character, Integer> n = new HashMap<>();

		for (char i : s.toCharArray())
			if (n.containsKey(i))
				n.put(i, n.get(i) + 1);
			else
				n.put(i, 1);

		for (Map.Entry<Character, Integer> entry : n.entrySet()) {
			for (int i = 1; i <= entry.getValue(); i++) {
				int val = entry.getKey() - 96;
				list.add(val * i);
			}
		}

		for (int i = 0; i < v; i++) {
			if (list.contains(a[i])) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}

	}

}
