package Lecture.dfs;

public class MovingNodeDfs {


    static Tree tree = new Tree();

    private int DFS(Node root, int level) {
        if (root.rt == null && root.lt == null) {
            return level;
        } else {
            return Math.min(DFS(root.lt, level + 1), DFS(root.rt, level + 1));


        }


    }

    public static void main(String[] args) {

        Node root = tree.root;
        MovingNodeDfs sol = new MovingNodeDfs();

        System.out.println(sol.DFS(root, 0));
    }


}
