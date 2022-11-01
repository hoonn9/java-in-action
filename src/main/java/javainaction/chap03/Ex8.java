package javainaction.chap03;

import java.util.function.Function;
import java.util.function.Predicate;

public class Ex8 {
    public static void main(String[] args) {
        Predicate<Apple> redApple = (Apple apple) -> true;
        Predicate<Apple> notRedApple = redApple.negate();
        Predicate<Apple> redAndHeavyApple =
                redApple.and((apple) -> apple.getWeight() > 10).or((apple) -> apple.getWeight() < 100);


        Function<Integer, Integer> f = x -> x + 1;
        Function<Integer, Integer> g = x -> x * 2;

        Function<Integer, Integer> fg = f.andThen(g);
        Function<Integer, Integer> gf = f.compose(g);
        int result = fg.apply(5);
    }


    private static class Apple {
        private Integer weight;
        public Apple(Integer weight) {
            this.weight = weight;
        }

        public Integer getWeight() {
            return this.weight;
        }
    }
}
