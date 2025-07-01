package Trees;
import java.util.Scanner;
class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
    }
}
public class Bst {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Node root = null;
        while(true) {
            int val = sc.nextInt();

            if(val == -1) {
                break;
            }

           root =  insert(root,val);
        }
        inorder(root);

    }

    public static Node insert(Node root, int val) {
        if(root == null) return new Node(val);

        if(root.data > val) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }
        return root;
    }
        public static void inorder(Node root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

}
