package Algo_practice.search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class test {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        //str = "1 2 3 4"
        String str = bf.readLine();
        String[] arr = str.split(" ");



        List<Integer> list = Arrays.stream(str.split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        System.out.println(list.get(0));


    }
}
