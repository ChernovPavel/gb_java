package lesson_11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TestArrayList {
    public static void main(String[] args) {

        List<String> strList = new ArrayList<>();
        Collections.addAll(strList, "a", "b", "c", "d", "a", "b", "c", "d", "c", "c", "f", "g");

        List <String> list1 = strList.stream().distinct().collect(Collectors.toList());
        System.out.println(list1);

        Map<String, Long> frequency = strList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        frequency.forEach((k, v) -> System.out.println(k + ": " + v));
    }
}
