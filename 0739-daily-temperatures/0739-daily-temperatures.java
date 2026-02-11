import java.util.*;

class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        
        int n = temperatures.length;
        int[] answer = new int[n];
        
        Stack<Integer> stack = new Stack<>(); // stores indexes
        
        for (int i = 0; i < n; i++) {
            
            // If current temperature is warmer than stack top index temperature
            while (!stack.isEmpty() && 
                   temperatures[i] > temperatures[stack.peek()]) {
                
                int prevIndex = stack.pop();
                answer[prevIndex] = i - prevIndex;
            }
            
            stack.push(i);
        }
        
        return answer;
    }
}
