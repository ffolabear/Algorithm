package Programmers.level02;

import java.util.ArrayList;
import java.util.List;

public class DividingElectricalGrid {

    class Node{
        int current;
        int next;

        public Node(int current, int next) {
            this.current = current;
            this.next = next;
        }
        
    }

    public int solution(int n, int[][] wires) {
        int answer = -1;

        List<Node> nodes = new ArrayList<>();

        for (int i = 0; i < wires.length; i++) {
            Node node = new Node(wires[i][0], wires[i][1]);
            nodes.add(node);
            System.out.println(node.current);
            System.out.println(node.next);
            System.out.println();
        }


        return answer;
    }

    public static void main(String[] args) {

        int n = 9;
        int[][] wires = {{1, 3}, {2, 3}, {3, 4}, {4, 5}, {4, 6}, {4, 7}, {7, 8}, {7, 9}};

//        int n = 4;
//        int[][] wires = {{1, 2}, {2, 3}, {3, 4}};

//        int n = 7;
//        int[][] wires = {{1, 2}, {2, 7}, {3, 7}, {3, 4}, {4, 5}, {6, 7}};


        DividingElectricalGrid sol = new DividingElectricalGrid();
        sol.solution(n, wires);

    }
}
