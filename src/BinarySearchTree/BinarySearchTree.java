package BinarySearchTree;


public class BinarySearchTree<T> {
    public Node<T> head;


    public void traverseAdd(Node<T> currNode,T data){
        Node temp = new Node(data);
        Node toAdd = temp;
        if(head == null){
            head = toAdd;
        }else {
            if(currNode.left != null) {
                traverseAdd(currNode.left, data);
            }else if(currNode.left == null){
                currNode.left = toAdd;
            }else if(currNode.right != null){
                traverseAdd(currNode.right,data);
            }else if(currNode.right == null ){
                currNode.right = toAdd;
            }
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
        if(curr.left == null){
            System.out.println(curr.data);
        }
        if (curr.right != null){
            printValues(curr.right);
        }
        if (curr.right == null){
            System.out.println(curr.data);
        }
    }


}
