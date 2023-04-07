package exams.bti;

/**
 * 자연수 num 이 주어질때 조건 만족하는 가장 작은수
 * - 구하는 숫자의 자릿수는 짝수
 * - 숫자가 2 * n 자릿수일때 앞 n자리의 각 자릿수 곱과 뒤 n 자리의 각 자릿수 곱이 같아야함
 * 1 <= num <= 50,000,000
 */
public class q2 {

    public int solution(int num) {

        int answer = 0;

        if (num <= 10) {
            answer = 11;
        } else {

            String temp = String.valueOf(num);
            StringBuilder sb = new StringBuilder();

            //홀수자리라면 가장 작은 짝수자리의 1111111... 로 바꿔줘야함
            if (temp.length() % 2 == 1) {
                sb.append('1');
                while (sb.length() != temp.length() + 1) {
                    sb.append('0');
                }

                answer = Integer.parseInt(sb.toString());
            } else {


                int end = (int) Math.pow(10, temp.length());

                for (int i = num; i < end; i++) {
                    String[] arr = String.valueOf(i).split("");

                    if (isValid(arr)) {
                        answer = i;
                        break;
                    }
                }




            }
        }

        return answer;
    }

    public boolean isValid(String[] arr) {

        int mid = arr.length / 2;

        int left = 1;
        int right = 1;

        for (int i = 0; i < arr.length; i++) {
            if (i < mid) {
                left *= Integer.parseInt(arr[i]);
            } else {
                right *= Integer.parseInt(arr[i]);
            }
        }

        return left == right;
    }

    public static void main(String[] args) {

//        int num = 21;       // 22
//        int num = 12345;       // 22
//        int num = 3462;     // 3462
//        int num = 235386;   // 235516
          int num = 12312341;


        q2 sol = new q2();

        System.out.println(sol.solution(num));

    }

}
