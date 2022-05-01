package Lecture.dfs;

/**
 * DFS 구현 익숙해질때까지 반복
 */

public class DFS2 {

    static Tree tree = new Tree();

    private void DFS(Node root) {

        if (root == null) {
            return;
        } else {
            //현재 노드의 자식 노드들이 있으므로 계속 탐색
            DFS(root.lt);
            DFS(root.rt);
        }


    }

    public static void main(String[] args) {

        Node root = tree.root;
        DFS2 sol = new DFS2();
        sol.DFS(root);

    }
}
