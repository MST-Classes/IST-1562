package me.nhall.hw;

public class BinarySearch {
    public static boolean nodeExists(Node root, int target) {
        if (root == null) {
            System.out.println("null");
            return false;
        } else {
            if (root.value == target) {
                System.out.println("Node " + target + " Found in Tree");
                return true;
            } else if (root.value < target)
                return nodeExists(root.right, target);
            else
                return nodeExists(root.left, target);
        }

    }


    public static void main(String[] args) {
        Node root1 = new Node(2);
        root1.left = new Node(1);
        root1.right = new Node(3);

        int target = 3;
        nodeExists(root1, target);


        Node root2 = new Node(5);
        root2.left = new Node(3);
        root2.left.left = new Node(2);
        root2.left.right = new Node(4);

        target = 3;
        nodeExists(root2, target);
    }
}