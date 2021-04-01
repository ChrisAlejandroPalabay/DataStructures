package BinarySearchTree;


import java.util.ArrayList;

public class BinarySearchTree<T> {
    public Node<T> head;


    public void traverseAdd(T data){
        Node toAdd = new Node(data);
        if(head == null){
            head = toAdd;
        }else{
            add(head,toAdd);
        }

    }
    private void add(Node<T> nodeToTraverse, Node nodeToAdd){
        if(nodeToTraverse.left != null) {
            add(nodeToTraverse.left, nodeToAdd);
        }else if(nodeToTraverse.left == null){
            nodeToTraverse.left = nodeToAdd;
        }else if(nodeToTraverse.right != null){
            add(nodeToTraverse.right,nodeToAdd);
        }else if(nodeToTraverse.right == null ){
            nodeToTraverse.right = nodeToAdd;
        }
    }


    public void print(){
        if(head != null){
            printValues(head);
        }else {
            System.out.println("Empty");
        }

    }

    private void printValues(Node curr){

        if(curr.left != null){
            printValues(curr.left);
        }

        System.out.println(curr.data);

        if(curr.right != null){
            printValues(curr.right);
        }

    }


}
