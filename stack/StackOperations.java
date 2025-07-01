package stack;
import java.util.Scanner;
import java.util.Stack;
public class StackOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        System.out.print("Enter your choice ");

        while(sc.hasNext()) {

        
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
            System.out.println("Enter element to push ");
            int element = sc.nextInt();
            stack.push(element);
            System.out.println("Element pushed in to the stack ");
            break;


            case 2:
            if(!stack.isEmpty()) {
                System.out.println("The element popped is " + stack.pop());
            } else {
                System.out.println("the stack is empty");
            }
            break;

            case 3:
            System.out.println("stack elements " + stack);
            break;

            default:
            System.out.println("WRONG CHOICE");
        }

        
    }
}
}
