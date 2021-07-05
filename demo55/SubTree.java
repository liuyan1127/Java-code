package data30;
//判断子树
public class SubTree {
    public boolean subTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null) {
            return false;
        }
        return p.val == q.val
                && subTree(p.left, q.left)
                && subTree(p.right, q.right);
    }
    public boolean search(TreeNode root, TreeNode t) {
        if (root == null) {
            return false;
        }

        if (root.val == t.val) {
            if (subTree(root, t)) {
                return true;
            }
        }
        /*if (subTree(root, t)) {
            return true;
        }*/
        if (search(root.left, t)) {
            return true;
        }
        return search(root.right, t);
    }

    public boolean isSubtree(TreeNode s, TreeNode t) {
        return search(s, t);
    }
}
