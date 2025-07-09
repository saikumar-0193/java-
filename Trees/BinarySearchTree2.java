package Trees;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    TreeNode(int data) {
        this.data = data;
    }
}
public class BinarySearchTree2 {

    public static TreeNode insert(TreeNode root,int val) {
       if(root == null) return new TreeNode(val);

       if(root.data < val) {
          root.right = insert(root.right, val);
       }

       if(root.data > val) {
        root.left = insert(root.left, val);
       }

       return root;
    }

    public static TreeNode buildBST(int[] arr) {
        TreeNode root = null;
        for(int num : arr) {
           root =  insert(root, num);
        }
        return root;
    }

    public static List<Integer> print(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();

        queue.offer(root);
        while(!queue.isEmpty()) {
            TreeNode current = queue.poll();
            result.add(current.data);

            if(current.left != null) {
                queue.offer(current.left);
            }

            if(current.right != null) {
                queue.offer(current.right);
            }

        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {10,30,5,2,55};
        TreeNode root = buildBST(arr);

        List<Integer> result = print(root);
        for(int num : result) {
            System.out.print(num + " ");
        }

    }
}
