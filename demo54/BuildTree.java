package data30;

public class BuildTree {
    public static TreeNode buildTree2() {
        TreeNode a = new TreeNode('A');
        TreeNode b = new TreeNode('B');
        TreeNode c = new TreeNode('C');
        TreeNode d = new TreeNode('D');
        TreeNode e = new TreeNode('E');
        TreeNode f = new TreeNode('F');

        a.left = b;
        a.right = c;
        b.left = d;
        c.left = e;
        c.right = f;

        return a;
    }
}
