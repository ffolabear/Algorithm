package Programmers.Test;

public class average {

    public static double solution(int[] arr) {

        int sum = 0;

        for(int i : arr){
            sum += i;
        }

        System.out.println(sum);
        System.out.println(arr.length);

        double answer = (double) sum/arr.length;
        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {


        int[] arr = {1,2,3,4};
        solution(arr);

    }

}
