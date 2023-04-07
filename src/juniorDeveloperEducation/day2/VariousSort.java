package juniorDeveloperEducation.day2;


import java.util.ArrayList;
import java.util.Random;


public class VariousSort {

    public static void main(String[] args) {

        selectionSort(makeList());
        insertionSort(makeList());


    }


    private static ArrayList<Integer> makeList() {

        Random random = new Random();

        ArrayList<Integer> list = new ArrayList<>();
        boolean[] chk = new boolean[20 + 1];
        int cnt = 0;

        while (cnt < 5) {
            int temp = random.nextInt(20);
            if (!chk[temp]) {
                list.add(temp);
                chk[temp] = true;
                cnt++;
            }
        }

        return list;
    }

    /**
     * 1. 정렬 되지 않은 인덱스의 맨 앞에서 부터, 이를 포함한 그 이후의 배열값 중 가장 작은 값을 찾아 감.
     * (정렬되지 않은 인덱스의 맨 앞은, 초기 입력에서는 배열의 시작위치일 것이다.)
     * 2. 가장 작은 값을 찾으면, 그 값을 현재 인덱스의 값과 바꿔준다.
     * 3. 다음 인덱스에서 위 과정을 반복해줌.
     */
    private static void selectionSort(ArrayList<Integer> list) {

        for (int i = 0; i < list.size(); i++) {

            int idx = i;

            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(j) < list.get(idx)) {
                    //현재 비교하는 인덱스보다 작은 인덱스를 저장
                    idx = j;
                }
            }

            int tempA = list.get(i);
            int tempB = list.get(idx);
            list.set(i, tempB);
            list.set(idx, tempA);
        }

        System.out.println("list = " + list);

    }

    /**
     * 1. 삽입 정렬은 두 번째 인덱스부터 시작. 현재 인덱스는 별도의 변수에 저장해주고, 비교 인덱스를 현재 인덱스-1로 잡는다.
     * 2. 별도로 저장해 둔 삽입을 위한 변수와, 비교 인덱스의 배열 값을 비교
     * 3. 삽입 변수의 값이 더 작으면 현재 인덱스로 비교 인덱스의 값을 저장해주고, 비교 인덱스를 -1하여 비교를 반복한다.
     * 4. 만약 삽입 변수가 더 크면, 비교 인덱스+1에 삽입 변수를 저장함
     */
    private static void insertionSort(ArrayList<Integer> list) {


        for (int i = 1; i < list.size(); i++) {

            int temp = list.get(i);
            int prev = i - 1;

            while (prev >= 0 && temp < list.get(prev)) {
                int next = list.get(prev);
                list.set(prev + 1, next);
                prev--;
            }

            list.set(prev + 1, temp);

        }

        System.out.println("list = " + list);
    }


}
