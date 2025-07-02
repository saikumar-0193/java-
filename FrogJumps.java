import java.util.Scanner;
public class FrogJumps {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int maxjumps = 0;
        for(int i = 0; i < arr.length; i++) {
            int count = 0;
            int curr = arr[i];
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[j]  < curr) {
                    count++;
                    curr = arr[j];
                }
            }
            maxjumps = Math.max(count, maxjumps);
        }
        System.out.println(maxjumps);
    }
}
