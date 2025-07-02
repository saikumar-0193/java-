package Greedy;
import java.util.Arrays;
public class AssignCookies {
    public static void main(String[] args) {
        int[] children = {1,5,3,3,4};
        int[] cookies = {4,2,1,2,1,3};

        Arrays.sort(children);
        Arrays.sort(cookies);
        int j = 0;
        int count = 0;
        for(int i = 0; i < children.length; i++) {
            if(children[i] <= cookies[j]) {
                count++;
                 j++;
            }
           
        }
        System.out.println(count);
    }
}
