package baekjoon.stage1;

public class Boj_10870 {

    public static void main(String[] args) {


        System.out.println(fibo(10));
    }

    public static int fibo(int n){

        if(n == 0){
            return 0;
        }

        if (n == 1){
            return 1;
        }


        return fibo(n-1) + fibo(n - 2);

    }
}
