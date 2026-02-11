import java.util.*;

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        // Map to store next greater element for each number in nums2
        HashMap<Integer, Integer> map = new HashMap<>();
        
        // Stack to maintain decreasing order
        Stack<Integer> stack = new Stack<>();
        
        // Traverse nums2
        for (int num : nums2) {
            
            // If current number is greater than stack top
            while (!stack.isEmpty() && num > stack.peek()) {
                map.put(stack.pop(), num);
            }
            
            stack.push(num);
        }
        
        // For remaining elements, no greater element exists
        while (!stack.isEmpty()) {
            map.put(stack.pop(), -1);
        }
        
        // Prepare result for nums1
        int[] result = new int[nums1.length];
        
        for (int i = 0; i < nums1.length; i++) {
            result[i] = map.get(nums1[i]);
        }
        
        return result;
    }
}
