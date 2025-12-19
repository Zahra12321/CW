public class q7 {

    public static void main(String[] args) {
        Integer[] num = new Integer[]{5, 15, 20, 50, 7, 55};

        System.out.println(findFirstGreaterThan(num, 7));
    }

    public static <T extends Comparable<T>> int findFirstGreaterThan(T[] at, T elem) {

        for (int i = 0; i < at.length; i++) {
            if (at[i].compareTo(elem) > 0) {
                return i;
            }
        }

        return -1;
    }
}
