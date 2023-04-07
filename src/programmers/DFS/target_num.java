package programmers.DFS;

public class target_num {

    public int solution(int[] numbers, int target) {


        int answer = 0;
        answer = bfs(numbers, target, numbers[0], 1) + bfs(numbers, target, -numbers[0], 1);


        return answer;
    }

    public int bfs(int[] numbers, int target, int sum, int i) {

        if (i == numbers.length) {
            if (sum == target) {
                return 1;
            } else {
                return 0;
            }
        }

        int result = 0;
        result += bfs(numbers, target, sum + numbers[i], i + 1);
        result += bfs(numbers, target, sum - numbers[i], i + 1);

        return result;

    }


    public static void main(String[] args) {

        int[] numbers = {1, 1, 1, 1, 1};
        int target = 3;

        target_num sol = new target_num();
        sol.solution(numbers, target);

    }
}


