package BinarySearchTree;



public class Main {

    public static void main(String[] args) {

        BinarySearchTree<FamilyMember> familyTree = new BinarySearchTree();


        familyTree.traverseAdd(new FamilyMember("ac",21));
        familyTree.traverseAdd(new FamilyMember("Aundrea",21));
        familyTree.traverseAdd(new FamilyMember("Nico",21));
        familyTree.traverseAdd(new FamilyMember("cole",21));
        familyTree.traverseAdd(new FamilyMember("ole",21));

        System.out.println(familyTree.head.left.data);
    }
}
