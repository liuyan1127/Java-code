package data30;

public class NotSameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }

        if (p == null || q == null) {
            return false;
        }
        boolean isRootValueEquals = p.val == q.val;
        if (isRootValueEquals == false) {
            return false;
        }
        boolean isLeftSubTreeSame = isSameTree(p.left, q.left);
        if (isLeftSubTreeSame == false) {
            return false;
        }
        boolean isRightSubTreeSame = isSameTree(p.right, q.right);
        return isRootValueEquals
                && isLeftSubTreeSame
                && isRightSubTreeSame;
    }

    public static void main(String[] args) {
        TreeNode p = BuildTree.buildTree2();
        TreeNode q = BuildTree.buildTree2();

        NotSameTree ret = new NotSameTree();
        System.out.println(ret.isSameTree(p, q));
    }

}
