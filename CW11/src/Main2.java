public class Main2 {
    public static void main(String[] args) {
        System.out.println(Algorithm.max(5, 10));
        System.out.println(Algorithm.max(15.2, 10.5));

    }

    public class Algorithm {
        public static <T extends Comparable<T>> T max(T x, T y) {
            return x.compareTo(y) > 0 ? x : y;
        }
    }
}