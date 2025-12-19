import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        method(numbers);
        System.out.println(numbers);
//        System.out.println(numberOfEvenNumber(numbers, p -> p % 2 == 0));
//        System.out.println(countIf(numbers, p -> p % 2 == 0, 3));


    }
    public static void method (List list) {
        list.add("Yegan");
    }

    public static long numberOfEvenNumber(List<Integer> numbers, Predicate<Integer> predicate) {
        return numbers.stream()
                .filter(predicate)
                .count();
    }

    public long numberOfStr(List<String> words, Predicate<String> predicate) {
        return words.stream()
                .filter(predicate)
                .count();
    }

    public static <E> long countIf(List<E> words, Predicate<E> predicate, E e) {
        return words.stream()
                .filter(predicate)
                .count();
    }




}