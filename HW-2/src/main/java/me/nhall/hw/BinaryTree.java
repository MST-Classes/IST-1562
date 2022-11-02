package me.nhall.hw;

public class BinaryTree {
    public static void main(String[] args) {
        Node root1 = new Node(1);
        root1.left = new Node(3);
        root1.right = new Node(2);

        int target = 3;
        Node output = nodeExists(root1, target);
        checkOutput(output);


        Node root2 = new Node(1);
        root2.left = new Node(2);
        root2.left.left = new Node(3);
        root2.left.right = new Node(4);

        target = 3;
        output = nodeExists(root1, target);
        checkOutput(output);

    }

    public static Node nodeExists(Node node, int target){
        if(node == null) {
            return null;
        }
        if(node.value == target) {
            return node;
        }
        Node temp = nodeExists(node.left, target);
        if(temp != null) return nodeExists(temp, target);

        temp = nodeExists(node.right, target);
        if(temp != null) return nodeExists(temp, target);

        return null;
    }

    public static void checkOutput(Node output) {
        if (output != null) {
            System.out.println("Node " + output.value + " Found in Tree");
        } else {
            System.out.println("null");
        }
    }
}