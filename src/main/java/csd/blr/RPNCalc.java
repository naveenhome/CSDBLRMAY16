package csd.blr;

import java.util.Stack;

public class RPNCalc {

	public int calculate(String expr) throws Exception {
		// TODO Auto-generated method stub
		if (expr.length()<=0)
			throw new Exception("Expr is empty.");
		
		String[] arr = expr.split(",");
		Stack<String> rpnStack = new Stack<String>();
		for(int i=0; i<arr.length;i++)
		{
			if(arr[i].equals("+"))
			{
				String value = String.valueOf(Integer.valueOf(rpnStack.pop())+Integer.valueOf(rpnStack.pop()));
				rpnStack.push(value);
			}
			else if(arr[i].equals("+"))
			{
				String value = String.valueOf(Integer.valueOf(rpnStack.pop())-Integer.valueOf(rpnStack.pop()));
				rpnStack.push(value);
			}
			else if(arr[i].equals("+"))
			{
				String value = String.valueOf(Integer.valueOf(rpnStack.pop())*Integer.valueOf(rpnStack.pop()));
				rpnStack.push(value);
			}
			else if(arr[i].equals("+"))
			{
				String value = String.valueOf(Integer.valueOf(rpnStack.pop())/100);
				rpnStack.push(value);
			}
			else
			{
				rpnStack.push(arr[i]);
			}
		}
		return Integer.valueOf(rpnStack.pop());
	}

}
