import java.util.HashSet;

public class repeatingElements {
    public static void main(String[] args) {
        int arr[] = {1, 2,1, 3, 2, 1, 4, 3, 7};
        findRepeatingElements(arr);
    }

    public static void findRepeatingElements(int[] arr) {
        HashSet<Integer> elements = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();

        for (int num : arr) {
            if (!elements.add(num)) { // if add() returns false, num is a duplicate
                duplicates.add(num);
            }
        }

        System.out.print("The repeating elements are: ");
        for (int num : duplicates) {
            System.out.print(num + " ");
        }
    }
}
