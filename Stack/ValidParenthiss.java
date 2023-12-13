package Stack;

import java.util.*;

public class ValidParenthiss {

    public static boolean isValid(String s)
    {
        char[] c = s.toCharArray();
        Stack<Character> stk = new Stack<>();

        for(char ch: c)
        {
            
            if(ch=='(' || ch=='{' || ch=='[')
            {
                stk.push(ch);
                continue;
            }

            else if (stk.isEmpty()) return false;

            else if(ch==')' || ch=='}' || ch==']')
            {
                char top = stk.pop();
                if(top==')' && ch!='(') return false;
                
                else if(top==']' && ch!='[') return false;

                else if(top=='}' && ch!='{') return false;
            }
        }

        if(stk.empty()) return true;

        else return false;
    }
    

    public static void main(String[] args) {
        
        String str = "([]{}[]";

        System.out.print("Does this string contain valid parenthesis ? ");
        System.out.print(isValid(str));
    }
}