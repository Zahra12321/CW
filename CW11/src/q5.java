import java.util.ArrayList;
import java.util.List;

public class q5 {

    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("a");
        words.add("b");
        words.add("c");
        words.add("d");
        words.add("e");
        words.add("f");

        System.out.println("before: " + words);
        System.out.println("after: " + reverse(words));
    }

    public static <T> List<T> reverse(List<T> list) {
        List<T> reversed = new ArrayList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            reversed.add(list.get(i));
        }

        return reversed;
    }

}

