package programmers.level02;

public class NextBigNum {

    public int solution(int n) {

        int answer = n + 1;

        String convertedNum = Integer.toBinaryString(n);
        int countOne = 0;

        for (int i = 0; i < convertedNum.length(); i++) {
            if (convertedNum.charAt(i) == '1') {
                countOne++;
            }
        }

        while (true) {
            String temp = Integer.toBinaryString(answer);

            int tempCntOne = 0;
            for (int i = 0; i < temp.length(); i++) {
                if (temp.charAt(i) == '1') {
                    tempCntOne++;
                }
            }

            if (tempCntOne == countOne) {
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
