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
public class BinaryTree {


    public static List<Integer> findLargest(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if(root == null) return null;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()) {
            int levelSize = queue.size();
            int max = Integer.MIN_VALUE;
            for(int i = 0; i < levelSize; i++) {
            TreeNode current = queue.poll();
            max = Math.max(max, current.data);
                if(current.left != null) {
                    queue.offer(current.left);
                }
                if(current.right != null) {
                    queue.offer(current.right);
                }
            }
            result.add(max);
        }

        return result;
    }


   

    public static TreeNode buildTree(String[] arr) {
        TreeNode root = new TreeNode(Integer.parseInt(arr[0]));
        Queue<TreeNode> queue = new LinkedList<>();

        queue.offer(root);

        int i = 1;
        while(!queue.isEmpty() && i < arr.length) {
            TreeNode current = queue.poll();

            if(i < arr.length && !arr[i].trim().equals("null") ) {
                current.left = new TreeNode(Integer.parseInt(arr[i].trim()));
                queue.offer(current.left);
            }
            i++;

            if(i < arr.length && !arr[i].trim().equals("null")) {
                current.right = new TreeNode(Integer.parseInt(arr[i]));
                queue.offer(current.right);
            }
            i++;
        }
        return root;

    }


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String inputLine = s.nextLine();

        String[] values = inputLine.split(",");
        TreeNode root = buildTree(values);
       List<Integer> result =  findLargest(root);

       for(int num : result) {
        System.out.print(num + " ");
       }
    }
}
