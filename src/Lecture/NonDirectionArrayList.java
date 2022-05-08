package Lecture;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 그래프와 인접리스트
 * 인접 행렬은 정점들이 많아지면 비효율적이므로 리스트에 정점과 간선들의 정보를 저장한다.
 */
public class NonDirectionArrayList {
    //처음 내가 사용했던 방식
//    public ArrayList<Integer>[] list;
    //강의방식
    public ArrayList<ArrayList<Integer>> list;

    //정점의 갯수
    public int n;

    //간선의 갯수
    public int m;

    public void graphMake() {

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        list = new ArrayList<>();

//        list = new ArrayList[n + 1];
        for (int i = 0; i <= n; i++) {
            list.add(new ArrayList<Integer>());
        }



        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            list.get(a).add(b);
            list.get(b).add(a);
        }

    }

    public void printGraph() {

        for (int i = 1; i <= n; i++) {
            System.out.println(list.get(i));
        }

    }

}