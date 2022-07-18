package JuniorDeveloperEducation.day1;

/**
 * 복리 이자율 7%로 1000만원 저금시 2000만원이 되기까지 몇 년이 걸리는가?
 */

public class Q3 {

    public static void main(String[] args) {

        int init = 10000000;
        int countYear = 0;

        while (init <= 20000000) {
            init = (int)(init * 1.07);
            countYear++;
        }

        System.out.println(init);
        System.out.println("연수 : " + countYear);

    }

}
