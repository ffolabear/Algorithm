package Lecture.bfs;

import Lecture.Tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * BFS 구현 익숙해질때까지 반복
 *
 * input sample
 * 5 9
 * 1 2
 * 1 3
 * 1 4
 * 2 1
 * 2 3
 * 2 5
 * 3 4
 * 4 2
 * 4 5
 *
 */

public class BFS_Tree3 {

    static Tree tree = new Tree();

    private void BFS(Tree.Node root) {

        Queue<Tree.Node> queue = new LinkedList<>();
        queue.offer(root);

        int level = 0;

        while (!queue.isEmpty()) {

            int len = queue.size();
            System.out.print(level + " : ");

            for (int i = 0; i < len; i++) {

                Tree.Node current = queue.poll();
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

        Tree.Node root = tree.root;
        BFS_Tree3 sol = new BFS_Tree3();
        sol.BFS(root);

    }

}
