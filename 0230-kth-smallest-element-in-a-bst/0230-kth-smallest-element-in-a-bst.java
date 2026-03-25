class Solution {

    int count = 0;
    int result = 0;

    public int kthSmallest(TreeNode root, int k) {
        inorder(root, k);
        return result;
    }

    private void inorder(TreeNode node, int k) {
        if (node == null) return;

        // Left
        inorder(node.left, k);

        // Visit node
        count++;
        if (count == k) {
            result = node.val;
            return;
        }

        // Right
        inorder(node.right, k);
    }
}