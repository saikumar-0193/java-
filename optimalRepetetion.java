import java.util.HashSet;
public class optimalRepetetion {
    public static void main(String[] args) {
        int[] arr= {1,2,3,1,2,3,1,2,6,6,7,8};
        repetition(arr);
    }
    public static void repetition(int[] arr){
        HashSet<Integer> elements = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();


        for (Integer num : arr) {
            if(!elements.add(num)){         //unique elements
                duplicates.add(num);         //duplicate elements
            }
        }
        for (Integer integer : elements) {       //check the unique set i.e elements
            if(!duplicates.contains(integer)){   // if the numbers in elements does not present in duplicates just print it
                System.out.print(integer + " ");
            }
          
        }
    } 


}
