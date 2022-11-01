package javainaction.chap03;

import java.util.ArrayList;
import java.util.List;

public class Ex2 {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("first");
        list.add("second");

        // 람다 사용 사례
        Predicate<String> nonEmptyStringPredicate = (String str) -> !str.isEmpty();
        List<String> result = Ex2.filter(list, nonEmptyStringPredicate);

        for (String s: result) {
            System.out.println(s);
        }
    }

    @FunctionalInterface
    private interface Predicate<T> {
        boolean test(T t);
    }

    private static <T> List<T> filter(List<T> list, Predicate<T> p) {
        List<T> result = new ArrayList<>();

        for (T t: list) {
            if (p.test(t)) {
                result.add(t);
            }
        }

        return result;
    }
}
