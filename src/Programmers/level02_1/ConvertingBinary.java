package Programmers.level02_1;

public class ConvertingBinary {


    public int[] solution(String s) {

        int cnt = 0;
        int[] answer = {};
        int countZero = 0;


        while (s.length() != 1) {

            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '0') {
                    countZero++;
                }
            }
            s = s.replaceAll("1", "");
            System.out.println(s);
        }

        return answer;
    }

    public static void main(String[] args) {

        ConvertingBinary sol = new ConvertingBinary();
        String s = "110010101001";

        System.out.println(sol.solution(s));

    }

}
