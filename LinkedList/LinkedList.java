package LinkedList;

 class LinkedList {
  
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static Node head;
    public static void DeleteAtIndex(int index){
        if(index == 1){
            head = head.next;
            return;
        } 
        Node temp = head;
        int count = 1;
        while(temp != null && count < index - 1){
            temp = temp.next;
            count++;
        }
        temp.next = temp.next.next;
    }
    public static void addAtPosition(int data, int index){
        Node newNode = new Node(data);
        if(head == null){
            newNode = head;
            return;
        }
        Node temp = head;
        int count = 1;
        while(temp != null && count < index - 1){
            temp = temp .next;
            count++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        
    }

    public static void DeleteLast(){
        if(head == null){
            System.out.println("list is empty");
            return;
        }
        if(head.next == null){
            head = null;
            return;
        }
        Node current = head;
        while(current.next.next != null){
            current = current.next;
        }
        current.next = null;
    }

    public static void DeleteFirst(){
        if(head == null){
            return;
        }
        head = head.next;
    }
    public static void addFirst(int data){
        Node newNode = new Node(data);
        while(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
        
    }
    public static void add(int data){

        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            return;
        }

        Node current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = newNode;
    }
    public static void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        add(10);
        add(20);
        addFirst(5);
        addFirst(7);
        add(30);
        DeleteAtIndex(3);
        addAtPosition(111,3);
    //     DeleteFirst();
    //    DeleteLast();

        display();
        
    }
 }


