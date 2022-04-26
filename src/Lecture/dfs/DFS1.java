package Lecture.dfs;

/**
 * 전위 순회 : 일반적인 DFS, 부모 - 완쪽 자식 - 오른쪽 자식
 * 중위 순회 : 왼쪽 자식 - 부모 - 오른쪽 자식
 * 후위 순회 : 완쪽 자식 - 오른쪽 자식 - 부모
 */

public class DFS1 {

    static Tree tree = new Tree();

    private void DFS(Node root) {

        if (root == null) {
            return;
        } else {

            //전위 순회
            //System.out.println(root.data + " ");

            DFS(root.lt);
            //중위 순회
            //System.out.println(root.data + " ");

            DFS(root.rt);
            //후위 순회
//            System.out.println(root.data + " ");
        }


    }

    public static void main(String[] args) {


        Node root = tree.root;
        DFS1 sol = new DFS1();
        sol.DFS(root);

    }

}
