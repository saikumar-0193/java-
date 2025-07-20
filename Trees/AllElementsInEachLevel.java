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
public class AllElementsInEachLevel {

    public static TreeNode buildTree(int[] arr) {
        TreeNode root = new TreeNode(arr[0]);
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        int i = 1;
        while(!q.isEmpty() && i < arr.length) {
            TreeNode current = q.poll();
             if(i < arr.length) {
                current.left = new TreeNode(arr[i]);
                q.offer(current.left);
             }
             i++;

             if(i < arr.length) {
                current.right = new TreeNode(arr[i]);
                q.offer(current.right);
             }
             i++;
        }
        return root;

    }
    //input section
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] arr = {7,4,3,5,6,33,4};
        TreeNode root = buildTree(arr);
        System.out.println("preorder is " );
        preorder(root);
        System.out.println();
        List<List<Integer>> result= new ArrayList<>();
        findAllElements(root, result);
        for(List<Integer> nums : result) {
            System.out.print(nums + " ");
        }
    }
    public static void preorder(TreeNode root) {
        if(root == null) return;

        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
       

    }

    public static List<List<Integer>> findAllElements(TreeNode root, List<List<Integer>> result) {
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        
        while(!q.isEmpty()) {
            int levelSize = q.size();
            List<Integer> sub = new ArrayList<>();
            for(int i = 0; i < levelSize; i++) {
                TreeNode current = q.poll();
                sub.add(current.data);
                 if(current.left != null) {
                q.offer(current.left);
            } 
            if(current.right != null) {
                q.offer(current.right);
            }
            }
           
            result.add(sub);
        }
        return result;
    }

}