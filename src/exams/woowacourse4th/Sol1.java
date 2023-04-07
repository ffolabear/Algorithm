package exams.woowacourse4th;

public class Sol1 {

    public int[] solution(int[] arr) {

        int[] answer = new int[3];

        int one = 0;
        int two = 0;
        int three = 0;

        for (int i = 0; i < arr.length; i++) {



            if (arr[i] == 1) {
                one++;
            } else if (arr[i] == 2) {
                two++;
            } else if (arr[i] == 3) {
                three++;
            }

        }

        int point = Math.max(one, Math.max(two, three));

        answer[0] = point - one;
        answer[1] = point - two;
        answer[2] = point - three;



        return answer;
    }

    public static void main(String[] args) {

//        int[] arr = {2, 1, 3, 1, 2, 1};
//        int[] arr = {3, 3, 3, 3, 3, 3};
        int[] arr = {1};

        Sol1 sol = new Sol1();
        sol.solution(arr);

    }
}
