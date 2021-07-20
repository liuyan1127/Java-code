package data32;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class TreeNode {
    char val;
    TreeNode left = null;
    TreeNode right = null;

    TreeNode(char val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return String.format("TreeNode{%c}", val);
    }
}

public class Main {
    /***
     * 构建二叉树
     * @param in 传入的带空结点的前序遍历序列
     * @param out 是一个空的 list
     * @return 构建的一棵二叉树的根
     */
    public static TreeNode buildTree(List<Character> in, List<Character> out) {
        if (in.isEmpty()) {
            // 没有序列，只能是空树
            // out 仍然是空的
            return null;
        }

        // in 不是 Empty 的了
        char rootVal = in.remove(0);
        if (rootVal == '#') {
            out.addAll(in);
            return null;
        }
        TreeNode root = new TreeNode(rootVal);
        List<Character> rightOut = new ArrayList<>();
        TreeNode left = buildTree(in, rightOut);
        TreeNode right = buildTree(rightOut, out);

        root.left = left;
        root.right = right;

        return root;
    }

    public static List<Character> stringToListChar(String s) {
        List<Character> list = new ArrayList<>();
        char[] chars = s.toCharArray();
        for (char ch : chars) {
            list.add(ch);
        }

        return list;
    }

    public static void inOrder(TreeNode root) {
        if (root != null) {
            inOrder(root.left);
            System.out.printf("%c ", root.val);
            inOrder(root.right);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        List<Character> in = stringToListChar(s);
        ArrayList<Character> out = new ArrayList<>();
        TreeNode root = buildTree(in, out);
        inOrder(root);
    }
}
