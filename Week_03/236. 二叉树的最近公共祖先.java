/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
 //递归+ 判断是不是公共祖先
class Solution {
    private TreeNode result = null;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        dfs(root, p, q);
        return result;
    }
    private boolean dfs(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null) {
            return false;
        }
        boolean leftson = dfs(root.left, p, q);
        boolean rightson = dfs(root.right, p, q);
        if((leftson && rightson) || ((root.val == p.val || root.val == q.val) && (leftson ||rightson)))
        {
            result = root;
        }
        return leftson || rightson || (root.val == p.val || root.val == q.val);

    }
}