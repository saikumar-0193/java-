package LinkedList;
import java.util.Scanner;
class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class LinkedList2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node head = null; 
        Node tail = null;
        int n = sc.nextInt();
        System.out.println("add " + n + " elements");
        for(int i = 0; i < n; i++) {
            int value = sc.nextInt();
            Node newNode = new Node(value);
            if(head == null) {
                head = newNode;
                tail = newNode;
            }else {
                tail.next = newNode;
                tail = tail.next;
            }
        }
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + "  ");
            temp = temp.next;
        }
        System.out.print("null");


        System.out.println("the first elemnt is deleted");
        if(head != null) {
            head = head.next;
        }
        System.out.println();
        Node temp2 = head;
        while(temp2 != null) {
            System.out.print(temp2.data + " ");
            temp2 = temp2.next;
        }
         Node last = head;
         while(last.next.next != null) {
            last = last.next;
         }
         
         last.next = null;
         System.out.println();
         Node temp4 = head;
         while(temp4 != null) {
            System.out.print(temp4.data + " ");
            temp4 = temp4.next;
         }

        // Node prev = head;
        // while(prev != null && prev.next != null) {
        //     Node front = prev.next;
        //     int temp1 = prev.data;
        //     prev.data = front.data;
        //     front.data = temp1;
        //     prev = front.next;
        // }
        // Node temp3 = head;
        // while(temp3 != null) {
        //     System.out.print(temp3.data +  " ");
        //     temp3 = temp3.next;
        // }
    }
}
