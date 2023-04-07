package exams.kakaopay_internship;

public class solution1 {

    public static int solution(int money, int minratio, int maxratio, int ranksize, int threshold, int months){


        return 0;
    }


    public static void main(String[] args) {

        int money = 12345678;
        int ranksize = 250000;
        int threshhold = 10000000;
        int temp = money;
        int cnt = 0;

        while (temp > threshhold) {
            temp -= ranksize;
            cnt++;


        }
        System.out.println(temp);
        System.out.println(cnt);
    }


}
