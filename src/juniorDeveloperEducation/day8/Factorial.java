package juniorDeveloperEducation.day8;

public class Factorial {

    static int recurAns = 1;

    public static void main(String[] args) {


        System.out.println("일반 = " + factorial_normal(10));
        factorial_recur(10);
        System.out.println("재귀 = " + recurAns);
    }

    private static int factorial_normal(int num) {
        int ans = 1;

        for (int i = num; i >= 1; i--) {
            ans *= i;
        }

        return ans;
    }

    private static void factorial_recur(int num) {
        if (num == 1) {
            return;
 
        } else {
            recurAns *= num;
            factorial_recur(num - 1);

        }
    }

}
