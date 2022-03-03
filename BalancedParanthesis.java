package algss;

import java.util.Stack;

public class BalancedParanthesis {

	
	public boolean balancedParanthesis(String exp) {
		
		Stack<Character> st = new Stack<Character>();
		
		for(int i=0;i<exp.length();i++) {
			char c = exp.charAt(i);
			
			if(c=='{' || c=='(' || c=='[') {
				st.push(c);
			}
			else if(c=='}' || c==')' || c==']' ) {
				if(!st.empty() && ( (c=='}' && st.peek()=='{') || (c==')' && st.peek()=='(') || (c==']' && st.peek()=='[') )) {
					st.pop();
				}
				else {
					st.push(c);
				}
			}
			
		}
		
		if(st.empty()) {
			return true;
		}
		else {
			return false;
		}
	}
	public static void main(String[] args) {
		BalancedParanthesis obj = new BalancedParanthesis();
		System.out.println(obj.balancedParanthesis("{()(){[]}}"));// {  ()   ()   {  []  }    }  = true
		System.out.println(obj.balancedParanthesis("{(}()[]"));//    {  (}   ()  []              = false
		System.out.println(obj.balancedParanthesis("{(){}[(])}"));// {   ()   {}  [(  ]) }       =false
		System.out.println(obj.balancedParanthesis("{}()[]("));//    {}  ()  []  (				=false	
	}
}

