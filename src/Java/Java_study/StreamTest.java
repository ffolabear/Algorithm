package Java.Java_study;

import Algo_practice.Comperator;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest {
    public static void main(String[] args) {


        Stream<String> streamArr = Arrays.stream(new String[]{"red", "yellow", "green", "blue", "black"});


        Double[] nums = {1.0, 2.0, 3.0, 4.0};
        String[] numStr = {"1", "2", "3", "4"};
        IntStream is = IntStream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//        is.filter(i -> i > 2).peek(i -> System.out.println("peek : " + i)).filter(i -> i == 9).forEach(System.out::println);


        Stream<String> strNums = Stream.of(numStr);
//        strNums.mapToInt(Integer::parseInt).forEach(System.out::println);





        Stream<String> strStream = Stream.of("aaa", "aab", "bbb", "ccc", "ddd");
//        strStream.sorted().forEach(System.out::println);
//        strStream.sorted(Comparator.naturalOrder()).forEach(System.out::println);

//        strStream.map(String::toUpperCase).forEach(System.out::println);


    }
}







