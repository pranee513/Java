package datastructures;

public class CircularLL {
    public boolean isCircular(Node node) {
        Node first = node, second = node;
 
        while (first != null && first.getLink() != null && second.getLink() != null && second.getLink().getLink() != null) {
            first = first.getLink();
            second = second.getLink().getLink();
            if (first.hashCode() == second.hashCode()) {
                return true;
            }
        }
 
        return false;
    }
 
    public static void main(String[] args) {
        Node node1 = new Node(1, null);
        Node node2 = new Node(2, node1);
        Node node3 = new Node(3, node2);
        node1.setLink(node2);
 
        CircularLL circularLL = new CircularLL();
        System.out.println(circularLL.isCircular(node3));
    }
}
 
 class Node {
    private int value;
    private Node link;
 
    public Node(int value, Node n) {
        this.value = value;
        this.link = n;
    }
 
    public int getValue() {
        return value;
    }
 
    public void setValue(int value) {
        this.value = value;
    }
 
    public Node getLink() {
        return link;
    }
 
    public void setLink(Node link) {
        this.link = link;
    }
}