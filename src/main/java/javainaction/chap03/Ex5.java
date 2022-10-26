package javainaction.chap03;

import java.util.ArrayList;
import java.util.List;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class Ex5 {

    public static void main(String[] args) {



        List<Integer> list = new ArrayList<>();
        list.add(1);


        // 오토 박싱 예외
        IntPredicate evenIntPredicate = (int i) -> i % 2 == 0;
        evenIntPredicate.test(1000);

        Predicate<Integer> evenPredicate = (Integer i) -> i % 2 == 0;
        evenPredicate.test(1000);
    }
}
