package Lecture.dfs;

import Lecture.Tree;

/**
 * DFS 구현 익숙해질때까지 반복
 */

public class DFS_Tree2 {

    static Tree tree = new Tree();

    private void DFS(Tree.Node root) {

        if (root == null) {
            return;
        } else {
            //현재 노드의 자식 노드들이 있으므로 계속 탐색
            DFS(root.lt);
            DFS(root.rt);
        }


    }

    public static void main(String[] args) {

        Tree.Node root = tree.root;
        DFS_Tree2 sol = new DFS_Tree2();
        sol.DFS(root);

    }
}
