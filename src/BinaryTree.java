public class BinaryTree {

    public TreeNode root;

    public void createBinaryTree(){
        TreeNode first = new TreeNode(1);
        TreeNode second = new TreeNode(2);
        TreeNode third= new TreeNode(3);
        TreeNode fourth = new TreeNode(4);
        TreeNode fifth= new TreeNode(5);

        first = root;
        first.left = second;
        first.right = third;
        second.left = fourth;
        third.right = fifth;
    }


}
