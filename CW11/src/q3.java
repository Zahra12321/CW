import java.util.ArrayList;
import java.util.List;

public class q3 {

    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(3);
        integerList.add(2);
        integerList.add(4);
        integerList.add(5);
        integerList.add(10);

        System.out.println("before: " + integerList);
        changePosition(integerList, 2,5);
        System.out.println("after: " + integerList);
    }

    public static <T> void changePosition(List<T> list, int x, int y){
        T holder = list.get(x);
        list.set(x, list.get(y));
        list.set(y,holder);
    }


}
