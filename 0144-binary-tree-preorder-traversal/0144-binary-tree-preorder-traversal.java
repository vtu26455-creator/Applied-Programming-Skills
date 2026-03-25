import java.util.*;

class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        preorder(root, result);
        return result;
    }

    public void preorder(TreeNode root, List<Integer> result) {
        if (root == null) return;

        result.add(root.val);         // root
        preorder(root.left, result);  // left
        preorder(root.right, result); // right
    }
}