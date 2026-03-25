class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // both null → same
        if (p == null && q == null) return true;

        // one null → not same
        if (p == null || q == null) return false;

        // values different → not same
        if (p.val != q.val) return false;

        // check left and right
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}