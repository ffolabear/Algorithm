package lecture.greedy;

import java.util.Scanner;

public class IsFriend {

    static int[] unf;

    public static int Find(int v) {

        //넘어온 각 친구들이 속해있는 집합을 리턴
        if (v == unf[v]) {
            return v;
        //만약 친구의 번호와 집합의 번호가 다르다면, 속해있는 집합의 번호를 출력
        } else {
            return unf[v] = Find(unf[v]);
        }

    }

    public static void Union(int a, int b) {

        //넘어온 두 숫자의 각각의 집합을 먼저 찾음
        int setA = Find(a);
        int setB = Find(b);

        //두 친구가 속한 집합이 다르다면 둘을 같은 집합으로 만들어줘야하므로

        if (setA != setB) {
            unf[setA] = setB;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        unf = new int[N + 1];

        //각 인덱스 마다의 개별 집합이 있다고 생각
        for (int i = 1; i <= N; i++) {
            unf[i] = i;
        }

        for (int i = 0; i < M; i++) {
            //입력받은 두 친구는 친구 관계이므로 같은 집합으로 만든다.
            int a = sc.nextInt();
            int b = sc.nextInt();
            Union(a, b);
        }

        int targetFriendA = sc.nextInt();
        int targetFriendB = sc.nextInt();

        int targetFindA = Find(targetFriendA);
        int targetFindB = Find(targetFriendB);

        if (targetFindA == targetFriendB) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }

}
