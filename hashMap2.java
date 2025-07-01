import java.util.HashMap;

public class hashMap2 {
    public static void main(String[] args){
        // int array[] = {1,2,3,3,4,5,6};
        String [] array = { "sai", "rohit","rahul" };
        HashMap <Character, String> map = new HashMap<>();

        // for(int num : array){
        //     map.put(num,map.getOrDefault(num,0 ) + 1);
        // }

        // System.out.println(map);

        // for(int i = 0 ; i < array.length; i++){
        //     map.put(i,array[i]);
        // }
        // System.out.println(map);

        for(String word : array){
            map.put(word.charAt(0),word);
        }

        System.out.println(map);


    }
}
