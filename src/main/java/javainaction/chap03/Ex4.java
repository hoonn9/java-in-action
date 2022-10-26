package javainaction.chap03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex4 {
    public static void main(String[] args) {


        List<Integer> result = Ex4.map(Arrays.asList(1, 2, 3, 4), (Integer num) -> num + 5);

        for (Integer x: result) {
            System.out.println(x);
        }

        List<String> result2 = Ex4.map(Arrays.asList(1, 2, 3, 4), (Integer num) -> num.toString());

        for (String s: result2) {
            System.out.println(s);
        }
    }

    @FunctionalInterface
    public interface Function<T, R> {
        R apply(T t);
    }

    public static <T, R> List<R> map(List<T> list, Function<T, R> f) {
        List<R> result = new ArrayList<>();
        for (T e: list) {
            result.add(f.apply(e));
        }

        return result;
    }
}
