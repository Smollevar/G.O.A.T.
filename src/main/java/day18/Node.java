package day18;

public class Node {
    private int node;
    Node left;
    Node right;
    private boolean wasHere;


    public Node(int node) {
        this.node = node;
        left = null;
        right = null;
    }

    public int getNode() {
        return node;
    }
}
