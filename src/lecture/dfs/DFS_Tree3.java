package lecture.dfs;

import lecture.Tree;

/**
 * DFS 구현 익숙해질때까지 반복
 */

public class DFS_Tree3 {

    static Tree tree = new Tree();

    private void DFS(Tree.Node current) {

        if (current.lt == null && current.rt == null) {
            System.out.print(current.data);
            return;
        } else {
            DFS(current.lt);
            DFS(current.rt);
        }

    }

    public static void main(String[] args) {

        Tree.Node root = tree.root;
        DFS_Tree3 sol = new DFS_Tree3();
        sol.DFS(root);

    }
}
