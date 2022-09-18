package Programmers.level02_1;

public class NextBigNum {

    public int solution(int n) {

        int answer = n + 1;
        int countOne = 0;
        String convertBinary = convertToBinary(n);

        for (int i = 0; i < convertBinary.length(); i++) {
            if (convertBinary.charAt(i) == '1') {
                countOne++;
            }
        }

        while (true) {

            int tempCountOne = 0;
            String tempStr = convertToBinary(answer);

            for (int i = 0; i < tempStr.length(); i++) {
                if (tempStr.charAt(i) == '1') {
                    tempCountOne++;
                }
            }

            if (tempCountOne == countOne) {
                break;
            } else {
                answer++;
            }
        }

        return answer;
    }

    private String convertToBinary(int n) {

        StringBuilder res = new StringBuilder();
        while (n > 0) {
            int remain = n % 2;
            res.insert(0, remain);
            n /= 2;
        }
        return res.toString();
    }


    public static void main(String[] args) {

        NextBigNum sol = new NextBigNum();
        int n = 78;
        sol.solution(n);
    }

}
