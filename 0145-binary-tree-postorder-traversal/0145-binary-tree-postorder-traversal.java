import java.util.*;

class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        postorder(root, result);
        return result;
    }

    public void postorder(TreeNode root, List<Integer> result) {
        if (root == null) return;

        postorder(root.left, result);   // left
        postorder(root.right, result);  // right
        result.add(root.val);           // root
    }
}