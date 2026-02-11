import java.util.*;

class Solution {
    public int[] finalPrices(int[] prices) {
        
        int n = prices.length;
        int[] answer = Arrays.copyOf(prices, n);
        
        Stack<Integer> stack = new Stack<>(); // stores indexes
        
        for (int i = 0; i < n; i++) {
            
            // If current price is <= previous price
            while (!stack.isEmpty() && prices[i] <= prices[stack.peek()]) {
                int index = stack.pop();
                answer[index] = prices[index] - prices[i];
            }
            
            stack.push(i);
        }
        
        return answer;
    }
}
