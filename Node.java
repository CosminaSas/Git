public class Node {
    int key, height;
    Node right, left, parent;

    public Node (int key)
    {
        this.key = key;
        this.height = 1;
    }
}
