package lab;


public class Lab5 {
    public static void main(String[] args) {
        example1();
        example2();
    }

    public static void example1() {
        Tree tree = new Tree();

        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);

        System.out.println("Postorder output");
        tree.postorder(tree.root);
        System.out.println();
    }

    public static void example2() {
        Tree tree = new Tree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);

        tree.root.left.left = new Node(3);
        tree.root.left.right = new Node(4);

        System.out.println("Postorder output");
        tree.postorder(tree.root);
        System.out.println();
    }

    static class Node {
        int item;
        Node left;
        Node right;

        public Node(int key) {
            item = key;
            left = right = null;
        }
    }

    static class Tree {
        Node root;

        Tree() {
            root = null;
        }

        void postorder(Node node) {
            if (node == null)
                return;

            postorder(node.left);
            postorder(node.right);

            System.out.print(node.item + ",");
        }
    }

}