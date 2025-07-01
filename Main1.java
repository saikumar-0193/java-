import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array ");
        int arrayLength = sc.nextInt();

       List<Integer> list = new ArrayList<>();

       System.out.println("Enter the " + arrayLength + "elements");
       for(int i = 0; i < arrayLength; i++) {
        list.add(sc.nextInt());
       }

       System.out.print("Enter the element to delete ");
       int deletedElemet = sc.nextInt();
       list.remove(Integer.valueOf(deletedElemet));

       System.out.print("enter the element t0 add ");
       int addedElement = sc.nextInt();
       list.add(addedElement);

       Collections.sort(list);

       System.out.print("updated array is ");
       
        System.out.print(list + " ");
       
       System.out.print("Enter the target element ");
       int target = sc.nextInt();
       int index = Collections.binarySearch(list, target);



       if(index >= 0) {
        System.out.println("target element found at " + index);
       }else{
        System.out.println("target not found");
       }

       
    }

    
}
