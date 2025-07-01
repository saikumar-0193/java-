package Trees;
import java.util.Scanner;
// class Node {
//     int data;
//     Node left;
//     Node right;
//      Node(int data) {
//         this.data = data;
//     }
// }
// public class ordering {
//     static Scanner sc = new Scanner(System.in);
//     static Node CreateTree() {
//         System.out.println("enter the value");
//         int val = sc.nextInt();
//         if(val == -1) return null;

//         Node newNode = new Node(val);
//         System.out.println("enter the left node for the value" + val);
//         newNode.left = CreateTree();
//         System.out.println("enter the right value for the node " + val);
//         newNode.right = CreateTree();
//         return newNode;
//     }
//     static void inOrder(Node root) {
//         if(root == null) return;
//         inOrder(root.left);
//         System.out.print(root.data + " ");
//         inOrder(root.right);
//     }

//     public static void main(String[] args) {
//         Node result = CreateTree();
//         inOrder(result);
//     }
// }
class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
    }
}
public class ordering{

    static Scanner sc = new Scanner(System.in);
    public static Node createTree() {
        System.out.println("Enter the value");
        int val = sc.nextInt();
        if(val == -1) return null;
        Node newNode = new Node(val);
  
        if(newNode.data > val) {
            newNode.left = createTree();
        }
        if(newNode.data < val) {
            newNode.right = createTree();
        }
        
        return newNode;
    }

    public static void inorder(Node root) {
        if(root == null) return;
        System.out.print(root.data + " ");
        inorder(root.left);
        inorder(root.right);
    }
    public  static int findHeight(Node root) {
        if(root == null) return 0;
        return 1 + Math.max(findHeight(root.left), findHeight(root.right));
    }
    public static void main(String[] args) {
        Node result = createTree();
        inorder(result);
        System.out.println();
        System.out.println(findHeight(result));
        
    }
}
