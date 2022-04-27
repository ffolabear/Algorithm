package Lecture.bfs;

class Node {

    int data;
    Node lt;
    Node rt;

    public Node(int data) {
        this.data = data;
        this.lt = null;
        this.rt = null;
    }

}

class Tree {

    Node root;

    public Tree() {

        this.root = new Node(1);
        this.root.lt = new Node(2);
        this.root.rt = new Node(3);

        this.root.lt.lt = new Node(4);
        this.root.lt.rt = new Node(5);

        this.root.rt.lt = new Node(6);
        this.root.rt.rt = new Node(7);

    }
}
