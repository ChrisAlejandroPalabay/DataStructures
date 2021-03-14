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
    public void printTree(List list){
        List listToPrint = list;
        if(list == null){
            System.out.println("Empty");
        }else {
            for (int i=0;i<listToPrint.size();i++){
                System.out.println(listToPrint.get(i));
            }
        }


    }
    public List traverse(){
        List<Node> newList = new ArrayList();
        if(binaryTreeNode == null || binaryTreeNode.size() <= 1){
            System.out.println("There are no nodes in the tree");
        }else{
            int size = binaryTreeNode.size();
            for (int i=1;i < size;i++){
                for (int j=2;j < size;j++){
                    if(binaryTreeNode.get(i) != null && binaryTreeNode.get(j) != null){
                        newList = compare(binaryTreeNode.get(i),binaryTreeNode.get(j));
                    }else {
                        return newList;
                    }
                }
            }

        }
        return newList;
    }
    private List compare(Node num1,Node num2){
        int index = 1;
        List<Node> newList = new ArrayList();
        if((Integer)num1.data < (Integer)num2.data){
            newList.set(index,num1);
            newList.set(index+1,num2);
        }else {
            newList.set(index,num2);
            newList.set(index+1,num1);
        }
        return newList;
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
