import java.util.ArrayList;
import java.util.Scanner;
public class arrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            arr.add(sc.nextInt());
        }
        int ele = sc.nextInt();
        int firstIndex = arr.indexOf(ele);
        int lastIndex = arr.lastIndexOf(ele);
        if(ele == -1){
            System.out.println("element does not exist");
        }
        System.out.println("the first index is " +firstIndex);
        System.out.println("the last index is " +lastIndex);
    }
}
