import java.util.ArrayList;
import java.util.List;

public class q9 {

    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(70);
        integerList.add(20);
        integerList.add(50);
        integerList.add(90);
        integerList.add(100);
        System.out.println(maxInRange(integerList, 1, 5));
    }

    public static <T extends Comparable<T>> int maxInRange(List<T> list, int start, int end) {
        T max = list.get(start);

        for (int i = start; i <= end; i++) {
            if (list.get(i).compareTo(max) > 0) {
                max = list.get(i);
            }
        }

        return (Integer)max;
    }

}
