package BinarySearchTree;

public class Main {

    public static void main(String[] args) {

        BinarySearchTree tree = new BinarySearchTree();

        tree.add(30);
        tree.add(12);
        tree.add(21);

        System.out.println(tree.root.left.data);

    }
}
