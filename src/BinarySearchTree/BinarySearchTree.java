package BinarySearchTree;

import java.util.ArrayList;
import java.util.List;

public class BinarySearchTree<T> {
    public Node head;
    public List<Node> binaryTreeNode = new ArrayList<>();

    public void add(T data){
        Node nodeToAdd = new Node(data);
        binaryTreeNode.add(nodeToAdd);
    }

    public void printTree(){
        for(int i =0;i<binaryTreeNode.size();i++){
            System.out.println(binaryTreeNode.get(i).data);
        }
    }
    public void traverse(Node toTraverse){
        if(binaryTreeNode != null){
            head = binaryTreeNode.get(0);
            toTraverse = head;
            if(toTraverse.left != null){
                traverse(toTraverse.left);
            }
            if(toTraverse.right != null){
                traverse(toTraverse.right);
            }
        }else {
            System.out.println("Tree Empty");
        }
    }


/**
    private void traverseAndAdd(Node traverseNode, Node nodeToAdd){
        if(nodeToAdd.data < traverseNode.data){

            if(traverseNode.left == null){
                traverseNode.left = nodeToAdd;
            }else {
                traverseAndAdd(traverseNode.left,nodeToAdd);
            }
        }else if(nodeToAdd.data > traverseNode.data){

            if(traverseNode.right == null){
                traverseNode.right = nodeToAdd;
            }else {
                traverseAndAdd(traverseNode.right,nodeToAdd);
            }
        }
    }
    public void traverse(){

        if(root != null) {
            Node nodeToTraverse = root;
            if (nodeToTraverse.left == null && nodeToTraverse.right == null) {
                System.out.println(nodeToTraverse.data);
            }else {
                if (nodeToTraverse.left != null) {
                    inOrderTraverse(nodeToTraverse.left);
                }
                if (nodeToTraverse.right != null) {
                    inOrderTraverse(nodeToTraverse.right);
                }
            }
        }

    }
    private void inOrderTraverse(Node node){

        if(node.left != null){
            inOrderTraverse(node.left);
        }
        System.out.println(node.data);

        if(node.right != null){
            inOrderTraverse(node.right);
        }
    }
 **/
}
