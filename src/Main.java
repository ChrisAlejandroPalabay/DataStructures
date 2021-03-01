
public class Main {

    public static void main(String[] args){

        BST tree = new BST();
        BSTNode node1 = new BSTNode();

        node1 = tree.insertNode(node1,20);
        node1 = tree.insertNode(node1,1);
        node1 = tree.insertNode(node1,3);
        node1 = tree.insertNode(node1,5);
        node1 = tree.insertNode(node1,6);
        node1 = tree.insertNode(node1,34);
        node1 = tree.insertNode(node1,89);

        tree.printInorder(node1);










    }
}

