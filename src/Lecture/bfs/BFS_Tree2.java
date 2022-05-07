package Lecture.bfs;

import Lecture.Tree;

import java.util.LinkedList;
import java.util.Queue;

public class BFS_Tree2 {
    static Tree tree = new Tree();

    private void BFS(Tree.Node root) {

        //BFS 는 큐에 탐색해야할 노드들을 넣고 하나씩 뺀다.
        Queue<Tree.Node> queue = new LinkedList<>();
        //첫 노드를 넣어줌
        queue.offer(root);

        //깊이 확인용 변수
        int L = 0;

        //탐색은 다음 노드가 있을때까지 = 큐가 비어있지 않을 동안
        while (!queue.isEmpty()) {
            //그리고 큐에 있는 노드만큼만 탐색
            int len = queue.size();
            System.out.print(L + " : ");
            for (int i = 0; i < len; i++) {

                //노드들을 탐색하면서 만약 그 노드들이 더 이상 자식 노드를 가지고 있지 않다면 탐색할 필요 x
                Tree.Node current = queue.poll();
                System.out.print(current.data + " ");

                if (current.lt != null) {
                    queue.offer(current.lt);
                }

                if (current.rt != null) {
                    queue.offer(current.rt);
                }
            }
            L++;
            System.out.println();
        }


    }


    public static void main(String[] args) {

        Tree.Node root = tree.root;
        BFS_Tree2 sol = new BFS_Tree2();
        sol.BFS(root);

    }

}
