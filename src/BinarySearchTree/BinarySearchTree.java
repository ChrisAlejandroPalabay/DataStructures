package BinarySearchTree;

public class BinarySearchTree {
    Node root;

    public void add(int data){

        Node nodeToAdd = new Node(data);
        if(root == null){
            root = nodeToAdd;
        }

        traverseAndAdd(root,nodeToAdd);

    }

    private void traverseAndAdd(Node node,Node nodeToAdd){
        if(nodeToAdd.data < node.data){

            if(node.left == null){
                node.left = nodeToAdd;
            }else {
                traverseAndAdd(node.left,nodeToAdd);
            }

        }else if(nodeToAdd.data > node.data){

            if (node.right == null){
                node.right = nodeToAdd;
            }else {
                traverseAndAdd(node.right,nodeToAdd);
            }

        }

    }
}
