package ed.lab;

import java.util.LinkedList;
import java.util.List;

public class E01InvertBT {
    public TreeNode<Integer> invertTree(TreeNode<Integer> root) {
        if(root==null)
            return null;

        TreeNode<Integer> left = root.left;
        TreeNode<Integer> right = root.right;
        root.left = invertTree(left);
        root.right = invertTree(right);
        root.left = right;
        root.right = left;

        return root;
    }
}
