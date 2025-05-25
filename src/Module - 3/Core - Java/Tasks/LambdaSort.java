import java.util.*;

public class LambdaSort {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Zara", "Abel", "John", "Emily", "Brian");
        Collections.sort(names, (a, b) -> a.compareTo(b));
        for (String name : names) {
            System.out.println(name);
        }
    }
}
