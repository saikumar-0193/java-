import java.util.HashMap;
public class count{
    public static void main(String[] args) {
        int [] arr= {10,10,20,30,20,30,40};

       HashMap<Integer,Integer> occurences = new HashMap<>();

       for(int num : arr){
         occurences.put(num,occurences.getOrDefault(num,0)+1);
       }
       for(HashMap.Entry<Integer,Integer> entry : occurences.entrySet()){
            System.out.println(entry.getKey() +" "+ entry.getValue());
       }
    }
    
}