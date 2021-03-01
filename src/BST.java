public class BST {
    public BSTNode root;


    public BST(){

    }


    public BSTNode createNode(int data){
        BSTNode node = new BSTNode();
        node.data = data;
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

    public BSTNode deleteNode(BSTNode node,int data){

        if (node == null){
            return null;
        }
        if(data < node.data){
            node.left = deleteNode(node.left,data);
        }else if(data > node.data){
            node.right = deleteNode(node.right,data);
        }else {
            if (node.left == null || node.right == null){

                BSTNode temp = null;
                temp = node.left == null ? node.right : node.left;

                if(temp == null){
                    return null;
                }else{
                    return node;
                }
            }else {
                BSTNode successor = getSuccessor(node);
                node.data = successor.data;
                node.right = deleteNode(node.right,4);
            }

        }
        return node;
    }

    public BSTNode getSuccessor(BSTNode node){
        if(node == null){
            return null;
        }
         BSTNode temp =  node.right;

        while(temp != null){

            temp = temp.left;
        }
        return temp;
    }

    public void printInorder(BSTNode node){
        if(node == null){
            return;
        }
        printInorder(node.left);
        System.out.println(node.data + "");
        printInorder(node.right);
    }
}

