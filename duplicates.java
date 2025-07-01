import java.util.HashMap;
import java.util.Map;
public class duplicates {
    public static void main(String[] args) {
        int [] arr = {1,1,2,3,4,4,5,7,6,7};
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
             map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet() ){
            if(entry.getValue() > 1){
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        }
    }
}
