package Trees;
import java.util.LinkedList;
import java.util.Queue;


class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    TreeNode(int data) {
        this.data = data;
    }
}


public class BinaryTreePathSum {

    public static TreeNode buildTree(int[] arr) {
        if(arr.length == 0) return null;
        TreeNode root = new TreeNode(arr[0]);
        Queue<TreeNode> queue = new LinkedList<>();

        queue.offer(root);

        int i = 1;
        while(i < arr.length) {
            TreeNode current = queue.poll();

            if(i < arr.length && arr[i] != -1) {
                current.left = new TreeNode(arr[i]);
                queue.offer(current.left);
            }
            i++;
            if(i < arr.length && arr[i] != -1) {
                current.right = new TreeNode(arr[i]);
                queue.offer(current.right);
            }
            i++;

        }
        return root;
    }
    public static int maxPathSum(TreeNode root) {
         maxPathSum1 = Integer.MIN_VALUE;
        if(root == null) return 0;

        int leftMax = Math.max(0, maxPathSum(root.left));
        int rightMax = Math.max(0, maxPathSum(root.right));

        maxPathSum1 = Math.max(maxPathSum1, root.data + leftMax + rightMax);

        return root.data + Math.max(leftMax, rightMax);
    }


    public static void preOrder(TreeNode root) {
        if(root == null) return;

        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void main(String[] args) {
        int[] arr = {-10, 9, 20, -1,-1, 15, 7};
        TreeNode root = buildTree(arr);
        preOrder(root);
        System.out.println();
        System.out.println(maxPathSum(root));
    }
    static int maxPathSum1 = Integer.MIN_VALUE;
}
