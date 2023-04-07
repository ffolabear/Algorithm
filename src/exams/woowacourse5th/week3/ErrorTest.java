package exams.woowacourse5th.week3;

public class ErrorTest {

    public static void main(String[] args) {

//        int i = 0;
        String str1 = String.valueOf(Long.MAX_VALUE);
        String str2 = String.valueOf(Integer.MAX_VALUE);

//        String str = "@2";
//        try {
//            i = Integer.parseInt(str);
//        } catch (Exception e) {
//            throw new IllegalArgumentException();
//        }

        System.out.println(Long.parseLong(str1));
        System.out.println(Long.parseLong(str2));
        System.out.println(Long.parseLong(str1) > Long.parseLong(str2));
    }

}
