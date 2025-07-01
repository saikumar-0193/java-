package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryString {
    public static void main(String[] args) {
        // int n = 8;
        // for(int i = 1; i < 8; i++) {
        //     System.out.print(Integer.toBinaryString(i) + " ");
        // }
         int n = 10; // how many binary numbers to print
        Queue<String> q = new LinkedList<>();
        q.add("1");

        for (int i = 0; i < n; i++) {
            String curr = q.poll();
            System.out.print(curr + " ");

            q.add(curr + "0");
            q.add(curr + "1");
        }
    }
}