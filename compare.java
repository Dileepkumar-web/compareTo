import java.util.*;

public class LambdaComparator {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Java", "Dilip", "Lambda", "Code");

        names.sort((a, b) -> a.compareTo(b)); // ascending order
        System.out.println("Sorted: " + names);
    }
}
