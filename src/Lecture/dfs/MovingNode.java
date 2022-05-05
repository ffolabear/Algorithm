package Lecture.dfs;

public class MovingNode {


    static Tree tree = new Tree();
    static int ans = 0;

    private void DFS(Node root) {
        if (root.rt == null && root.lt == null) {
            return;
        } else {
            ans++;
//            if (root.rt == null) {
//                DFS(root.lt);
//                ans++;
//            }
//
//            if (root.lt == null) {
//                DFS(root.rt);
//                ans++;
//            }
            DFS(root.lt);
            DFS(root.rt);


        }


    }

    public static void main(String[] args) {

        Node root = tree.root;
        MovingNode sol = new MovingNode();
        sol.DFS(root);
        System.out.println(ans);
    }


}
