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
        int tempCountOne = 0;

        while (true) {

            if (tempCountOne == countOne) {
                break;
            } else {
                String tempStr = convertToBinary(answer);

                for (int i = 0; i < tempStr.length(); i++) {
                    if (tempStr.charAt(i) == '1') {
                        tempCountOne++;
                    }
                }

            }


        }

        System.out.println(answer);
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


    private int convertToDecimal(String str) {

        int len = str.length() - 1;
        int res = 0;

        for (int i = -0; i < str.length(); i++) {
            if (str.charAt(i) == '1') {
                res += Math.pow(2, len);
            }
            len--;
        }

        return res;
    }

    public static void main(String[] args) {

        NextBigNum sol = new NextBigNum();
        int n = 78;
        sol.solution(n);
    }

}
