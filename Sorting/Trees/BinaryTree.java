

package Sorting.Trees;


public class BinaryTree {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        tree.root = new Node(7);
        Node n1 = new Node(8);
        Node n2 = new Node(1);
        Node n3 = new Node(9);
        Node n4 = new Node(2);
        Node n5 = new Node(3);

        tree.root.left = n1;
       tree. root.right = n2;
        n1.left = n3;
        n2.right = n4;
        n3.left = n5;

        System.out.println("tree initiated");

    }
    private Node root;
    private static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
        }


    }
}
