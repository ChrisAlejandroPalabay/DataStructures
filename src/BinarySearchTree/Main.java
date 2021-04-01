package BinarySearchTree;



public class Main {

    public static void main(String[] args) {

        BinarySearchTree<FamilyMember> familyTree = new BinarySearchTree();


        familyTree.traverseAdd(new FamilyMember("ac",21));
        familyTree.traverseAdd(new FamilyMember("Aundrea",21));
        familyTree.traverseAdd(new FamilyMember("Nicole",21));

        familyTree.print();
    }
}
