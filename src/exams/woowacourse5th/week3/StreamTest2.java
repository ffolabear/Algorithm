package exams.woowacourse5th.week3;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamTest2 {

    public static void main(String[] args) {

        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> list2 = Arrays.asList(4, 5, 6, 7, 8, 9);

        List<Integer> matchNumbers = list1.stream()
                .filter(number -> list2.stream()
                        .anyMatch(Predicate.isEqual(number)))
                .collect(Collectors.toList());

        System.out.println(matchNumbers);
    }

}
