package exams.woowacourse5th.week3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Convert {


    public static void main(String[] args) {

        List<Integer> intList = Arrays.asList(1, 2, 3, 3, 4, 5);
        List<String> strList = Arrays.asList("1", "2", "3", "3", "4", "5");

        List<Integer> intStream = intList.stream().distinct().collect(Collectors.toList());
        System.out.println(intList);
        System.out.println(intStream);

        System.out.println();

        List<String > strStream = strList.stream().distinct().collect(Collectors.toList());
        System.out.println(strList);
        System.out.println(strStream);
    }

}
