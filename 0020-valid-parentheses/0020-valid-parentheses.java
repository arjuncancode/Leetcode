class Solution {
    public boolean isValid(String s) {

        return findValidParenthesis(s);   
    }

    public boolean findValidParenthesis(String s)
    {
        Stack<Character> stack = new Stack<>();

        for(char ch : s.toCharArray())
        {
            
            if(ch == '(' || ch == '[' || ch == '{')
            {
                stack.push(ch);
            }
            else if(ch == ')' || ch ==']' || ch == '}')
            {
                if(stack.isEmpty())
                {
                    return false;
                }
        
        char previous = stack.peek();
              if(ch == ')' && previous == '(')
              {
                stack.pop();
              }
              else if(ch ==']' && previous =='[')
              {
                 stack.pop();
              }
               else if(ch =='}' && previous =='{')
              {
                 stack.pop();
              }
               else
               {
                    return false;
               } 
            }
        }
        return stack.isEmpty();
        
    }
}