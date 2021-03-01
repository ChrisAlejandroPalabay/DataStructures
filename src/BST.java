public class BST {
    public BSTNode root;


    public BST(){

    }


    public BSTNode createNode(int data){
        BSTNode node = new BSTNode(data);
        node.left = null;
        node.right = null;
        return node;

    }

    public BSTNode insertNode(BSTNode node, int data){
        if(node == null){
            return createNode(data);
        }
        if(data < node.data){
            node.left = insertNode(node.left,data);
        }else if(data > node.data){
            node.right = insertNode(node.right,data);
        }
        return node;
    }
}

