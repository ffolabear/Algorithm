package Lecture.bfs;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * BFS 구현 익숙해질때까지 반복
 *
 */

public class BFS3 {

    static Tree tree = new Tree();

    private void BFS(Node root) {

        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        int level = 0;

        while (!queue.isEmpty()) {

            int len = queue.size();
            System.out.print(level + " : ");

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
            System.out.println();
            level++;

        }


    }


    public static void main(String[] args) {

        Node root = tree.root;
        BFS3 sol = new BFS3();
        sol.BFS(root);

    }

}
