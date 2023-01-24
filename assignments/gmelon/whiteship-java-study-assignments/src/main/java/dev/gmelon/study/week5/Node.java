package dev.gmelon.study.week5;

public class Node {

    private final Node left;
    private final Node right;
    private final int value;

    public Node(int value) {
        this(null, null, value);
    }

    public Node(Node left, Node right, int value) {
        this.left = left;
        this.right = right;
        this.value = value;
    }

    public Node leftChild() {
        return left;
    }

    public Node rightChild() {
        return right;
    }

    public int value() {
        return value;
    }
}
