package Programmers.level02;

public class test {

    private static Long calc(Long num1, Long num2, char operator) {
        System.out.println(num1 + " " + operator + " " + num2);

        long res = 0;
        switch (operator) {
            case '+':
                System.out.println(operator);
                return num1 + num2;
            case '-':
                System.out.println(operator);
                return num1 - num2;
            case '*':
                System.out.println(operator);
                return num1 * num1;
        }

//        switch (operator) {
//            case '+': {
//                return num1 + num2;
//            }
//            case '-': {
//                return num1 - num2;
//            }
//            case '*': {
//                return num1 * num2;
//            }
//        }

        return res;
    }

    public static Long calc1(Long num1, Long num2, char op) {

        System.out.println(num1 + " " + op + " " + num2);
        long num = 0;
        switch (op) {
            case '+': {
                return num1 + num2;
            }
            case '-': {
                return num1 - num2;
            }
            case '*': {
                return num1 * num2;
            }
        }
        return num;
    }

    public static void main(String[] args) {

        System.out.println(calc((long) -100, (long) -220, '*'));
//        System.out.println(calc1(-100, -220, '*'));
//        long a = -100;
//        long b = -220;
//        System.out.println(a * b);

    }

}
