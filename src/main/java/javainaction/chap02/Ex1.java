package javainaction.chap02;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Ex1 {

    public static void main(String[] args) {
        List<Apple> list = Arrays.asList(new Apple(500, Quiz1.Color.RED),
                new Apple(500, Quiz1.Color.RED),
                new Apple(500, Quiz1.Color.RED));

        list.sort(new Comparator<Apple>() {
            public int compare(Apple a, Apple b) {
                return a.getWeight().compareTo(b.getWeight());
            }
        });
    }
    // java.util.Comparator
//    public interface Comparator<T> {
//        int compare(T a, T b);
//    }

    public static class Apple {

        private Integer weight = 0;
        private Quiz1.Color color;

        public Apple(int weight, Quiz1.Color color) {
            this.weight = weight;
            this.color = color;
        }

        public Integer getWeight() {
            return weight;
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }

        public Quiz1.Color getColor() {
            return color;
        }

        public void setColor(Quiz1.Color color) {
            this.color = color;
        }

        @SuppressWarnings("boxing")
        @Override
        public String toString() {
            return String.format("Apple{color=%s, weight=%d}", color, weight);
        }

    }
}
