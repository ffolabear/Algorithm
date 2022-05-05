package Lecture.dfs;

import java.util.Map;

public class MovingNode {


    static Tree tree = new Tree();

    private int DFS(Node root, int level) {
        if (root.rt == null && root.lt == null) {
            System.out.println(level + " : " + root.data);
            return level;
        } else {
            return Math.min(DFS(root.lt, level++), DFS(root.rt, level++));


        }


    }

    public static void main(String[] args) {

        Node root = tree.root;
        MovingNode sol = new MovingNode();
        sol.DFS(root, 0);
    }


}
