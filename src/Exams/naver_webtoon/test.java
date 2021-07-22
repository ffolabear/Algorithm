package Exams.naver_webtoon;

public class test {

    public static void main(String[] args) {

        String str = "abcxyasdfasdfxyabc";

        for (int i = 1 ; i <= (str.length()+1)/2; i ++){
            System.out.println(i);

            System.out.println((str.length() - i + 1));

            if (i == str.length() - i + 1){
                System.out.println(i + " / " + (str.length() - i + 1));
            }
            System.out.println("----------------");

        }

    }
}
