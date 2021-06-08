package kakao_2021;

import java.util.Arrays;

public class Q4 {


    public static void main(String[] args) {


        int[][] roads = {{1, 2, 1},{3, 2, 1}, {2,4,1}};
        int[] traps = {2,3};

        solution(4, 1, 4, roads, traps);

    }

    public static int solution(int n, int start, int end, int[][] roads, int[] traps) {

        int answer = 0;
        //Arrays.sort(traps);




        // 시작 지점
        int ptr = start;


        while (ptr != end){

            // 함정을 밝지 않으면 road의 1번 인덱스가 출발지
            int changeS = 0;
            // 함정을 밝지 않으면 road의 1번 인덱스가 목적지
            int changeE = 1;

            for(int i =0; i < roads.length; i++){

                if (roads[i][changeS] == ptr){

                    //목적지로 바꾸기
                    ptr = roads[i][changeE];

                    //시간 더하기
                    answer += roads[i][2];

                    if (Arrays.binarySearch(traps, roads[i][changeE]) != -1){

                        changeS = 1;
                        changeE = 0;
                    }

                }
            }
        }


        System.out.println(answer);
        return answer;
    }








}
