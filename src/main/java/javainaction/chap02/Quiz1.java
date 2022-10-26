package javainaction.chap02;

import java.util.Arrays;
import java.util.List;



public class Quiz1 {
    enum Color {
        RED, GREEN
    }

    public static void main(String... args) {
        List<Apple> apples = Arrays.asList(new Apple(500, Color.RED), new Apple(300, Color.GREEN));
        Quiz1.prettyPrintApple(apples, new AppleWeightPrintFormatter());
        Quiz1.prettyPrintApple(apples, new AppleColorPrintFormatter());

    }

    public static void prettyPrintApple(List<Apple> inventory, ApplePrintFormatter formatter) {
        for (Apple apple : inventory) {
            String output = formatter.format(apple);
            System.out.println(output);
        }
    }

    interface ApplePrintFormatter {
        String format(Apple apple);
    }

    public static class AppleWeightPrintFormatter implements ApplePrintFormatter {
        @Override
        public String format(Apple apple) {
            return Integer.toString(apple.getWeight());
        }
    }

    public static class AppleColorPrintFormatter implements ApplePrintFormatter {
        @Override
        public String format(Apple apple) {
            return apple.getColor()
                    .toString();
        }
    }

    public static class Apple {

        private int weight = 0;
        private Color color;

        public Apple(int weight, Color color) {
            this.weight = weight;
            this.color = color;
        }

        public int getWeight() {
            return weight;
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }

        public Color getColor() {
            return color;
        }

        public void setColor(Color color) {
            this.color = color;
        }

        @SuppressWarnings("boxing")
        @Override
        public String toString() {
            return String.format("Apple{color=%s, weight=%d}", color, weight);
        }

    }

}
