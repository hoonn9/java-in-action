package javainaction.chap03;

import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;

public class Quiz6 {


    public void main(String[] args) {
        // ToIntFunction<String> stringToInt = (String s) -> Integer.parseInt(s);
        ToIntFunction<String> stringToInt = Integer::parseInt;

//        BiPredicate<List<String>, String> contains = (list, element) -> list.contains(element);
        // 첫 번쨰 인수가 List 이므로 List::contains 메서드 참조 가능
        BiPredicate<List<String>, String> contains = List::contains;

//        Predicate<String> startsWithNumber = (String s) -> this.startsWithNumber(s);
        Predicate<String> startsWithNumber = this::startsWithNumber;
    }

    private boolean startsWithNumber(String s) {
        String str = "";
        return str.startsWith(s);
    }
}
