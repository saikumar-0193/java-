package LinkedList.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int[] arr = {3,4,5,9,1,2,10};
        for(int num : arr) {
            list.add(num);
        }
        // ArrayList<Integer> cloned = new ArrayList<>(list);
        // System.out.println(cloned);
        int min = Collections.min(list);
        int max = Collections.max(list);
        System.out.println("min is " + min + " max is " + max);
    }
}
