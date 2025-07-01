import java.util.HashSet;
import java.util.Set;
public class Myhashset {
    public static void main(String[] args) {
        Set<Character> set = new HashSet<>();
        set.add('s');
        set.add('a');
        set.add('a');
        System.out.println(set.size());
    }
}
