package Lecture.bfs;

import java.util.LinkedList;
import java.util.Queue;

public class BFS1 {

    static Tree tree = new Tree();

    private void BFS(Node root) {

        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        int L = 0;
        while (!queue.isEmpty()) {
            int len = queue.size();
            System.out.print(L + " : ");
            for (int i = 0; i < len; i++) {
                Node current = queue.poll();
                System.out.print(current.data + " ");

                if (current.lt != null) {
                    queue.offer(current.lt);
                }

                if (current.rt != null) {
                    queue.offer(current.rt);
                }
            }
            //레벨 증가
            L++;
            System.out.println();
//            for (Node node : queue) {
//                System.out.print(node.data + " ");
//            }
//            System.out.println();
        }

    }

    public static void main(String[] args) {

        Node root = tree.root;
        BFS1 sol = new BFS1();
        sol.BFS(root);

    }
}
