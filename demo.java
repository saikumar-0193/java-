import java.util.HashMap;

public class demo {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,2,1,3};
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if(!map.containsKey(arr)){
                map.put(arr[i],map.getOrDefault(arr[i], 0) + 1);
            }
           
        }
        
        for(Integer array : map.keySet()){
            System.out.print(array + + map.get(array));
        }
    }
}
