package data30;
//二叉树的最大深度，高度
//平衡二叉树
public class BalanceTree {
    public int getHeight(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(getHeight(root.left), getHeight(root.right)) + 1;
    }

    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);
        int differ = leftHeight - rightHeight;
        if (!(differ == -1 || differ == 0 || differ == 1)) {
            return false;
        }
        return isBalanced(root.left) && isBalanced(root.right);
    }
}

