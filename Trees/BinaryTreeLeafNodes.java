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
public class BinaryTreeLeafNodes {
    static int max = Integer.MIN_VALUE;

    public static TreeNode buildTree(int[] arr) {
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


            if(i < arr.length && arr[i]!= -1) {
                current.right = new TreeNode(arr[i]);
                queue.offer(current.right);
            }
            i++;
        }
        return root;
    }

    public static  void preorder(TreeNode root) {
        if(root == null) return;

        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static int findMax(TreeNode root) {
        max = Integer.MIN_VALUE;
        if(root == null) return 0;
        maxPathSum(root);
        return max;
    }

    public static int maxPathSum(TreeNode root) {
      
        if(root == null) return 0;

        int leftSum = Math.max(0,maxPathSum(root.left));
        int rightSum = Math.max(0, maxPathSum(root.right));

        max = Math.max(max , root.data + leftSum + rightSum );


        return root.data + Math.max(leftSum, rightSum);
    }

    public static void main(String[] args) {
        int[] arr = {-10,9,20,-1,-1,15,7};

       TreeNode current =  buildTree(arr);
       System.out.println("preorder is :");
        preorder(current);
        System.out.print(findMax(current));
    }
}
