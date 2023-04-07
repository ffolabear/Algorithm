package programmers.level02;

/**
 * K 칸 앞으로 점프
 * - 배터리 K칸 소모
 *
 * 현재까지 온 거리 x 2 만큼 순간이동
 * - 배터리 소모 X
 *
 * 5칸 간다면
 *  1. 5칸 점프 - 배터리 5칸 소모
 *  2. 2칸 점프 - 순간이동 - 1칸 점프 : 배터리 3칸 소모
 *  3. 1칸 점프 - 순간이동 - 순간이동 - 1칸 점프 : 배터리 2칸 소모
 *
 *  1 2 4 5
 *  3 6
 *  5 ...
 */

public class JumpAndTeleport {

    public int solution(int n) {
        int ans = 0;

        while (n != 0) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n -= 1;
                ans++;
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        JumpAndTeleport sol = new JumpAndTeleport();
        int n = 5;
        sol.solution(n);

    }

}
