package Trees;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    TreeNode(int data) {
        this.data = data;
    }
}
public class RangeSumBST {

    public static int rangeSum(TreeNode root, int low, int high) {
        return helper(root, low, high);
    }

    public static int helper(TreeNode root, int low, int high) {
        if(root == null) return 0;
        int sum = 0;
        if(root.data >= low && root.data <= high) {
            sum += root.data;
        }
        sum += helper(root.left, low, high);
        sum += helper(root.right, low, high);

        return sum;
    }


    public static List<Integer> levelOrder(TreeNode root) {
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
    //trees

    public static TreeNode buildTree(String[] arr) {
        if(arr.length == 0 || arr[0].equals("null")) return null;
        TreeNode root = new TreeNode(Integer.parseInt(arr[0]));
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int i = 1;

        while(i < arr.length && !queue.isEmpty()) {
            TreeNode current = queue.poll();

            if(i < arr.length && !arr[i].trim().equals("null")) {
                current.left = new TreeNode(Integer.parseInt(arr[i]));
                queue.offer(current.left);
            }
            i++;

            if( i < arr.length && !arr[i].trim().equals("null")) {
                current.right = new TreeNode(Integer.parseInt(arr[i]));
                queue.offer(current.right);
            }
            i++;
        }
        return root;


    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        String[] arr = str.split(",");

        TreeNode root = buildTree(arr);
        List<Integer> finalList = levelOrder(root);
        System.out.println("Level Order Traveral is");
        for(int num : finalList) 
        {
            System.out.print(num + " ");
        }
        System.out.println("enter low and high");
        int low = s.nextInt();
        int high = s.nextInt();
        System.out.println("Range sum is ");
        System.out.println(rangeSum(root, low, high));
    }
}
