package leetcode;

import java.util.Stack;

//https://www.programcreek.com/2012/12/leetcode-evaluate-reverse-polish-notation/
public class ReversePolishNotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s[]={"2", "1", "+", "3", "*"};
		//notation(s);
		System.out.println(evalRPN(s));
		
	}
	
	public static int evalRPN(String[] tokens) {
		 
        int returnValue = 0;
 
        String operators = "+-*/";
 
        Stack<String> stack = new Stack<String>();
 
        for(String t : tokens){
            if(!operators.contains(t)){
                stack.push(t);
            }else{
                int a = Integer.valueOf(stack.pop());
                int b = Integer.valueOf(stack.pop());
                int index = operators.indexOf(t);
                switch(index){
                    case 0:
                        stack.push(String.valueOf(a+b));
                        break;
                    case 1:
                        stack.push(String.valueOf(b-a));
                        break;
                    case 2:
                        stack.push(String.valueOf(a*b));
                        break;
                    case 3:
                        stack.push(String.valueOf(b/a));
                        break;
                }
            }
        }
 
        returnValue = Integer.valueOf(stack.pop());
 
        return returnValue;
 
    }
	public static void notation(String[] s)
	{
		Stack<String> st=new Stack<>();
		
		for(String ch:s)
		{
			if(Character.isDigit((ch.toCharArray())[0]))
			{
				st.push(ch);
			}
		}
		
		System.out.println(st);
		int sum = 0;
		
		for(String ch:s)
		{
			if(!Character.isDigit((ch.toCharArray())[0]))
			{
				sum=sum+Integer.parseInt(st.pop());
				
			}
		}
		
	}

}
