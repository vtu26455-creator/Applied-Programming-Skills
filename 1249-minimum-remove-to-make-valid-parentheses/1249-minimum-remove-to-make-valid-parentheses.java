import java.util.*;

class Solution {
    public String minRemoveToMakeValid(String s) {
        
        Stack<Integer> stack = new Stack<>();
        boolean[] remove = new boolean[s.length()];
        
        // First pass: identify invalid parentheses
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            if (ch == '(') {
                stack.push(i);
            } 
            else if (ch == ')') {
                if (!stack.isEmpty()) {
                    stack.pop(); // valid pair
                } else {
                    remove[i] = true; // invalid ')'
                }
            }
        }
        
        // Remaining '(' in stack are invalid
        while (!stack.isEmpty()) {
            remove[stack.pop()] = true;
        }
        
        // Build result string
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < s.length(); i++) {
            if (!remove[i]) {
                result.append(s.charAt(i));
            }
        }
        
        return result.toString();
    }
}
