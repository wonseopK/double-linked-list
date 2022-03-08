package linkedList;

public class Node {
    private final int data;
    private Node prevNode;
    private Node nextNode;

    public Node(int data) {
        this.data = data;
        this.prevNode = null;
        this.nextNode = null;
    }

    public void changePrevNode(Node node) {
        this.prevNode = node;
    }

    public void changeNextNode(Node node) {
        this.nextNode = node;
    }

    public int getData() {
        return data;
    }
}
