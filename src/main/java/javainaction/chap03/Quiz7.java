package javainaction.chap03;

public class Quiz7 {
    public static void main(String[] args) {
        TriFunction<String, Integer, Boolean, Apple> appleFactory = Apple::new;
    }

    private interface TriFunction<T, U, V, R> {
        R apply(T t, U u, V v);
    }


    private static class Apple {
        public Apple(String color, Integer weight, Boolean bool) {
        }
    }
}
