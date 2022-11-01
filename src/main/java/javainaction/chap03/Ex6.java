package javainaction.chap03;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;

// 생성자 참조
public class Ex6 {
    public static void main(String[] args) {

        List<Map.Entry<String, Integer>> weights = List.of(Map.entry("RED", 10));
        List<Apple> apples = map(weights, Apple::new);
    }

    private static List<Apple> map(List<Map.Entry<String, Integer>> list, BiFunction<String, Integer, Apple> f) {
        List<Apple> result = new ArrayList<>();
        for (Map.Entry<String, Integer> entry: list) {
            result.add(f.apply(entry.getKey(), entry.getValue()));
        }
        return result;
    }

    private static class Apple {

        public Apple(String color, Integer weight) {
        }
    }
}
