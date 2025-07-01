import java.util.ArrayList;
import java.util.Scanner;

public class arrayList2 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); 

        for (int i = 0; i < n; i++) {
            String element = sc.nextLine();
            al.add(element);
        }
        System.out.println(al);
        int index = sc.nextInt();
        sc.nextLine();
        String newElement = sc.nextLine();

        al.add(index, newElement);

        System.out.println(al);

        sc.close();
    }
}