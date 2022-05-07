package Lecture;



public class Tree {

    public class Node {

        public int data;
        public Node lt;
        public Node rt;

        public Node(int data) {
            this.data = data;
            this.lt = null;
            this.rt = null;
        }

    }

    public Node root;

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
