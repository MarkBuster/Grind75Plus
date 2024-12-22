import java.util.Stack;

public class ValidParetheses {

    Stack<Character> stack = new Stack<>();
    
    public boolean isValid(String s) {
        // if s is empty
        if (s.length() == 0) {
            return true;
        }
        // if s.length is odd
        if (s.length() % 2 != 0) {
            return false;
        }

        //traverse chars checking for matches        
        for (int i = 0; i < s.length(); i++) {
            char bracket = s.charAt(i);
            if (bracket == '(' || bracket == '[' || bracket == '{') {
                stack.push(bracket);
            } else {
                // If closing bracket and stack is empty, invalid
                if (stack.isEmpty()) {
                    return false;
                }
                // Check if current closing bracket matches the last opening bracket
                if (!isMatch(bracket)) {
                    return false;
                }
                // If they match, pop the opening bracket
                stack.pop();
            }
        }
        
        // After processing all brackets, stack should be empty if valid
        return stack.isEmpty();
    }
    
    private boolean isMatch(char closingBracket) {
        char openBracket = stack.peek();
        return (openBracket == '(' && closingBracket == ')') ||
               (openBracket == '[' && closingBracket == ']') ||
               (openBracket == '{' && closingBracket == '}');
    }
}

