public class SubsetArray {
    public static void main(String[] args) {
        int[] arr1 = {1,2,6,7,3,9};
        int[] arr2 = {3,6,2};
        boolean isSubset = true;
        for(int i = 0; i < arr2.length; i++) {
            boolean present = false;
            for(int j = 0; j < arr1.length;j++) {
                if(arr2[i] == arr1[j]) {
                    present = true;
                    break;
                }
            }
            if(!present) {
                isSubset = false;
                break;
            }
        }
       if(!isSubset) {
        System.out.println("not a subset"); 
       } else {
        System.out.println("subset");
       }
    }
}
