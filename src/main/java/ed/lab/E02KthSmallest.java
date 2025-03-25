package ed.lab;
import java.util.List;
import java.util.LinkedList;


public class E02KthSmallest {

    public int kthSmallest(TreeNode<Integer> root, int k) {
        if(root==null)
            return 0;

        return inorderTraversal(root).get(k-1);
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new LinkedList<>();
        if(root==null)
            return result;

        traverser(root, result);
        return result;
    }

    private void traverser(TreeNode<Integer> root, List<Integer> result) {
        if (root == null)
            return;

        traverser(root.left, result);
        result.add(root.value);
        traverser(root.right, result);
    }
}
