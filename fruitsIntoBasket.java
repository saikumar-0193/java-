import java.util.HashMap;

public class fruitsIntoBasket {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,2,1,1,2,1,4,5};
        // int maxsum = 0;
        // for(int i = 0; i < arr.length;i++){
        //     HashSet<Integer> set = new HashSet<>();
        //     for(int j = i; j < arr.length;j++){
        //         set.add(arr[j]);

        //         if(set.size() <= 2){
        //             maxsum = Math.max(maxsum, j-i+1);
        //         }else{
        //             break;
        //         }
        //     }

        // }
        // System.out.println(maxsum);


        int left = 0; 
        int maxLength = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int right = 0; right < arr.length; right++){
               map.put(arr[right],map.getOrDefault(arr[right],0)+1);
            while(map.size()>2){
                map.put(arr[left],map.get(arr[left])-1);

                if (map.get(arr[left]) == 0) {
                    map.remove(arr[left]);
                }
                left++;
            }
            maxLength = Math.max(maxLength,right-left+1);
        }
        System.out.println(maxLength);

    }
}
