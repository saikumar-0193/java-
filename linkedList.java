public class linkedList {
    public static void main(String[] args) {
        linkedList list = new linkedList();
        list.insertFirst(20);
        list.insertFirst(43);
        list.insertFirst(45);
        
        list.insertLast(100);
        list.insertFirst(30);
        list.deleteFirst();
        list.display();

    }

    private Node head;
     private Node tail;

     private int size;

        public linkedList(){
            this.size = 0;

        }

    private class Node {

        private int value;
        private Node next;


        public Node(int value){
            this.value = value;
        }
        public Node(int value,Node next){
            this.value = value;
            this.next = next;
        }

    }
    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;

        if(tail == null){
            tail = head;
        }
        size += 1;
    }
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value +" -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }
    public void insertLast(int val){
        if(tail == null){
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }
    public void insert(int val, int index){
        if(head == null){
            insertFirst(val);
            return;
        }
        if(index == size){
            insertLast(val);
            return;
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        Node node = new Node(val,temp.next);
        temp.next = node;
        size++;

    }

    public int deleteFirst(){
        int val = head.value;
        head = head.next;

        if(head == null){
            tail = null;
        }
        size--;
        return val;
    }

}
