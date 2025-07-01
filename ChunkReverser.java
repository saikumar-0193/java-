public class ChunkReverser {

    public static String reverseNthToFront(String s, int n) {
        StringBuilder result = new StringBuilder();

        
        char[] arr = s.toCharArray();

        for (int i = 0; i < arr.length; i += n) {
            int end = Math.min(i + n, arr.length);  
            StringBuilder chunk = new StringBuilder();
            
            chunk.append(arr[end - 1]);
            
            for (int j = i; j < end - 1; j++) {
                chunk.append(arr[j]);
            }
            
            result.append(chunk);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String input = "saikumar";
        int n = 4;
        String output = reverseNthToFront(input, n);
        System.out.println("Output: " + output);  
    }
}
