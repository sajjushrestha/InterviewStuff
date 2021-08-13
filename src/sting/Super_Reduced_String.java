package sting;

import java.util.Scanner;

public class Super_Reduced_String {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    String input = sc.next();
    sc.close();
    outer:
    while (true) {
    	
        for (int x = 0; x < input.length() - 1; x++) 
        {
            if (input.charAt(x) == input.charAt(x + 1)) 
            {
                input = input.substring(0, x) + input.substring(x + 2, input.length());
                continue outer;
            }
        }
        break;
    }
    System.out.println(input.equals("") ? "Empty String" : input);}

}
