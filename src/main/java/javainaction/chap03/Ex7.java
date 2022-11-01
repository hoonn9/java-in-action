package javainaction.chap03;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class Ex7 {
    private static final Map<String, Function<Integer, Fruit>> contructors = new HashMap<>();
    public static void main(String[] args) {
        contructors.put("apple", Apple::new);
        contructors.put("orange", Orange::new);

        System.out.println(getFruit("apple", 10));
    }

    private static Fruit getFruit(String key, Integer weight) {
        return contructors.get(key).apply(weight);
    }


    private static class Apple implements Fruit {
        public Apple(Integer weight) {
        }
    }
    private static class Orange implements Fruit {
        public Orange(Integer weight) {
        }
    }

    private interface Fruit {

    }
}
