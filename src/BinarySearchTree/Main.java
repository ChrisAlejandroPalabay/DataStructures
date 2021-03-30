package BinarySearchTree;



public class Main {

    public static void main(String[] args) {

        BinarySearchTree<FamilyMember> familyTree = new BinarySearchTree();


        familyTree.traverseAdd(familyTree.head,new FamilyMember("ac",21));
        familyTree.traverseAdd(familyTree.head,new FamilyMember("Aundrea",21));
        familyTree.traverseAdd(familyTree.head,new FamilyMember("Nicole",21));

        System.out.println(familyTree.head.left.data);
    }
}
