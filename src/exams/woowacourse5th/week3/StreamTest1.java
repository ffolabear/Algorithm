package exams.woowacourse5th.week3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest1 {

    public static void main(String[] args) {


        String str = "1,2,4,5,6,7";
        List<String> list = Arrays.asList(str.split(","));
        Stream<String> stream = list.stream().filter(number -> number.matches("1"));
        System.out.println(list);
        System.out.println(stream);

    }

}
