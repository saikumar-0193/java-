import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class SortDates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<int[]> result = new ArrayList<>();
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            int year = sc.nextInt();
            int month = sc.nextInt();
            int day = sc.nextInt();
            result.add(new int[]{day,month, year});
        }

        Collections.sort(result, (a,b) -> {
            if(a[2] != b[2]) return a[2] - b[2];
            else if(a[1] != b[1]) return a[1] - b[1];
            else return a[0] - b[0];
        });

        for(int[] dates : result) {
            System.out.println(dates[0] + " " + dates[1] + " " +dates[2]);
        }
    }
}
