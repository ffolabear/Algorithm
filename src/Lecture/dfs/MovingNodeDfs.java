package Lecture.dfs;

import Lecture.Tree;

public class MovingNodeDfs {


    static Tree tree = new Tree();

    private int DFS(Tree.Node root, int level) {
        if (root.rt == null && root.lt == null) {
            return level;
        } else {
            return Math.min(DFS(root.lt, level + 1), DFS(root.rt, level + 1));


        }


    }

    public static void main(String[] args) {

        Tree.Node root = tree.root;
        MovingNodeDfs sol = new MovingNodeDfs();

        System.out.println(sol.DFS(root, 0));
    }


}
