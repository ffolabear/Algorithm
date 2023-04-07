package lecture.bfs;

import lecture.Tree;

import java.util.LinkedList;
import java.util.Queue;

public class MovingNodeBfs {


    static Tree tree = new Tree();

    private int BFS(Tree.Node root) {

        Queue<Tree.Node> queue = new LinkedList<>();
        queue.offer(root);

        int level = 0;

        while (!queue.isEmpty()) {
            int len = queue.size();
            for (int i = 0; i < len; i++) {
                Tree.Node current = queue.poll();

                if (current.lt == null && current.rt == null) {
                    return level;
                }
                if (current.lt != null) {
                    queue.offer(current.lt);
                }

                if (current.rt != null) {
                    queue.offer(current.rt);
                }
            }

            //큐가 아직 비어있지 않으므로 탐색이 더 진행됨
            level++;
        }

        return 0;

    }

    public static void main(String[] args) {

        Tree.Node root = tree.root;
        MovingNodeBfs sol = new MovingNodeBfs();

        System.out.println(sol.BFS(root));
    }


}
