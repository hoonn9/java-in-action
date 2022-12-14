package javainaction.chap03;

import java.util.Arrays;
import java.util.List;

public class Ex3 {

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4);

        forEach(integers, (Integer num) -> System.out.println(num));
        forEach(integers, System.out::println);
    }


    @FunctionalInterface
    private interface Consumer<T> {
        void accept(T t);
    }

    private static <T> void forEach(List<T> list, Consumer<T> c) {
        for (T e: list) {
            c.accept(e);
        }
    }
}
