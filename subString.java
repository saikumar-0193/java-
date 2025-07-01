public class subString {

    public static void main(String[] args) {
        int array[] = {12, 6, 3, 4, 5};
        int target = 10;
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            int sum = 0; // Reset sum for each starting index
            for (int j = i; j < array.length; j++) {
                sum += array[j];

                if (sum == target) {
                    count++;
                }
            }
        }

        System.out.println("Count of subarrays with sum equal to " + target + ": " + count);
    }
}
