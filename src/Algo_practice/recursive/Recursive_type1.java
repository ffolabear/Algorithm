package Algo_practice.recursive;

import java.util.ArrayList;

public class Recursive_type1 {

    //팩토리얼로 재귀 알고리즘 구현하가

    public static void main(String[] args) {


        System.out.println(factorial1(5));
        System.out.println(factorial2(5));

    }

    public static int factorial1(int n){

        if (n <= 1){
            return 1;

        } else {
            return n * factorial1(n -1);
        }

    }

    public static int factorial2(int n){

        if (n > 0){
            return n * factorial2(n-1);
        } else{
            return 1;
        }

    }

    public static int factorialArr(ArrayList<Integer> dataList) {
        if (dataList.size() <= 0) {
            return 0;
        }

        return  dataList.get(0) + factorialArr(new ArrayList<Integer>(dataList.subList(1, dataList.size())));
    }

}
