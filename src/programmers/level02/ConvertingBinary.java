package programmers.level02;

public class ConvertingBinary {

    static int countZero = 0;

    public int[] solution(String s) {

        int cnt = 0;
        int[] answer = new int[2];

        while (!s.equals("1")) {
            s = convert(s);
            cnt++;
        }

        answer[0] = cnt;
        answer[1] = countZero;
        return answer;
    }

    public String convert(String s) {

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0') {
                countZero++;
            }
        }

        s = s.replaceAll("0", "");
        int length = s.length();

        StringBuilder str = new StringBuilder();

        while (length > 0) {
            int temp = length % 2;
            length /= 2;
            str.insert(0, temp);
        }

        return str.toString();
    }

    public static void main(String[] args) {

        ConvertingBinary sol = new ConvertingBinary();
//        String s = "110010101001";
//        String s = "01110";
        String s = "1111111";

        sol.solution(s);
    }

}
